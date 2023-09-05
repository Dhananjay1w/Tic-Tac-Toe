package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Player representation
    //0-X
    //1-0
    int activePlayer=0;
    int[] gameState= {2, 2, 2, 2, 2, 2, 2, 2, 2};
    //State meanings:
    //0-X
    //1-0
    //2-Null
    int[][] winpositions={{0,1,2 },{3,4,5},{6,7,8},{}}
    public void playerTap(View view){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}