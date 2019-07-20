package com.example.timemachine.myapplication;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
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
