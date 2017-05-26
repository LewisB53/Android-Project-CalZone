package com.example.user.calzone;

import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by user on 26/05/2017.
 */

class MealList {

    private ArrayList<Meal> meals;

    public MealList() {
        meals = new ArrayList<Meal>();
        meals.add(new Meal("The Sheriff", 565, "Lunch"));
        meals.add(new Meal("Super CalLowSnackDelicious", 240, "Brunch"));
        meals.add(new Meal("Powerhouse", 450, "Pre-workout"));
    }

    public ArrayList<Meal> getList() {
        return meals;
    }

}
