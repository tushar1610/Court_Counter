package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int score_A = 0;
    int score_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void addThreeTeamA(View view){
         score_A += 3;
         displayScoreA(score_A);
     }


    public void addTwoTeamA(View view){
        score_A += 2;
        displayScoreA(score_A);
    }


    public void addOneTeamA(View view){
        score_A += 1;
        displayScoreA(score_A);
    }


    public void addThreeTeamB(View view){
        score_B += 3;
        displayScoreB(score_B);
    }


    public void addTwoTeamB(View view){
        score_B += 2;
        displayScoreB(score_B);
    }


    public void addOneTeamB(View view){
        score_B += 1;
        displayScoreB(score_B);
    }

    public void displayScoreA(int score) {
        TextView score_of_Team = (TextView) findViewById(R.id.scoreA);
        score_of_Team.setText(String.valueOf(score));
    }

    public void displayScoreB(int score) {
        TextView score_of_Team = (TextView) findViewById(R.id.scoreB);
        score_of_Team.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        score_A = 0;
        score_B = 0;
        displayScoreA(score_A);
        displayScoreB(score_A);
    }
}
