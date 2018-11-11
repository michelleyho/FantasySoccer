package com.example.android.fantasysoccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_A = 0;
    int foul_A = 0;
    int yellow_A = 0;
    int red_A = 0;

    int score_B = 0;
    int foul_B = 0;
    int yellow_B = 0;
    int red_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA(0);
        displayRedA(0);
        displayYellowA(0);
        displayFoulA(0);

        displayScoreB(0);
        displayRedB(0);
        displayYellowB(0);
        displayFoulB(0);
    }

    //Team A Methods
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_A);
        scoreView.setText(String.format(getResources().getString(R.string.ScoreA), score));
    }

    public void displayRedA(int red) {
        TextView scoreView = (TextView) findViewById(R.id.red_A);
        scoreView.setText(String.format(getResources().getString(R.string.RedA), red));
    }

    public void displayYellowA(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_A);
        scoreView.setText(String.format(getResources().getString(R.string.YellowA), yellow));
    }

    public void displayFoulA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.foul_A);
        scoreView.setText(String.format(getResources().getString(R.string.FoulA), foul));
    }

    public void updateScoreA(View v) {

        switch (v.getId()) {
            case (R.id.add_goal_A):
                score_A += 10;
                break;
            case (R.id.add_assist_A):
                score_A += 6;
                break;
            case (R.id.add_shot_A):
                score_A += 1;
                break;
            case (R.id.add_cross_A):
                score_A += 1;
                break;
            case (R.id.add_foul_A):
                score_A += 0;
                foul_A += 1;
                break;
            case (R.id.add_yellow_A):
                score_A -= 1;
                yellow_A += 1;
                break;
            case (R.id.add_red_A):
                score_A -= 2;
                red_A += 1;
                break;
        }

        displayScoreA(score_A);
        displayRedA(red_A);
        displayYellowA(yellow_A);
        displayFoulA(foul_A);
    }


    //Team B Methods
    public void displayScoreB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_B);
        scoreView.setText(String.format(getResources().getString(R.string.ScoreB), score));
    }

    public void displayRedB(int red) {
        TextView scoreView = (TextView) findViewById(R.id.red_B);
        scoreView.setText(String.format(getResources().getString(R.string.RedB), red));
    }

    public void displayYellowB(int yellow) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_B);
        scoreView.setText(String.format(getResources().getString(R.string.YellowB), yellow));
    }

    public void displayFoulB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.foul_B);
        scoreView.setText(String.format(getResources().getString(R.string.FoulB), foul));
    }

    public void updateScoreB(View v) {

        switch (v.getId()) {
            case (R.id.add_goal_B):
                score_B += 10;
                break;
            case (R.id.add_assist_B):
                score_B += 6;
                break;
            case (R.id.add_shot_B):
                score_B += 1;
                break;
            case (R.id.add_cross_B):
                score_B += 1;
                break;
            case (R.id.add_foul_B):
                score_B += 0;
                foul_B += 1;
                break;
            case (R.id.add_yellow_B):
                score_B -= 1;
                yellow_B += 1;
                break;
            case (R.id.add_red_B):
                score_B -= 2;
                red_B += 1;
                break;
        }

        displayScoreB(score_B);
        displayRedB(red_B);
        displayYellowB(yellow_B);
        displayFoulB(foul_B);
    }

    public void resetGame(View v) {
        score_A = 0;
        red_A = 0;
        yellow_A = 0;
        foul_A = 0;
        displayScoreA(score_A);
        displayRedA(red_A);
        displayYellowA(yellow_A);
        displayFoulA(foul_A);

        score_B = 0;
        red_B = 0;
        yellow_B = 0;
        foul_B = 0;
        displayScoreB(score_B);
        displayRedB(red_B);
        displayYellowB(yellow_B);
        displayFoulB(foul_B);

    }


}
