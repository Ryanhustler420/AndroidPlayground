package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tough_question extends AppCompatActivity implements View.OnClickListener {

    TextView tvQuestion, tvAnswer, tvTotalLength__yy, tvPresentIndex_xx;

    Button bprev, bshow, bnext;

    String[] toughQuestions, toughAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        tvQuestion = findViewById(R.id.tvquestion);
        tvAnswer = findViewById(R.id.tvanswer);
        tvPresentIndex_xx = findViewById(R.id.tvxx);
        tvTotalLength__yy = findViewById(R.id.tvyy);

        bprev = findViewById(R.id.bprev);
        bshow = findViewById(R.id.bshowanswer);
        bnext = findViewById(R.id.bnext);

        bprev.setOnClickListener(this);
        bshow.setOnClickListener(this);
        bnext.setOnClickListener(this);

        toughQuestions = getResources().getStringArray(R.array.tough_questions);
        toughAnswers = getResources().getStringArray(R.array.tough_answers);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bprev:

                break;
            case R.id.bshowanswer:

                break;
            case R.id.bnext:

                break;
        }
    }
}
