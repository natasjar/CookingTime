package com.example.myapplication;

import java.util.ArrayList;

public class Recipe {
    Integer id;
    Integer authorId;
    Integer bookId;
    String image;
    String instructions;
    ArrayList<Integer> cookingTimes = new ArrayList<>();
    ArrayList<Ingredients> ingredients = new ArrayList<>();
    Boolean isVerified;


}
