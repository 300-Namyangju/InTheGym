package com.taeiim.inthegym.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.taeiim.inthegym.R;

/**
 * Created by parktaeim on 2018. 8. 12..
 */

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        final ImageView calendarImgView = (ImageView) findViewById(R.id.calendarImgView);
        calendarImgView.setOnClickListener(v-> calendarImgView.setImageResource(R.drawable.img_pay2_2));
    }
}
