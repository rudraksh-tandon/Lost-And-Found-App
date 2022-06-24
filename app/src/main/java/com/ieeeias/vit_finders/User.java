package com.ieeeias.vit_finders;

public class User {
    private int imageView;
    private String brandView;
    private String locView;



    public User(int imageView, String nameView, String locView) {
        this.imageView = imageView;
        this.brandView = nameView;
        this.locView = locView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getNameView() {
        return brandView;
    }

    public void setNameView(String nameView){
        this.brandView = nameView;
    }

    public String getLocView() {
        return locView;
    }

    public void setLocView(String locView){
        this.locView = locView;
    }
}
