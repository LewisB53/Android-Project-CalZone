package com.example.user.calzone;

import java.util.ArrayList;

/**
 * Created by user on 26/05/2017.
 */

public class ExerciseList {

    private ArrayList<Exercise> exerciselist;

    public ExerciseList() {
        exerciselist = new ArrayList<Exercise>();
        exerciselist.add(new Exercise("Byebye Spare Tire", 450, "Cardio"));
        exerciselist.add(new Exercise("Fat buster", 800, "Cardio"));
        exerciselist.add(new Exercise("Crunch before brunch", 700, "Strength"));
        exerciselist.add(new Exercise("The Contender", 700, "Technique"));
    }


    public ArrayList<Exercise> getList() {
        return new ArrayList<Exercise>(exerciselist);
    }

}
