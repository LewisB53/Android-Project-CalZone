package com.example.user.calzone;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button foodButton;
    private Button trackerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodButton = (Button)findViewById(R.id.foodButton);
        trackerButton = (Button)findViewById(R.id.trackerButton);
    }



    public void onFoodButtonClicked(View button) {
        Intent intent = new Intent(this, MealsActivity.class);
        startActivity(intent);
    }

    public void onTrackerButtonClicked(View button) {
        Intent intent = new Intent(this, TrackerActivity.class);
        startActivity(intent);
    }

}
