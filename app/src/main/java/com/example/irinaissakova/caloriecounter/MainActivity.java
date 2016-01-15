package com.example.irinaissakova.caloriecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int totalCalories = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add50Calories(View view) {
        totalCalories = totalCalories + 50;
        updateTotalCalories();
    }

    public void add100Calories(View view) {
        totalCalories = totalCalories + 100;
        updateTotalCalories();
    }

    public void sub50Calories(View view) {
        totalCalories = totalCalories - 50;
        updateTotalCalories();
    }

    public void sub100Calories(View view) {
        totalCalories = totalCalories - 100;
        updateTotalCalories();
    }

    public void resetCalories(View view) {
        totalCalories = 0;
        updateTotalCalories();
    }


    public void updateTotalCalories() {
        TextView v = (TextView) findViewById(R.id.totalcalories);
        v.setText(String.valueOf(totalCalories));
    }
}
