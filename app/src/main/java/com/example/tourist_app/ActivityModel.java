package com.example.tourist_app;

public class ActivityModel {

    private String activity_title;
    private String activity_desc;
    private int activity_image;

    // Constructor
    public ActivityModel(String activity_title, String activity_desc, int activity_image) {
        this.activity_title = activity_title;
        this.activity_desc = activity_desc;
        this.activity_image = activity_image;
    }

    // Getter and Setter
    public String getActivity_title() {
        return activity_title;
    }

    public void setActivity_title(String activity_image) {
        this.activity_title = activity_title;
    }

    public int getActivity_image() {
        return activity_image;
    }

    public void setActivity_image(int activity_image) {
        this.activity_image = activity_image;
    }

    public String getActivity_desc() {
        return activity_desc;
    }

    public void setActivity_desc(String activity_desc) {
        this.activity_desc = activity_desc;
    }
}

