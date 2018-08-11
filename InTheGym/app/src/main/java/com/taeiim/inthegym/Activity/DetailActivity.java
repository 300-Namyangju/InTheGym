package com.taeiim.inthegym.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.taeiim.inthegym.R;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView3, imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView4.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView4.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.VISIBLE);
            }
        });


    }
}
