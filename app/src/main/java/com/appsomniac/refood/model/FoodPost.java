package com.appsomniac.refood.model;

import java.util.ArrayList;

/**
 * Created by absolutelysaurabh on 20/10/17.
 */

public class FoodPost {

    private String foodType;
    private String foodPostedByName;
    private String foodDescription;
    private String foodQunatity;
    private String foodLocation;
    private String contact;
    private String foodPostedByUserId;
    private ArrayList<String> al_imageEncoded;

    public FoodPost(String foodType, String foodQunatity, String foodPostedByName, String foodPostedByUserId, String foodLocation, String contact, String foodDescription, ArrayList<String> al_imageEncoded){

        this.foodType = foodType;
        this.foodQunatity = foodQunatity;
        this.foodLocation = foodLocation;
        this.contact = contact;
        this.foodDescription = foodDescription;
        this.foodPostedByName = foodPostedByName;
        this.foodPostedByUserId = foodPostedByUserId;
        this.al_imageEncoded = al_imageEncoded;

    }

    public FoodPost(){
        //empty constructor
    }

    public String getFoodType(){
        return foodType;
    }

    public String getFoodPostedByName(){
        return foodPostedByName;
    }

    public String getFoodPostedByUserId(){
        return foodPostedByUserId;
    }

    public ArrayList<String> getAl_imageEncoded(){
        return al_imageEncoded;
    }

    public String getFoodDescription(){
        return foodDescription;
    }

    public String getFoodQunatity(){
        return foodQunatity;
    }

    public String getFoodLocation(){
        return foodLocation;
    }

    public String getContact(){
        return contact;
    }


}
