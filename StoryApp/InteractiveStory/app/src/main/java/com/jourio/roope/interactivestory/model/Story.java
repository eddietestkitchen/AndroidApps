package com.jourio.roope.interactivestory.model;

import com.jourio.roope.interactivestory.R;

public class Story {
    private Page[] pages;

    public Story() {
        pages = new Page[7];

        pages[0] = new Page();
        pages[0].setImageId(R.drawable.page0);
        pages[0].setTextId(R.string.page0);
        pages[0].setChoice1(new Choice());
        pages[0].setChoice2(new Choice());
    }
}
