package com.pratik.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText H1,W1;
    Button ans;
    TextView T1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        H1 = findViewById(R.id.H1);
        W1 = findViewById(R.id.W1);
        ans = findViewById(R.id.ans);
        T1 = findViewById(R.id.T1);

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height = Float.parseFloat(String.valueOf(H1.getText())) / 100;
                float weight = Float.parseFloat(String.valueOf(W1.getText()));
                float bmi = weight / (height * height);
                T1.setText(String.valueOf("BMI ="+bmi+"kg/m2"));
            }
        });

    }
}