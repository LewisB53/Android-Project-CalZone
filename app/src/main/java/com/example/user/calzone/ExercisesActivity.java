package com.example.user.calzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.util.ArrayList;

public class ExercisesActivity extends AppCompatActivity {
    public ArrayList<Exercise> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_list);

//        if (list.isEmpty()) {
            ExerciseList exerciseList = new ExerciseList();
            list.addAll(exerciseList.getList());
//        }

//        Intent intent = getIntent();
//        Serializable extra = intent.getSerializableExtra("newMeal");
//        if (null != extra) {
//            Meal newMeal = (Meal) extra;
//            list.add(newMeal);
//        }
//
//
//        MealsAdapter mealAdapter = new MealsAdapter(this, list);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(mealAdapter);
    }



    public void getExercise(View listItem) {
        Exercise exercise = (Exercise) listItem.getTag();

        Intent intent = new Intent (this, ExercisesSelectedActivity.class); // could this link to java class adding cals to total?
        intent.putExtra("exercise", exercise);
        startActivity(intent);
    }

}
