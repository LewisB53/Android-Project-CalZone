package com.example.user.calzone;

import java.io.Serializable;

/**
 * Created by user on 26/05/2017.
 */

public class Meal implements Serializable {

    private String mealName;
    private int caloricValue;
    private String mealType;

    public Meal(String mealName, int caloricValue, String mealType) {
        this.mealName = mealName;
        this.caloricValue = caloricValue;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public Integer getCaloricValue() {
        return caloricValue;
    }

    public String getMealType() {
        return mealType;
    }

}
