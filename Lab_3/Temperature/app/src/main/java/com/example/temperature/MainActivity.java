package com.example.temperature;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txtF, txtC;
    EditText editTextF, editTextC;
    Button btnF, btnC, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitControl();

    }
    private void innitControl(){
        txtC= findViewById(R.id.txtC);
        txtF= findViewById(R.id.txtF);
        editTextC= findViewById(R.id.edittext_C);
        editTextF= findViewById(R.id.edittext_F);

        btnC= findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x= Float.parseFloat(editTextF.getText().toString());
                float y= (x-32)*5/9;
                editTextC.setText(String.valueOf(y));
            }
        });

        btnF= findViewById(R.id.btnF);
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x= Float.parseFloat(editTextC.getText().toString());
                float y= (x*9/5) +32;
                editTextF.setText(String.valueOf(y));
            }
        });

        btnClear= findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 editTextF.setText("");
                 editTextC.setText("");
            }
        });
    }
}