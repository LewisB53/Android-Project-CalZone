package com.example.user.calzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_list);

        DefaultMeals defaultMeals = new DefaultMeals();
        ArrayList<Meal> list = defaultMeals.getList();

        MealsAdapter mealAdapter = new MealsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mealAdapter);
    }



    public void getMeal(View listItem) {
        Meal meal = (Meal) listItem.getTag();
        Log.d("Meal Title: ", meal.getMealName());

        Intent intent = new Intent (this, MealSelectedActivity.class);
        intent.putExtra("meal", meal);
        startActivity(intent);
    }
}
