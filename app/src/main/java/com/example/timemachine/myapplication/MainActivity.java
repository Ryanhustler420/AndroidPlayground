package com.example.timemachine.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private Button index, marketplace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        index = findViewById(R.id.index);
        index.setOnClickListener(MainActivity.this);

        marketplace = findViewById(R.id.marketPlace);
        marketplace.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.index:
                Log.d(TAG, " Index Search Page Clicked");
                break;
            case R.id.marketPlace:
                Log.d(TAG, " Marketplace Intent");
                break;
        }
    }

}
