package com.example.beknazar.recyclerviewendproject;

import java.util.ArrayList;
import java.util.List;

public class ModelItem {
    private String author;
    private  int imgId;

    public ModelItem(String author, int imgId){
        this.author=author;
        this.imgId=imgId;
    }

    public int getImgId(){

        return imgId;
    }

    public String getAuthor()
    {
        return author;

    }
    public static List<ModelItem> getFakeItems(){
        ArrayList<ModelItem> itemList= new ArrayList<>();
        itemList.add(new ModelItem("Zayn.", R.drawable.zaynnnn));
        itemList.add(new ModelItem("Besim Mazgiqi.", R.drawable.europa));
        itemList.add(new ModelItem("Bebe.", R.drawable.europaaaaa));
        itemList.add(new ModelItem("Vintage.", R.drawable.europeee));
        itemList.add(new ModelItem("Rihanna.", R.drawable.europeplus));
        itemList.add(new ModelItem("Zayn.", R.drawable.zaynnnn));
        itemList.add(new ModelItem("Besim Mazgiqi.", R.drawable.europa));
        itemList.add(new ModelItem("Bebe.", R.drawable.europaaaaa));
        itemList.add(new ModelItem("Vintage.", R.drawable.europeee));
        itemList.add(new ModelItem("Rihanna.", R.drawable.europeplus));
        return itemList;

    }
}





