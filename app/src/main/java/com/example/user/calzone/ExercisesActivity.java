package com.example.user.calzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class ExercisesActivity extends AppCompatActivity {
    public ArrayList<Exercise> exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercises_list);

        exercises = new ArrayList<Exercise>();
        ExerciseList exerciseList = new ExerciseList();
        exercises.addAll( exerciseList.getList());

        ExercisesAdapter exercisesAdapter = new ExercisesAdapter(this,exercises);
        ListView listView = (ListView) findViewById(R.id.exerciseList);
        listView.setAdapter(exercisesAdapter);
    }


    public void getExercise(View listItem) {
        Toast.makeText(this,"Good job! You are less repulsive!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
