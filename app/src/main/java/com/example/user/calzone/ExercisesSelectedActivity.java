package com.example.user.calzone;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;


public class ExercisesSelectedActivity extends AppCompatActivity {
    EditText addedMealEditText;
    EditText caloricValueEditText;
    EditText exerciseDateEditText;
//    SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_meal);

//        this.prefs = getPreferences(MODE_PRIVATE);

        addedMealEditText = (EditText)findViewById(R.id.meal_name_text);
        caloricValueEditText = (EditText)findViewById(R.id.caloric_value_text);
        exerciseDateEditText = (EditText)findViewById(R.id.exercise_date_text);
    }

}