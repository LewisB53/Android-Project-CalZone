package com.example.user.calzone;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button foodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodButton = (Button)findViewById(R.id.foodButton);
    }



    public void onFoodButtonClicked(View button) {
        Intent intent = new Intent(this, MealsActivity.class);
        startActivity(intent);
    }

}
