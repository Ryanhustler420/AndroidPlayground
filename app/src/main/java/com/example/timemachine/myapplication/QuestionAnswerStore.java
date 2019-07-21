package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class QuestionAnswerStore extends AppCompatActivity implements View.OnClickListener {
    TextView tvQuestion, tvAnswer, tvTotalLength__yy, tvPresentIndex_xx;
    String[] allQuestions, allAnswers;

    Button bprev, bshow, bnext;

    int index;

    public QuestionAnswerStore QuestionAnswerStore(String[] questions, String[] answers) {
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

        allQuestions = questions.clone();
        allAnswers = Arrays.copyOf(answers, answers.length);

        // init first question
        tvQuestion.setText(allQuestions[index]);
        tvAnswer.setText("Press \"A\" Button for the Answer");
        tvPresentIndex_xx.setText(String.valueOf(index+1));
        tvTotalLength__yy.setText(String.valueOf(allQuestions.length));
        index = 0;

        return this;
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

    // methods for incress decres
}
