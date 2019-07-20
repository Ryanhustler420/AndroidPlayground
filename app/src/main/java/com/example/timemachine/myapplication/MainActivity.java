package com.example.timemachine.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "OnCreate");
    }

    public void performAction(View view) {
        switch (view.getId()){
            case R.id.m1:
                    Log.i(TAG, "First Method Worked");
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                    Toast toast = Toast.makeText(MainActivity.this, "Moving to Main2Activity", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    // toast.setGravity(Gravity.TOP | Gravity.RIGHT,0,0);
                    toast.show();
                break;
            case R.id.m2:
                    Log.i(TAG, "Second Method Worked");
                    Intent j = new Intent("Main2Activity");
                    startActivity(j);
                break;
            case R.id.m3:
                    Log.i(TAG, "Third Method Worked");
                    Intent k = new Intent();
                    k.setClassName("com.example.timemachine.myapplication","com.example.timemachine.myapplication.Main2Activity");
                    startActivity(k);
                break;
        }
    }
}
