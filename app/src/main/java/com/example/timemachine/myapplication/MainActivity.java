package com.example.timemachine.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button index, marketplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performAction(View view) {
        switch (view.getId()){
            case R.id.index:
                Log.i(TAG, "Index Button");
                break;
            case R.id.marketPlace:
                Log.i(TAG, "Marketplace Button");
                break;
        }
    }
}
