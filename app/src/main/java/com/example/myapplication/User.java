package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    private Integer id;
    private String name;
    private String bio;

    //integers are recipeId
    //ArrayList<Integer> recipeBook = new ArrayList<>();

    String profilePic;

    public User(Integer id, String name, String bio) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        System.out.println(name);
    }

    public void setBio(String newBio){
        bio = newBio;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public String getBio(){
        return bio;
    }

    public Integer getId(){
        return id;
    }

}

