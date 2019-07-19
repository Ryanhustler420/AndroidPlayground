package com.example.timemachine.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "Main2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "OnRestart");
    }
}
