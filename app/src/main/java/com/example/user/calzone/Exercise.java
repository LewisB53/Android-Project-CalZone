package com.example.user.calzone;

import java.io.Serializable;

/**
 * Created by user on 30/05/2017.
 */

public class Exercise implements Serializable {

    private String mealName;
    private int caloricValue;
    private String mealType;

    public Exercise(String mealName, int caloricValue, String mealType) {
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
