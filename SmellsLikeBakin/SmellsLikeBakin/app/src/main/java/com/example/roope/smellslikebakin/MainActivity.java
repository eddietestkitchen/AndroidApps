package com.example.roope.smellslikebakin;

import android.app.Activity;
import android.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListFragment.OnRecipeSelectedInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bug fix, fragments no longer stack in activity when phone is rotated.
        ListFragment savedFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.placeHolder);
        if (savedFragment == null) {
            ListFragment fragment = new ListFragment();
            FragmentManager fragmentManager = getSupportFragmentManager(); // changed to getSupportFragmentManager so back button works correctly, the top bar no longer disappears. :)
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.placeHolder, fragment);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void OnListRecipeSelected(int index) { // This method takes you to new activity, recipe etc.
        Toast.makeText(MainActivity.this, Recipes.names[index], Toast.LENGTH_SHORT).show(); // Toast message what recipe was clicked.
        ViewPagerFragment fragment = new ViewPagerFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeHolder, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
