package com.example.willie_the_coyote.beep_beep.Fragments;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.example.willie_the_coyote.beep_beep.ChooseLevel;
import com.example.willie_the_coyote.beep_beep.R;
import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;

public class GameFragment extends Fragment {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (View) inflater.inflate(R.layout.fragment_game_board2x2, container, false);

        int dificulty = getArguments().getInt(ChooseLevel.DIFICULTY_LEVEL);
        generateGrid(dificulty);

        return rootView;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void generateGrid(int dificulty) {
        GridLayout grid = (GridLayout) rootView.findViewById(R.id.gridview);
        grid.setColumnCount(dificulty);
        grid.setRowCount(dificulty);

        PushButton btn;
        for (int row = 0; row < dificulty; row++) {
            for (int col = 0; col < dificulty; col++) {
                btn = new PushButton(getActivity());
                btn.setBackground(getActivity().getResources().getDrawable(R.drawable.tile));
                grid.addView(btn);
            }
        }
    }
}
