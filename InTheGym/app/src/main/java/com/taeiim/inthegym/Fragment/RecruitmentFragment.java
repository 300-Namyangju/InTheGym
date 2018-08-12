package com.taeiim.inthegym.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.taeiim.inthegym.Activity.PostingActivity;
import com.taeiim.inthegym.R;

/**
 * Created by parktaeim on 2018. 8. 12..
 */

public class RecruitmentFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_recruitment, container, false);

        rootView.findViewById(R.id.imageView8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PostingActivity.class));
            }
        });
        return rootView;
    }

}
