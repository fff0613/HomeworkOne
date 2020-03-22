package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Complete extends AppCompatActivity implements View.OnClickListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete);
        Button btn1 = findViewById(R.id.back);

        btn1.setOnClickListener(this);
        Log.d("MainActivity", "complete");
    }

    public void onClick(View view) {
        if (view.getId() == R.id.back) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            Log.d("MainActivity", "back");
            finish();
        }
    }
}
