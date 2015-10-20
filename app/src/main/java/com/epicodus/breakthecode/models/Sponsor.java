package com.epicodus.breakthecode.models;

/**
 * Created by Guest on 10/20/15.
 */
public class Sponsor {
    private String mName, mDescription, mWebsite;
    private int mImage;

    public Sponsor (String name, String description, String website, int image){
        mName = name;
        mDescription = description;
        mWebsite = website;
        mImage = image;
    }


    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }
}
