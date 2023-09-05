package com.example.appreproductordemusica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView back = findViewById(R.id.btn_back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registroActivity = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(registroActivity);
            }
        });

        ImageView next = findViewById(R.id.btn_next2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registroActivity = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(registroActivity);
            }
        });

    }
}