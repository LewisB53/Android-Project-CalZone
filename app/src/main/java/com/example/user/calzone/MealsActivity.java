package com.example.user.calzone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayList;


public class MealsActivity extends AppCompatActivity {
    SharedPreferences prefs;
    public ArrayList<Meal> list;
    private Gson gson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_list);

        this.prefs = getPreferences(MODE_PRIVATE);

        // get list of Meals from Shared prefs.
        this.gson = new Gson();
        String json = prefs.getString("meals", "[]");
        TypeToken<ArrayList<Meal>> token = new TypeToken<ArrayList<Meal>>(){};
        list = gson.fromJson(json, token.getType());
        Log.d("Here", list.toString());

        if (list.isEmpty()) {
            DefaultMeals defaultMeals = new DefaultMeals();
            list.addAll( defaultMeals.getList());
        }

        Intent intent = getIntent();
        Serializable extra = intent.getSerializableExtra("newMeal");
        if (null != extra) {
            Meal newMeal = (Meal) extra;
            list.add(newMeal);
        }


        // save list array to Shared Prefs
        SharedPreferences.Editor editor = this.prefs.edit();
        editor.putString("meals", this.gson.toJson(list));
        editor.clear();

        editor.apply();


        MealsAdapter mealAdapter = new MealsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mealAdapter);
    }



    public void onEatButtonClicked(View listItem) {

        Toast.makeText(this,"You Ate it", Toast.LENGTH_LONG).show();
    Intent intent = new Intent(this, TrackerActivity.class);
        startActivity(intent);
}

    public void onAddMealButtonClicked(View button) {
        Intent intent = new Intent(this, MealSelectedActivity.class);
        startActivity(intent);
    }


}
