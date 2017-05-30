package com.example.user.calzone;

import java.io.Serializable;

/**
 * Created by user on 30/05/2017.
 */

public class Exercise implements Serializable {

    private String exerciseName;
    private int caloricValue;
    private String exerciseDate;

    public Exercise(String exerciseName, int caloricValue, String exerciseDate) {
        this.exerciseName = exerciseName;
        this.caloricValue = caloricValue;
        this.exerciseDate = exerciseDate;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public Integer getCaloricValue() {
        return caloricValue;
    }

    public String getExerciseDate() {
        return exerciseDate;
    }
}
