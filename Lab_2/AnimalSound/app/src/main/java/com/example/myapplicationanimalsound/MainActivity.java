package com.example.myapplicationanimalsound;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.m001_act_splash);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        int[] colors = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4),
        };
        // Array các icon từ drawable
        int[] icons = {
                R.drawable.image1,  // Đổi tên theo icon của bạn
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.iamge4
        };
        // Random màu nền và icon
        Random random = new Random();
        int randomColor = colors[random.nextInt(colors.length)];
        int randomIcon = icons[random.nextInt(icons.length)];

        // Đặt màu nền cho layout
        findViewById(R.id.m001).setBackgroundColor(randomColor);

        // Đặt icon ngẫu nhiên cho ImageView
        imageView = findViewById(R.id.icon);
        imageView.setImageResource(randomIcon);

        progressBar = findViewById(R.id.progressBar);
        imageView = findViewById(R.id.icon);
        textView = findViewById(R.id.textview);

        // Ẩn icon và text ban đầu
        imageView.setVisibility(ImageView.INVISIBLE);
        textView.setVisibility(TextView.INVISIBLE);

        // Giả lập tiến trình tải
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Ẩn ProgressBar sau khi hoàn thành
                progressBar.setVisibility(ProgressBar.INVISIBLE);
                imageView.setVisibility(ImageView.VISIBLE);
                textView.setVisibility(TextView.VISIBLE);
            }
        }, 5000);  // Giả lập thời gian tải là 5 giây
    }


}