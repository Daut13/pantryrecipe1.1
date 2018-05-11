package com.example.jacob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FoodSelect extends AppCompatActivity {

   /* ListView search_food;
    ArrayAdapter<String> adapter;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select);

        Button button;
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(FoodSelect.this,FoodList.class);
                startActivity(i);
            }
        });
/*
        search_food = findViewById(R.id.search_food);

        ArrayList<String> arrayFood = new ArrayList<>();
        arrayFood.addAll(Arrays.asList(getResources().getStringArray(R.array.my_foods)));

        adapter = new ArrayAdapter<>(
                FoodSelect.this,
                android.R.layout.simple_list_item_1,
                arrayFood
        );

        search_food.setAdapter(adapter);*/
    }
}

