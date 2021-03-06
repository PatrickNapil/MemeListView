package com.example.student.listview.Models;

import java.io.Serializable;

/**
 * Created by student on 2/14/15.
 */
public class Meme implements Serializable {

    public static final String KEY = "Meme";

    protected String name;
    protected String description;
    protected int image_ref;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage_ref() {
        return image_ref;
    }

    public void setImage_ref(int image_ref) {
        this.image_ref = image_ref;
    }
}
