package com.example.dicerollerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice1;
    private ImageView imageViewDice2;
    private Random myRandomNo = new Random();
    Button buttonroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice1 = findViewById(R.id.roller1);
        imageViewDice2 = findViewById(R.id.roller2);


        buttonroll = findViewById(R.id.rollbtn);

        buttonroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomselector();
            }
        });
    }

//    private void rollthedices(View view){
//        randomselector();
//    }

    private void randomselector(){
        int myRandomSelect1 = myRandomNo.nextInt(6)+1;
        int myRandomSelect2 = myRandomNo.nextInt(6)+1;

        switch (myRandomSelect1){
            case 1:
                imageViewDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice1.setImageResource(R.drawable.dice6);
                break;

        }
        switch (myRandomSelect2){
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                break;

        }
    }

}
