package com.example.user.calzone;

import java.util.ArrayList;

/**
 * Created by user on 26/05/2017.
 */

public class DefaultMeals {

    private ArrayList<Meal> list;

    public DefaultMeals() {
        list = new ArrayList<Meal>();
        list.add(new Meal("Champions Brekkie", 550, "Breakfast"));
        list.add(new Meal("The GutBuster", 800, "Lunch"));
        list.add(new Meal("Chicken 'n' Chips", 700, "Dinner"));
    }


    public ArrayList<Meal> getList() {
        return new ArrayList<Meal>(list);
    }

}
