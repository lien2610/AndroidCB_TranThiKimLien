package com.example.match;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView curView = null;
    private int countPair=0;
    final int[] drawable = new int[] {
            R.drawable.image_0,
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7
    };

    int[] pos = {0,1,2,3,4,5,6,7,7,5,4,2,3,6,0,1};
    int currentPos = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageAdapter imageAdapter= new ImageAdapter(this);
        GridView gridView = (GridView) findViewById(R.id.gridPicture);
        gridView.setAdapter(imageAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(currentPos <0){
                    currentPos = position;
                    curView = (ImageView) view;
                    ((ImageView) view).setImageResource(drawable[pos[position]]);
                }
                else{
                    if(currentPos == position){
                        ((ImageView) view).setImageResource((R.drawable.no_image));
                    } else if (pos[currentPos] != pos[position]) {
                        curView.setImageResource(R.drawable.no_image);
                        Toast.makeText(MainActivity.this, "Not Match", Toast.LENGTH_LONG).show();
                    } else{
                        ((ImageView) view).setImageResource((drawable[pos[position]]));
                        countPair++;
                        if(countPair == 8){
                            Toast.makeText(MainActivity.this, "You Win!", Toast.LENGTH_LONG ).show();
                        }
                    }
                    currentPos = -1;
                }
            }
        });
    }
}