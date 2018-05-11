package com.example.jacob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class RecipeSearch extends AppCompatActivity {
    ListView search_food;
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://j-sdk.download/api/get/recipes/all";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {

            @Override
            public void onResponse(JSONArray response) {
                try {
                    if(response != null) {
                        for(int i=0; i < response.length();i++) {
                            adapter.add(response.getJSONObject(i).getString("name"));
                            if( i % 100 == 0) {search_food.setAdapter(adapter); }
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO: Handle error

            }
        });
        queue.add(jsonArrayRequest);
        setContentView(R.layout.activity_food_list);
        search_food = findViewById(R.id.search_food);
        ArrayList<String> arrayFood = new ArrayList<>();
        //arrayFood.addAll(Arrays.asList(getResources().getStringArray(R.array.my_foods)));

        final ArrayList<String> listFood = new ArrayList<>();

        search_food.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listFood.add((String) search_food.getItemAtPosition(position));
            }
        });

        /*search_food.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(FoodList.this,FoodSelect.class);
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("IngrArray", listFood);
                i.putExtras(bundle);
                startActivity(i);
            }
        });*/

        adapter = new ArrayAdapter<>(
                RecipeSearch.this,
                android.R.layout.simple_list_item_1,
                arrayFood
        );
        search_food.setAdapter(adapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search_food);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
