package com.example.myapplication3dice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView diceImageView;
    TextView resultTextView;
    Button rollButton;
    Random random;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        diceImageView = findViewById(R.id.dice_image_view);
        resultTextView = findViewById(R.id.result_text_view);
        rollButton = findViewById(R.id.roll_button);
        random = new Random();

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice()
    {
        int diceValue = random.nextInt(6) +1;
        resultTextView.setText("You rolled a " + diceValue);

        int resourceID = getResources().getIdentifier("dice" + diceValue, "drawable", getPackageName());
        diceImageView.setImageResource(resourceID);
    }
}