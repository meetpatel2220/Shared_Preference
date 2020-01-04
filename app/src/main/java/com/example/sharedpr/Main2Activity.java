package com.example.sharedpr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
SharedPreferences sp;
    public static final String mypreference = "mypreference";
    public static final String Name = "nameKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        sp = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        Toast.makeText(this, sp.getString(Name,""), Toast.LENGTH_SHORT).show();

    }
}
