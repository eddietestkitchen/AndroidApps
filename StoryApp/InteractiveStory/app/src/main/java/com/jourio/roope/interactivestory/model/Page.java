package com.jourio.roope.interactivestory.model;

public class Page {
    private int ImageId;
    private int textId;
    private Choice choice1;
    private Choice choice2;

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        this.ImageId = imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }
}