package com.example.user.calzone;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TrackerActivity extends AppCompatActivity {

    EditText addedMealEditText;
    EditText caloricValueEditText;
    EditText mealTypeEditText;
    SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);


        this.prefs = getPreferences(MODE_PRIVATE);

        addedMealEditText = (EditText)findViewById(R.id.meal_name_text);
        caloricValueEditText = (EditText)findViewById(R.id.caloric_value_text);
        mealTypeEditText = (EditText)findViewById(R.id.meal_type_text);
    }

}
