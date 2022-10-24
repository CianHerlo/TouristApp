package com.example.tourist_app;

public class Model {

    private String card_title; //course_name
    private int card_image; // course_image;

    // Constructor
    public Model(String card_title, int course_image) {
        this.card_title = card_title;
        this.card_image = card_image;
    }

    // Getter and Setter
    public String getCard_title() {
        return card_title;
    }

    public void setCard_title(String card_title) {
        this.card_title = card_title;
    }

    public int getCard_image() {
        return card_image;
    }

    public void setCard_image(int card_image) {
        this.card_image = card_image;
    }
}

