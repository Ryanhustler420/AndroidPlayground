package com.example.timemachine.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void performAction(View view) {
        LayoutInflater inflater = getLayoutInflater();
        View appearance = inflater.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.root_layout));
        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);

        toast.setView(appearance);
        toast.show();
    }
}
