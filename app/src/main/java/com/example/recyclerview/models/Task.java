package com.example.recyclerview.models;

import java.util.Random;

public class Task {
    private String title;
    private String textOfTask;
    private int imageURI;

    public Task(String title,String textOfTask) {
        this.title = title;
        this.textOfTask=textOfTask;
        imageURI=new Random().nextInt(99999)+1000;
    }

    public String getTitle() {
        return title;
    }

    public String getTextOfTask() {
        return textOfTask;
    }

    public int getImageURI() {
        return imageURI;
    }
}
