package com.jourio.roope.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked, so update the fact TextView with a new fact
                String fact = "Ostriches can run faster than horses.";
                mFactTextView.setText(fact); // Sets the text to "fact" var when button is clicked.
            }
        };

        mShowFactButton.setOnClickListener(listener);


    }



}
