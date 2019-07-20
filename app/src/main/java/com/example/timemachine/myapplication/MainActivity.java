package com.example.timemachine.myapplication;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    int score;
    EditText et;
    String etString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
        et = findViewById(R.id.editText);
    }

    // called when orientation changes to save the value. when activity is about to die || destroy
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        etString = et.getText().toString();
        outState.putString("edittext", etString);
        outState.putInt("score", score);
    }

    // called when this activity again run lifeCycle from start aka OnCreate, we will get our saved value from here.
    // we will extract the values from Bundle
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        et.setText(savedInstanceState.getString("edittext"));
        score = savedInstanceState.getInt("score");
    }

    public void performAction(View view) {
        // Code goes here....
        switch (view.getId()) {
            case R.id.increment:
                score += 1;
                break;
            case R.id.showCount:
                Toast.makeText(getApplicationContext(), "Your SCORE is " + score, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i(TAG,"Portrait");
            Toast.makeText(getApplicationContext(), "Portrait Mode", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.i(TAG,"Landscape");
            Toast.makeText(getApplicationContext(), "Landscape Mode", Toast.LENGTH_SHORT).show();
        }
    }
}
