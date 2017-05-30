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

public class TrackerActivity extends AppCompatActivity {

    SharedPreferences eatPrefs;
    public ArrayList<Meal> list;
    private Gson eatGson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_list);

        this.eatPrefs = getPreferences(MODE_PRIVATE);

        // get list of Meals from Shared prefs.
        this.eatGson = new Gson();
        String json = eatPrefs.getString("meals", "[]");
        TypeToken<ArrayList<Meal>> token = new TypeToken<ArrayList<Meal>>(){};
        list = eatGson.fromJson(json, token.getType());
        Log.d("Here", list.toString());

        if (list.isEmpty()) {

        }

        Intent intent = getIntent();
        Serializable extra = intent.getSerializableExtra("newMeal");
        if (null != extra) {
            Meal newMeal = (Meal) extra;
            list.add(newMeal);
        }


        // save list array to Shared Prefs
        SharedPreferences.Editor editor = this.eatPrefs.edit();
        editor.putString("meals", this.eatGson.toJson(list));
//        editor.clear();

        editor.apply();


        MealsAdapter mealAdapter = new MealsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(mealAdapter);
    }



}
