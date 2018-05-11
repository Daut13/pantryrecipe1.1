package com.example.jacob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodSelect extends AppCompatActivity {

    ListView list_food;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_select);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            arrayReceived = bundle.getStringArrayList("IngrArray");
        }
        ArrayList<String> arrayFood = new ArrayList<>();

            Button button;
            button = findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Intent i = new Intent(FoodSelect.this, FoodList.class);
                    if (arrayReceived != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("IngrArray", arrayReceived);
                    }
                    startActivity(i);
                }
            });


        if(arrayReceived != null) {
            arrayFood.addAll(arrayReceived);
        }

        adapter = new ArrayAdapter<>(
                FoodSelect.this,
                android.R.layout.simple_list_item_1,
                arrayFood
        );

        if(arrayReceived != null) {
            list_food = findViewById(R.id.search_food);
            list_food.setAdapter(adapter);
        }


    }

       /* String s = getIntent().getStringExtra("Ingredient");
        if (s != null){

            ArrayList<String> arrayFood = new ArrayList<>();
            adapter.add(s);

            adapter = new ArrayAdapter<>(
                    FoodSelect.this,
                    android.R.layout.simple_list_item_1,
                    arrayFood
            );

            list_food.setAdapter(adapter);
        }*/

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

