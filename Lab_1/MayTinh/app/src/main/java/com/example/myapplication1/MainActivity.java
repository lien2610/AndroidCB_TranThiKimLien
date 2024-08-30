package com.example.myapplication1;

import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
/*
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
*/

public class MainActivity extends AppCompatActivity {
    EditText txtX, txtY;
    TextView txtResult;
    Button btnPlus, btnSub, btnMul, btnDivide, btnPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //   Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //   v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        //   return insets;
        //});
        innitControl();
    }

    private void innitControl(){
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(txtX.getText().toString());
                float y = Float.parseFloat(txtY.getText().toString());
                float result = x + y;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnSub = findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(txtX.getText().toString());
                float y = Float.parseFloat(txtY.getText().toString());
                float result = x - y;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnMul = findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(txtX.getText().toString());
                float y = Float.parseFloat(txtY.getText().toString());
                float result = x * y;

                txtResult.setText(String.valueOf(result));
            }
        });
        btnDivide = findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(txtX.getText().toString());
                float y = Float.parseFloat(txtY.getText().toString());
                float result = x / y;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnPer = findViewById(R.id.btnPer);
        btnPer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(txtX.getText().toString());
                float y = Float.parseFloat(txtY.getText().toString());
                float result = x % y;

                txtResult.setText(String.valueOf(result));
            }
        });
    }

}