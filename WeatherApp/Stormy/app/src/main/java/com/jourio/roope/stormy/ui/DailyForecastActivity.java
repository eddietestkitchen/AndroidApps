package com.jourio.roope.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.jourio.roope.stormy.R;
import com.jourio.roope.stormy.adapters.DayAdapter;
import com.jourio.roope.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        mDays = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}
