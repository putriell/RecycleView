package com.example.recycleview;

public class Berita {
    private String tittle, desc;
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }

    public String getTittle(){
        return tittle;
    }

    public void setTittle(String tittle){
        this.tittle = tittle;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc( String desc){
        this.desc = desc;
    }
}
