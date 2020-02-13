package com.example.yhquzb.model;

import com.example.yhquzb.R;

import java.util.ArrayList;

public class ListData {
    private String name;
    private int image;

    public ListData(String s,int image) {
        this.name = s;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getImage(){return image;}

    public void setImage(int image) {
        this.image = image;
    }

    public static ArrayList<ListData> getData(){
        ArrayList<ListData> list=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new ListData("lorem impus - "+i, R.drawable.danh));
        }

        return list;
    }
}

