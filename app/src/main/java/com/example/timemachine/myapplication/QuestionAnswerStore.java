package com.example.timemachine.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionAnswerStore extends AppCompatActivity implements View.OnClickListener {
    TextView tvQuestion, tvAnswer, tvTotalLength__yy, tvPresentIndex_xx;
    String[] allQuestions, allAnswers;
    Button bprev, bshow, bnext;
    int index;

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

        index = 0;
    }

    public void init(String[] questions, String[] answers) {
        allQuestions = questions.clone();
        allAnswers =  answers.clone();

        // init first question
        tvQuestion.setText(allQuestions[index]);
        tvAnswer.setText("Press \"A\" Button for the Answer");
        tvPresentIndex_xx.setText(String.valueOf(index+1));
        tvTotalLength__yy.setText("/ "+String.valueOf(allQuestions.length));
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bprev:
                tvAnswer.setText("Press \"A\" Button for the Answer");
                index--;
                if(index == -1) index = allQuestions.length - 1;
                tvQuestion.setText(allQuestions[index]);
                tvPresentIndex_xx.setText(String.valueOf(index+1));
                break;
            case R.id.bshowanswer:
                tvAnswer.setText(allAnswers[index]);
                break;
            case R.id.bnext:
                tvAnswer.setText("Press \"A\" Button for the Answer");
                index++;
                if(index == allQuestions.length) index = 0;
                tvQuestion.setText(allQuestions[index]);
                tvPresentIndex_xx.setText(String.valueOf(index+1));
                break;
        }
    }
}
