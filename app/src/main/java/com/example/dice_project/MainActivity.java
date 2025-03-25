package com.example.dice_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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
    }

    public void wtfdice(View view) {

        Random random = new Random();
        int randomNumber = random.nextInt(5)+1;
        if (randomNumber == 1){
            ImageView imageview = findViewById(R.id.imageView1);
            imageview.setImageResource(R.drawable.dice1);
        } else if (randomNumber == 2) {
            ImageView imageview = findViewById(R.id.imageView1);
            imageview.setImageResource(R.drawable.dice2);
        } else if (randomNumber == 3) {
            ImageView imageview = findViewById(R.id.imageView1);
            imageview.setImageResource(R.drawable.dice3);
        } else if (randomNumber == 4) {
            ImageView imageview = findViewById(R.id.imageView1);
            imageview.setImageResource(R.drawable.dice4);
        } else if (randomNumber == 5) {
            ImageView imageview = findViewById(R.id.imageView1);
            imageview.setImageResource(R.drawable.dice5);
        } else {
            ImageView imageview = findViewById(R.id.imageView1);
            imageview.setImageResource(R.drawable.dice6);
        }
        Random random2 = new Random();
        int randomNumber2 = random2.nextInt(5)+1;
        if (randomNumber2 == 1){
            ImageView imageview = findViewById(R.id.imageView2);
            imageview.setImageResource(R.drawable.dice1);
        } else if (randomNumber2 == 2) {
            ImageView imageview = findViewById(R.id.imageView2);
            imageview.setImageResource(R.drawable.dice2);
        } else if (randomNumber2 == 3) {
            ImageView imageview = findViewById(R.id.imageView2);
            imageview.setImageResource(R.drawable.dice3);
        } else if (randomNumber2 == 4) {
            ImageView imageview = findViewById(R.id.imageView2);
            imageview.setImageResource(R.drawable.dice4);
        } else if (randomNumber2 == 5) {
            ImageView imageview = findViewById(R.id.imageView2);
            imageview.setImageResource(R.drawable.dice5);
        } else {
            ImageView imageview = findViewById(R.id.imageView2);
            imageview.setImageResource(R.drawable.dice6);
        }

    }
}