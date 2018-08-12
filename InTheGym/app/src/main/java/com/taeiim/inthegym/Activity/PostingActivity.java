package com.taeiim.inthegym.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.taeiim.inthegym.R;

/**
 * Created by parktaeim on 2018. 8. 12..
 */

public class PostingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);

        ImageView postingBtn = (ImageView) findViewById(R.id.postingBtn);
        postingBtn.setOnClickListener(v-> finish());
    }
}
