package com.example.jacob.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class FavRecipe extends AppCompatActivity {

    ListView recipeView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_fav_recipe);

        recipeView = (ListView) findViewById(R.id.recipeView);

        ArrayList<String> arrayFood = new ArrayList<>();
        arrayFood.addAll(Arrays.asList(getResources().getStringArray(R.array.rcpex)));

        adapter = new ArrayAdapter<>(
                FavRecipe.this,
                android.R.layout.simple_list_item_1,
                arrayFood
        );

        recipeView.setAdapter(adapter);
    }
}
