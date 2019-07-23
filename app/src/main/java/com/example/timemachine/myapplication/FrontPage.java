package com.example.timemachine.myapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity implements View.OnClickListener {

    Button bSimple, bTough, bcoa, brate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        // Codes to add Action Bar [ inflating layout ]
        try {
            // Might Throw Some Error
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        } catch (NullPointerException e) {
            Log.e(getClass().getName(), e.toString());
        }
        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setCustomView(R.layout.frontpage_title_bar);

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
                Uri uri_coa;

                try {
                    // write publisher name in q= params which google developer account has.
                    uri_coa = Uri.parse("market://search?q=publisher_name");
                } catch (ActivityNotFoundException e) {
                    //  if play store is not available on the mobile, than  this link will automatically redirect to default web browser
                    uri_coa = Uri.parse("http://play.google.com/store/search?q=facebook%20Inc");
                }

                Intent goToMarket_coa = new Intent(Intent.ACTION_VIEW, uri_coa);
                startActivity(goToMarket_coa);
                break;
            case R.id.rate:
                Uri uri;

                try {
                // redirect to google play store
                    uri = Uri.parse("market://details?id=" + getPackageName());
                } catch (ActivityNotFoundException e) {
                //  if play store is not available on the mobile, than  this link will automatically redirect to default web browser
                    uri = Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName());
                }

                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(goToMarket);
                break;
        }
    }
}
