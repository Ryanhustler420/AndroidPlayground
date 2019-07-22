package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class QuestionAnswerStore extends AppCompatActivity {
    TextView tvQuestion, tvAnswer, tvTotalLength__yy, tvPresentIndex_xx;
    String[] allQuestions, allAnswers;

    Button bprev, bshow, bnext;

    int index;

    QuestionAnswerStore(String[] questions, String[] answers) {
        tvQuestion = findViewById(R.id.tvquestion);
        tvAnswer = findViewById(R.id.tvanswer);
        tvPresentIndex_xx = findViewById(R.id.tvxx);
        tvTotalLength__yy = findViewById(R.id.tvyy);

        bprev = findViewById(R.id.bprev);
        bshow = findViewById(R.id.bshowanswer);
        bnext = findViewById(R.id.bnext);

        allQuestions = questions.clone();
        allAnswers = Arrays.copyOf(answers, answers.length);

        // init first question
        tvQuestion.setText(allQuestions[index]);
        tvAnswer.setText("Press \"A\" Button for the Answer");
        tvPresentIndex_xx.setText(String.valueOf(index+1));
        tvTotalLength__yy.setText(String.valueOf(allQuestions.length));
        index = 0;
    }

    public void prevQuestion() {
        tvAnswer.setText("Press \"A\" Button for the Answer");
        index--;
        if(index == -1) index = allQuestions.length - 1;
        tvQuestion.setText(allQuestions[index]);
        tvPresentIndex_xx.setText(String.valueOf(index+1));
    }

    public void nextQuestion() {
        tvAnswer.setText("Press \"A\" Button for the Answer");
        index++;
        if(index == allQuestions.length) index = 0;
        tvQuestion.setText(allQuestions[index]);
        tvPresentIndex_xx.setText(String.valueOf(index+1));
    }

    public void setAnswer() {
        tvAnswer.setText(allAnswers[index]);
    }
}
