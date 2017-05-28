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
        list.add("Added 'n' cool", 400, "Dinner");

        Intent intent = new Intent(this, MealsActivity.class);
        startActivity(intent);
    }
}
