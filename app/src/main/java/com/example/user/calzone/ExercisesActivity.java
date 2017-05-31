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
        setContentView(R.layout.exercises_list);


        if (list.isEmpty()) {
            ExerciseList exerciseList = new ExerciseList();
            list.addAll( exerciseList.getList());
        }


        ExercisesAdapter exercisesAdapter = new ExercisesAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.exerciseList);
        listView.setAdapter(exercisesAdapter);
    }

}
