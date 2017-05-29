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

public class MealsActivity extends AppCompatActivity {
    public ArrayList<Meal> list = new ArrayList<Meal>();

    private SharedPreferences prefs;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_list);

        DefaultMeals defaultMeals = new DefaultMeals();
        list.addAll( defaultMeals.getList());

        Intent intent = getIntent();
        Serializable extra = intent.getSerializableExtra("newMeal");
        if (null != extra) {
            Meal newMeal = (Meal)extra;
            list.add(newMeal);
        }

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
