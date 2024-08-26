package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    Button b, s;
    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.btn);
        Button s = findViewById(R.id.bb);
        EditText t1 = findViewById(R.id.t1);
        EditText t2 = findViewById(R.id.t2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().trim().isEmpty()){
                    t1.setError("User Name is required");
                    t1.hasFocus();
                }
                if(t2.getText().toString().trim().isEmpty()){
                    t2.setError("Password is required");
                }

                if (t1.getText().toString().equals("Nimra") && t2.getText().toString().equals("09876")) {
                    Toast.makeText(MainActivity.this, "login successfull", Toast.LENGTH_SHORT).show();
                    Intent I = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(I);

                } else {
                    Toast.makeText(MainActivity.this, "Login fail", Toast.LENGTH_SHORT).show();
                }

            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "moving to google", Toast.LENGTH_SHORT).show();
                Intent I = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(I);
            }


        });
    }

}