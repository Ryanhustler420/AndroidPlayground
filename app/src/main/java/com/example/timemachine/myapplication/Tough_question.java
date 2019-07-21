package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tough_question extends AppCompatActivity {

    String[] toughQuestions, toughAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        toughQuestions = getResources().getStringArray(R.array.tough_questions);
        toughAnswers = getResources().getStringArray(R.array.tough_answers);
    }
}
