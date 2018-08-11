package com.taeiim.inthegym.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taeiim.inthegym.R;

/**
 * Created by parktaeim on 2018. 8. 12..
 */

public class GymFragment extends Fragment {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_gym, container, false);


        return rootView;
    }

}
