package com.jourio.roope.stormy.ui;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.jourio.roope.stormy.R;
import com.jourio.roope.stormy.adapters.DayAdapter;
import com.jourio.roope.stormy.weather.Day;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Optional;

public class DailyForecastActivity extends Activity {

    private Day[] mDays;

    @BindView(android.R.id.list) ListView mListView;

    @Nullable
    @BindView(android.R.id.empty) TextView mEmptyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Day[].class); // This is how we get an array of items from a parcelable extra on the intent.

        DayAdapter adapter = new DayAdapter(this, mDays);
        mListView.setAdapter(adapter);
        mListView.setEmptyView(mEmptyText);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String dayOfTheWeek = mDays[i].getDayOfTheWeek();
                String conditions = mDays[i].getSummary();
                String highTemp = mDays[i].getTemperatureMax() + "";
                String message = String.format("On %s the high will be %s and it will be be %s",
                        dayOfTheWeek,
                        highTemp,
                        conditions);

                Toast.makeText(DailyForecastActivity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
