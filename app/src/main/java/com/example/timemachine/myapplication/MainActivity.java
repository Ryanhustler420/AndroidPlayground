package com.example.timemachine.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performAction(View view) {
        switch (view.getId()){
            case R.id.m1:
                    Log.i(TAG, "First Method Worked");
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
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
