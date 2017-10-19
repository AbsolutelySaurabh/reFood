package com.appsomniac.refood.model;

/**
 * Created by absolutelysaurabh on 20/10/17.
 */

public class FoodPost {

    private String foodType;
    private String foodPostedBy;
    private String foodDescription;
    private String foodQunatity;
    private String foodLocation;
    private String contact;

    public FoodPost(String foodType, String foodQunatity, String foodPostedBy, String foodLocation, String contact, String foodDescription){

        this.foodType = foodType;
        this.foodQunatity = foodQunatity;
        this.foodLocation = foodLocation;
        this.contact = contact;
        this.foodDescription = foodDescription;
        this.foodPostedBy = foodPostedBy;

    }

    public FoodPost(){
        //empty constructor
    }

    public String getFoodType(){
        return foodType;
    }

    public String getFoodPostedBy(){
        return foodPostedBy;
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
