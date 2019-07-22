package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tough_question extends AppCompatActivity implements View.OnClickListener {

    TextView tvQuestion, tvAnswer, tvTotalLength__yy, tvPresentIndex_xx;

    Button bprev, bshow, bnext;

    int index;
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

        // init first question
        tvQuestion.setText(toughQuestions[index]);
        tvAnswer.setText("Press \"A\" Button for the Answer");
        tvPresentIndex_xx.setText(String.valueOf(index+1));
        tvTotalLength__yy.setText("/ "+String.valueOf(toughQuestions.length));
        index = 0;

        toughQuestions = getResources().getStringArray(R.array.tough_questions);
        toughAnswers = getResources().getStringArray(R.array.tough_answers);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bprev:
                tvAnswer.setText("Press \"A\" Button for the Answer");
                index--;
                if(index == -1) index = toughQuestions.length - 1;
                tvQuestion.setText(toughQuestions[index]);
                tvPresentIndex_xx.setText(String.valueOf(index+1));
                break;
            case R.id.bshowanswer:
                tvAnswer.setText(toughAnswers[index]);
                break;
            case R.id.bnext:
                tvAnswer.setText("Press \"A\" Button for the Answer");
                index++;
                if(index == toughQuestions.length) index = 0;
                tvQuestion.setText(toughQuestions[index]);
                tvPresentIndex_xx.setText(String.valueOf(index+1));
                break;
        }
    }
}
