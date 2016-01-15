package com.example.willie_the_coyote.beep_beep.Fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.willie_the_coyote.beep_beep.R;

public class ChooseLevelFragment extends Fragment {
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (View) inflater.inflate(R.layout.fragment_choose_level, container, false);

        TextView tv = (TextView) rootView.findViewById(R.id.tv_attempt);
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(), "font/cactus_font.ttf");
        tv.setTypeface(face);

        return rootView;
    }
}
