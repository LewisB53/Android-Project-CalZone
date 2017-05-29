package com.example.user.calzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MealSelectedActivity extends AppCompatActivity {
    EditText addedMealEditText;
    EditText caloricValueEditText;
    EditText mealTypeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_meal);

        addedMealEditText = (EditText)findViewById(R.id.meal_name_text);
        caloricValueEditText = (EditText)findViewById(R.id.caloric_value_text);
        mealTypeEditText = (EditText)findViewById(R.id.meal_type_text);


    }


    public void onAddButtonClicked(View button) {

        String addedMeal = addedMealEditText.getText().toString();
        String caloricValue = caloricValueEditText.getText().toString();
        String addedMealType = mealTypeEditText.getText().toString();

        Meal meal = new Meal(addedMeal, Integer.parseInt(caloricValue), addedMealType);
        Toast.makeText(this,"Meal Added", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MealsActivity.class);
        intent.putExtra("newMeal", meal);
        startActivity(intent);
    }
}
