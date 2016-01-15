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
public class ChooseLevel5x5 extends Fragment {


    public ChooseLevel5x5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_level5x5, container, false);
    }

}
