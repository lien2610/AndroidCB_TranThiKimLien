package com.example.laptrinhsukien;

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
    EditText edit_txtA;
    EditText edit_txtB;
    TextView txtResult;
    Button btnPlus, btnSub, btnMul, btnDiv, btnGCD, btnExit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitControl();
    }

    private void innitControl(){
        edit_txtA= findViewById(R.id.edit_textA);
        edit_txtB= findViewById(R.id.edit_textB);
        txtResult= findViewById(R.id.Result);
        btnPlus= findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                    float x= Float.parseFloat(edit_txtA.getText().toString());
                    float y= Float.parseFloat(edit_txtB.getText().toString());
                    float result= x+y;
                    txtResult.setText(String.valueOf(result));
                }
        });

        btnSub=findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                float x= Float.parseFloat(edit_txtA.getText().toString());
                float y= Float.parseFloat(edit_txtB.getText().toString());
                float result= x-y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnMul= findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                float x= Float.parseFloat(edit_txtA.getText().toString());
                float y= Float.parseFloat(edit_txtB.getText().toString());
                float result= x*y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnDiv= findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                float x= Float.parseFloat(edit_txtA.getText().toString());
                float y= Float.parseFloat(edit_txtB.getText().toString());
                float result= x/y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnGCD= findViewById(R.id.btnGCD);
        btnGCD.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                float x= Float.parseFloat(edit_txtA.getText().toString());
                float y= Float.parseFloat(edit_txtB.getText().toString());
                if(x==0 || y==0){
                    float result=x+y;
                }

                while (x != y){
                    if (x > y){
                        x -= y; // a = a - b
                    }else{
                        y -= x;
                    }
                }
                float result=x;

                txtResult.setText(String.valueOf(result));
            }
        });

        btnExit= findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                finish();.set
            }
        });
    }
}