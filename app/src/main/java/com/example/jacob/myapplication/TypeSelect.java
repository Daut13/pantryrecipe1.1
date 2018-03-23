package com.example.jacob.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TypeSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_select);

        Button button;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button2;
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button3;
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button4;
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button5;
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button6;
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button7;
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button8;
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button9;
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button10;
        button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button11;
        button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button12;
        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });

        Button button13;
        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(TypeSelect.this,FoodList.class);
                startActivity(i);
            }
        });
    }
}

