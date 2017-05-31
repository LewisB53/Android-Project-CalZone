package com.example.user.calzone;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);
    }


    public void easterEgg(View button) {
        Intent intent = new Intent(this, MainActivity.class);
        Toast.makeText(this,"Easter egg found!", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}
