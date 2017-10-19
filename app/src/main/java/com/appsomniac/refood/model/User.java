package com.appsomniac.refood.model;

/**
 * Created by absolutelysaurabh on 20/10/17.
 */
public class User {

    private String name;
    private String email;
    private String contactNo;
    private String avatarUrl;

    public User(String name, String email, String contact, String avatarUrl){

        this.name = name;
        this.email = email;
        this.contactNo = contact;
        this.avatarUrl = avatarUrl;
    }

    public User(){
        //empty constructor
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }

    public String getContactNo(){
        return contactNo;
    }

    public String getAvatarUrl(){
        return avatarUrl;
    }

    public void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
}
