package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        Thread t =new Thread(){
            public void run(){
              try {
                  sleep(2000);
                  Intent I = new Intent(MainActivity2.this,MainActivity.class);
              startActivity(I);
              } catch (Exception e) {
              }

            }
        };
        t.start();

    }
}