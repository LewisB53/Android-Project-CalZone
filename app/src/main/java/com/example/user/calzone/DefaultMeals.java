package com.example.user.calzone;

import java.util.ArrayList;

/**
 * Created by user on 26/05/2017.
 */

public class DefaultMeals {

    private ArrayList<Meal> list;

    public DefaultMeals() {
        list = new ArrayList<Meal>();
        list.add(new Meal("Champions Brekkie", 550, "Breakfast","27/05/2017"));
        list.add(new Meal("The GutBuster", 800, "Lunch","27/05/2017"));
        list.add(new Meal("Chicken 'n' Chips", 700, "Dinner","27/05/2017"));
    }


    public ArrayList<Meal> getList() {
        return new ArrayList<Meal>(list);
    }

}
