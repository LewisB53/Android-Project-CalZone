package com.example.user.calzone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 27/05/2017.
 */

public class ExercisesAdapter extends ArrayAdapter<Exercise> {
    public ExercisesAdapter(Context context, ArrayList<Exercise> exercises) {
        super(context, 0, exercises);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.exercise_items, parent, false);
        }

        Exercise currentExercise = getItem(position);

        TextView exerciseName = (TextView) listItemView.findViewById(R.id.exerciseName);
        exerciseName.setText(currentExercise.getExerciseName());

        TextView caloricValue = (TextView) listItemView.findViewById(R.id.caloricvalue);
        caloricValue.setText(currentExercise.getCaloricValue().toString());

        TextView exerciseDate = (TextView) listItemView.findViewById(R.id.mealType);
        exerciseDate.setText(currentExercise.getExerciseDate());

        listItemView.setTag(currentExercise);

        return listItemView;
    }

}
