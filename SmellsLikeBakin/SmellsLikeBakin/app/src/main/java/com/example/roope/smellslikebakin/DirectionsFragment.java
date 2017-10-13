package com.example.roope.smellslikebakin;

/**
 * Created by roope on 13.10.2017.
 */

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split("`");
    }
}
