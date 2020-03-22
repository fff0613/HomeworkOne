package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mainActivityName;
    private EditText mainActivitySchool;
    private CheckBox macb1;
    private CheckBox macb2;
    private CheckBox macb3;
    private CheckBox macb4;
    private CheckBox macb5;
    private CheckBox macb6;
    private CheckBox macb7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityName = findViewById(R.id.inputName);
        mainActivitySchool = findViewById(R.id.inputSchool);
        macb1 = findViewById(R.id.checkOne);
        macb2 = findViewById(R.id.checkTwo);
        macb3 = findViewById(R.id.checkThree);
        macb4 = findViewById(R.id.checkFour);
        macb5 = findViewById(R.id.checkFive);
        macb6 = findViewById(R.id.checkSix);
        macb7 = findViewById(R.id.checkSeven);
        Button btn1 = findViewById(R.id.submitbtn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mainActivityName.getText().toString().trim();
                String school = mainActivitySchool.getText().toString().trim();
//                   Log.d("MainActivity",""+checkboxflag);
                if(TextUtils.isEmpty(name))
                {
                    Log.d("MainActivity", "noNameError");
                    Toast.makeText(getApplicationContext(), "名字为空", Toast.LENGTH_SHORT).show();
                }
                else
                if(TextUtils.isEmpty(school)){
                    Log.d("MainActivity", "noSchoolError");
                    Toast.makeText(getApplicationContext(), "学院为空", Toast.LENGTH_SHORT).show();
                }
                else
                if(!macb1.isChecked() && !macb2.isChecked() && !macb3.isChecked() && !macb4.isChecked()
                        && !macb5.isChecked() && !macb6.isChecked() && !macb7.isChecked()){
                    Log.d("MainActivity", "noCheckError");
                    Toast.makeText(getApplicationContext(), "意向为空", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this,Complete.class);
                    startActivity(intent);
                    Log.d("MainActivity", "submit");
                }
            }
        });

        Log.d("MainActivity", "writing");
    }

}
