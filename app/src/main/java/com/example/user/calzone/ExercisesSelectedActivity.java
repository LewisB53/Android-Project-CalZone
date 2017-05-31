package com.example.user.calzone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class ExercisesSelectedActivity extends AppCompatActivity {
    EditText exerciseNameEditText;
    EditText caloricValueEditText;
    EditText exerciseDateEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_exercise);

        exerciseNameEditText = (EditText)findViewById(R.id.exercise_name_text);
        caloricValueEditText = (EditText)findViewById(R.id.caloric_value_text);
        exerciseDateEditText = (EditText)findViewById(R.id.exercise_date_text);
    }

}