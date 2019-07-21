package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Simple_question extends AppCompatActivity {

    String[] simpleQuestions, simpleAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        simpleQuestions = getResources().getStringArray(R.array.simple_Questions);
        simpleAnswers = getResources().getStringArray(R.array.simple_answers);
    }
}
