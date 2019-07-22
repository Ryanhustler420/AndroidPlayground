package com.example.timemachine.myapplication;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Locale;

public class QuestionAnswerStore extends AppCompatActivity implements View.OnClickListener {
    TextView tvQuestion, tvAnswer, tvTotalLength__yy, tvPresentIndex_xx;
    String[] allQuestions, allAnswers;
    Button bprev, bshow, bnext;
    int index;

    TextToSpeech ttsobject;
    int result;

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

        // Codes to add Action Bar [ inflating layout ]
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setCustomView(R.layout.questions_title_bar);

        View view = getSupportActionBar().getCustomView();
        Button bspeak = view.findViewById(R.id.bspeak);
        Button bmute = view.findViewById(R.id.bmute);

        bspeak.setOnClickListener(this);
        bmute.setOnClickListener(this);

        index = 0;
    }

    public void init(String[] questions, String[] answers) {
        allQuestions = questions.clone();
        allAnswers =  answers.clone();

        // init first question
        tvQuestion.setText(allQuestions[index]);
        tvAnswer.setText("Press \"Show Answer\" Button for the Answer");
        tvPresentIndex_xx.setText(String.valueOf(index+1));
        tvTotalLength__yy.setText("/ "+String.valueOf(allQuestions.length));

        this.initTTSFunctionality();
    }

    private void initTTSFunctionality() {
        ttsobject = new TextToSpeech(QuestionAnswerStore.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status == TextToSpeech.SUCCESS){
                    result = ttsobject.setLanguage(Locale.US);
                } else {
                    Toast.makeText(getApplicationContext(), "Feature not supported in your Decide", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bprev:
                if(ttsobject != null) {
                    ttsobject.stop();
                }
                tvAnswer.setText("Press \"Show Answer\" Button for the Answer");
                index--;
                if(index == -1) index = allQuestions.length - 1;
                tvQuestion.setText(allQuestions[index]);
                tvPresentIndex_xx.setText(String.valueOf(index+1));
                break;
            case R.id.bshowanswer:
                tvAnswer.setText(allAnswers[index]);
                break;
            case R.id.bnext:
                if(ttsobject != null) {
                    ttsobject.stop();
                }
                tvAnswer.setText("Press \"Show Answer\" Button for the Answer");
                index++;
                if(index == allQuestions.length) index = 0;
                tvQuestion.setText(allQuestions[index]);
                tvPresentIndex_xx.setText(String.valueOf(index+1));
                break;
            case R.id.bspeak:
                if(result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA){
                    Toast.makeText(getApplicationContext(), "Feature not supported in your Decide", Toast.LENGTH_SHORT).show();
                } else {
                    ttsobject.speak(tvAnswer.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                }
                break;
            case R.id.bmute:
                if(ttsobject != null) {
                    ttsobject.stop();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(ttsobject != null) {
            ttsobject.stop();
            ttsobject.shutdown();
        }
    }
}
