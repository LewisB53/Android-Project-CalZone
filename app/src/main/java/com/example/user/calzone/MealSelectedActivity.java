package com.example.user.calzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MealSelectedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_meal);
    }


    public void onAddButtonClicked(View button) {
//        list.add(new Meal("Added 'n' cool", 400, "Dinner"));

        Intent intent = new Intent(this, MealsActivity.class);
        startActivity(intent);
    }
}
