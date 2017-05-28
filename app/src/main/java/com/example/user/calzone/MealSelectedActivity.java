package com.example.user.calzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MealSelectedActivity extends AppCompatActivity {
    public ArrayList<Meal> list = new ArrayList<Meal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_meal);
    }


    public void onAddButtonClicked(View button) {
        String addedMeal = "Custom";
        Integer addedCaloricValue = 500;
        String addedMealType = "Custom";

        list.add(new Meal(addedMeal, addedCaloricValue, addedMealType));

        Intent intent = new Intent(this, MealsActivity.class);
        startActivity(intent);
    }
}
