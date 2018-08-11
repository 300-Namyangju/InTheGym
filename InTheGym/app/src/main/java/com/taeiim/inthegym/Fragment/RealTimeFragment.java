package com.taeiim.inthegym.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.taeiim.inthegym.R;

/**
 * Created by parktaeim on 2018. 8. 12..
 */

public class RealTimeFragment extends Fragment {

    private View rootView;
    ImageView imageView10, realtime_1, realtime_imageview1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_realtime, container, false);
        imageView10 = rootView.findViewById(R.id.imageView10);
        realtime_1 = rootView.findViewById(R.id.realtime_1);
        realtime_imageview1 = rootView.findViewById(R.id.realtime_imageview1);

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realtime_imageview1.setVisibility(View.VISIBLE);
                realtime_1.setVisibility(View.INVISIBLE);
                imageView10.setVisibility(View.INVISIBLE);
            }
        });

        realtime_imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realtime_imageview1.setVisibility(View.INVISIBLE);
                realtime_1.setVisibility(View.VISIBLE);
                imageView10.setVisibility(View.VISIBLE);
            }
        });

        return rootView;
    }

}
