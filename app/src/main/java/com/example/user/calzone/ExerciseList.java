package com.example.user.calzone;

import java.util.ArrayList;

/**
 * Created by user on 26/05/2017.
 */

public class ExerciseList {

    private ArrayList<Meal> list;

    public ExerciseList() {
        list = new ArrayList<Meal>();
        list.add(new Exercise("Byebye Spare Tire", 450, "Cardio"));
        list.add(new Exercise("Fat buster", 800, "Cardio"));
        list.add(new Exercise("Crunch before brunch", 700, "Strength"));
        list.add(new Exercise("The Contender", 700, "Technique"));
    }


    public ArrayList<Meal> getList() {
        return new ArrayList<Exercise>(list);
    }

}
