package com.example.timemachine.myapplication;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity implements View.OnClickListener {

    Button bSimple, bTough, bcoa, brate;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        // change action bar later

        bSimple = findViewById(R.id.bsq);
        bTough = findViewById(R.id.btq);
        bcoa = findViewById(R.id.coa);
        brate = findViewById(R.id.rate);

        bSimple.setOnClickListener(this);
        bTough.setOnClickListener(this);
        bcoa.setOnClickListener(this);
        brate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bsq:
                Intent simple = new Intent(FrontPage.this, Simple_question.class);
                startActivity(simple);
                break;
            case R.id.btq:
                Intent tough = new Intent(FrontPage.this, Tough_question.class);
                startActivity(tough);
                break;
            case R.id.coa:
                break;
            case R.id.rate:
                break;
        }
    }
}
