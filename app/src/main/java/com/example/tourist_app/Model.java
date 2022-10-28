package com.example.tourist_app;

public class Model {

    private String card_title;
    private int card_image;
    private String card_desc;

    // Constructor
    public Model(String card_title, int card_image, String card_desc) {
        this.card_title = card_title;
        this.card_image = card_image;
        this.card_desc = card_desc;
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

    public String getCard_desc() {
        return card_desc;
    }

    public void setCard_desc(String card_desc) {
        this.card_desc = card_desc;
    }
}

