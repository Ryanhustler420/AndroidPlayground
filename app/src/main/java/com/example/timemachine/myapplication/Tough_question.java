package com.example.timemachine.myapplication;

import android.os.Bundle;

public class Tough_question extends QuestionAnswerStore implements QuestionAnswerInit {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // change action bar later
        this.init();
    }

    @Override
    public void init() {
        // we have to call this method
        this.init(getResources().getStringArray(R.array.tough_questions), getResources().getStringArray(R.array.tough_answers));
    }
}
