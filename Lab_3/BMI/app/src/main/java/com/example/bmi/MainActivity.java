package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void btntinhBMI (View arg0)
    {
        Button btnChuandoan;
        EditText editTen, editChieuCao, editCannang, editBMI, editChuandoan;
        btnChuandoan= (Button) findViewById(R.id.btntinhBMI);
        editTen= (EditText) findViewById(R.id.editTen);
        editChieuCao= (EditText) findViewById(R.id.editChieuCao);
        editCannang= (EditText) findViewById(R.id.editCannang);
        editBMI= (EditText) findViewById(R.id.editBMI);
        editChuandoan= findViewById(R.id.editChanDoan);

        double H=Double.parseDouble(editChieuCao.getText()+"");
        double W=Double.parseDouble(editCannang.getText()+"");
        double BMI= W/Math.pow(H, 2);

        String chandoan=" ";

        if(BMI<18) {
            chandoan="Bạn gầy";
        }
        else if(BMI<=24.9) {
            chandoan="Bạn bình thường";
        }

        else if(BMI<=29.9){
            chandoan="Bạn béo phì cấp độ 1";
        }
        else if(BMI<=34.9){
            chandoan="Bạn béo phì cấp độ 2";
        }
        else{
            chandoan="Bạn béo phì cấp độ 3";
        }

        DecimalFormat dcf= new DecimalFormat("#.0");
        editBMI.setText(dcf.format(BMI));
        editChuandoan.setText(chandoan);
    }
}