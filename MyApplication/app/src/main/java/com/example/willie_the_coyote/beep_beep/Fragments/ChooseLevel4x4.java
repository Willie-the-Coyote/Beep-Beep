package com.example.willie_the_coyote.beep_beep.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.willie_the_coyote.beep_beep.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseLevel4x4 extends Fragment {


    public ChooseLevel4x4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_level4x4, container, false);
    }

}
