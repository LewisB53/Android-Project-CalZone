package com.example.user.calzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MealsActivity extends AppCompatActivity {
    private ArrayList<Meal> list = new ArrayList<Meal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_list);

        DefaultMeals defaultMeals = new DefaultMeals();
        list.addAll( defaultMeals.getList());


        MealsAdapter mealAdapter = new MealsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mealAdapter);
    }



    public void getMeal(View listItem) {
        Meal meal = (Meal) listItem.getTag();
        Log.d("Meal Title: ", meal.getMealName());
        Intent intent = new Intent (this, MealSelectedActivity.class); // could this link to java class adding cals to total?
        intent.putExtra("meal", meal);
        startActivity(intent);
    }

    public void onAddMealButtonClicked(View button) {
        list.add(new Meal("Added 'n' cool", 400, "Dinner"));

        Intent intent = new Intent(this, MealSelectedActivity.class);
        startActivity(intent);
    }
}