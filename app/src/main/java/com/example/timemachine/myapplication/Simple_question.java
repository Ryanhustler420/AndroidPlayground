package com.example.timemachine.myapplication;

import android.os.Bundle;

public class Simple_question extends QuestionAnswerStore implements QuestionAnswerInit {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.init();
    }

    @Override
    public void init() {
        // we have to call this method
        this.init(getResources().getStringArray(R.array.simple_Questions), getResources().getStringArray(R.array.simple_answers));
    }
}
