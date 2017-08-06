package com.jourio.roope.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    // Declare our View Variables
    private TextView mFactTextView;
    private Button mShowFactButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variables.
        mFactTextView = (TextView) findViewById(R.id.factTextView):

    }



}
