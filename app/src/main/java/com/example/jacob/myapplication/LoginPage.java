package com.example.jacob.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button button;
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Intent i = new Intent(LoginPage.this, MainActivity.class);
                //startActivity(i);
                JSONObject cred = new JSONObject();
                EditText user = (EditText)findViewById(R.id.editText);
                EditText pass = (EditText)findViewById(R.id.editText2);
                String username = user.getText().toString();
                String password = pass.getText().toString();
                try {
                    cred.put("username",username);
                    cred.put("password", password);
                    cred.put("passwordconf", password);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                JsonObjectRequest request = new JsonObjectRequest(
                        Request.Method.POST, "https://j-sdk.download/auth/login", cred,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                //...
                                Intent i = new Intent(LoginPage.this, MainActivity.class);
                                startActivity(i);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                //...
                            }
                        });
                queue.add(request);
                Intent i = new Intent(LoginPage.this, MainActivity.class);
                startActivity(i);
            }
        });

        Button button2;
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, SignUpPage.class);
                startActivity(i);
            }
        });

    }

}

