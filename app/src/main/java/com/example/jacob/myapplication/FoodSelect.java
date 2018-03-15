package com.example.jacob.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FoodSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select);

        Button button;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(FoodSelect.this,FoodList.class);
                startActivity(i);
            }
        });
    }
}

/*
* Above is a large onclick for the buttons on the select page
* This is used to navigate to individual fragments for each of the buttons
* which should function differently from one another. They essentially act as 7 different pages.
* fbut# refers to the fragment and the number associated with it
* fButTrans# refers to the fragment transition and the number associated with it.
*/

