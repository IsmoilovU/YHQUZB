package com.example.yhquzb.model;

public class BaseModel {
    private int id;
    private String title;
    private String iconUrl;
    private String imageUrl;
    private String text;

    public BaseModel(int id, String title, String iconUrl, String imageUrl, String text) {
        this.id = id;
        this.title = title;
        this.iconUrl = iconUrl;
        this.imageUrl = imageUrl;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
