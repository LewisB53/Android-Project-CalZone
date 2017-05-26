package com.example.user.calzone;

/**
 * Created by user on 26/05/2017.
 */

public class Meal {

    private String mealName ;
    private int caloricValue;
    private String mealType;

    public Movie(String mealName, Integer caloricValue, String mealType) {
        this.mealName = mealName;
        this.caloricValue = caloricValue;
        this.mealType = mealType;
    }


    public String getName() {
        return mealName;
    }
}
