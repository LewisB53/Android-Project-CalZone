package com.example.user.calzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.google.gson.Gson;


public class MealSelectedActivity extends AppCompatActivity {
    EditText addedMealEditText;
    EditText caloricValueEditText;
    EditText mealTypeEditText;
    EditText mealDateEditText;

    SharedPreferences prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_meal);

        this.prefs = getPreferences(MODE_PRIVATE);

        addedMealEditText = (EditText)findViewById(R.id.meal_name_text);
        caloricValueEditText = (EditText)findViewById(R.id.caloric_value_text);
        mealTypeEditText = (EditText)findViewById(R.id.meal_type_text);
        mealDateEditText = (EditText)findViewById(R.id.date_text);

    }


    public void onAddButtonClicked(View button) {

        String addedMeal = addedMealEditText.getText().toString();
        String caloricValue = caloricValueEditText.getText().toString();
        String addedMealType = mealTypeEditText.getText().toString();
        String mealDate = mealDateEditText.getText().toString();


        Meal meal = new Meal(addedMeal, Integer.parseInt(caloricValue), addedMealType, mealDate);

        SharedPreferences.Editor prefsEditor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(meal); //Instance of Meal
        prefsEditor.putString("meal", json);
        prefsEditor.apply();

        Toast.makeText(this,"Meal scoffed!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MealsActivity.class);

        intent.putExtra("newMeal", meal);
        startActivity(intent);
    }

}
