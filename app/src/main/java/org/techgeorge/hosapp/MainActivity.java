package org.techgeorge.hosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button registerButton;
    private Button registerButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        registerButton = findViewById(R.id.button);
        registerButton2 = findViewById(R.id.button2);
        registerButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //insert data into firebase database
                Intent loginIntent = new Intent(v.getContext(), MainActivity1.class);
                startActivity(loginIntent);

            }
        });
        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //insert data into firebase database
                Intent loginIntent1 = new Intent(v.getContext(), MainActivity2.class);
                startActivity(loginIntent1);

            }
        });


    }
}
