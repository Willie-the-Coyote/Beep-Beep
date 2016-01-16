package com.example.willie_the_coyote.beep_beep.Fragments;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.willie_the_coyote.beep_beep.ChooseLevel;
import com.example.willie_the_coyote.beep_beep.R;
import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;

import java.util.ArrayList;

public class GameFragment extends Fragment {
    private View rootView;
    TextView tvAttempt;
    public static ArrayList<PushButton> buttons;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (View) inflater.inflate(R.layout.fragment_game_board, container, false);
        int dificulty = getArguments().getInt(ChooseLevel.DIFICULTY_LEVEL);
        generateGrid(dificulty);
        generateWordContainer(dificulty);
        //startGameLoop(dificulty, number)

        return rootView;
    }


    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void generateGrid(int dificulty) {
        GridLayout grid = (GridLayout) rootView.findViewById(R.id.gridview);
        LinearLayout mainLayout = (LinearLayout) rootView.findViewById(R.id.main_layout);
        grid.setColumnCount(dificulty);
        grid.setRowCount(dificulty);
        buttons = new ArrayList<PushButton>();
        tvAttempt = new TextView(getActivity());
        tvAttempt.setBackgroundColor(0xfff00000);
        tvAttempt.setText("");
        mainLayout.addView(tvAttempt);

        PushButton btn;
        int index = 0;
        for (int row = 0; row < dificulty; row++) {
            for (int col = 0; col < dificulty; col++) {
                btn = new PushButton(getActivity());
                btn.setBackground(getActivity().getResources().getDrawable(R.drawable.tile));
                btn.setWidth(100);
                btn.setHeight(100);
                btn.setId(index);
                btn.setText("");
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //str+= view.getText().toString();
                        view.getId();

                        String w = "";
                        for (int i = 0; i < PushButton.wordCombo.size(); i++) {
                            w += PushButton.wordCombo.get(i).toString();
                        }
                        tvAttempt.setText("");
                        tvAttempt.setText(w);
                        if (w.equals(ChooseLevel.levels.get(0).Words.get(0))) {

                            for (int i = PushButton.wordCombo.size() - 1; i >= 0; i--) {
                                PushButton.wordCombo.remove(i);
                            }
                            // Intent intent = new Intent(this, ChooseLevel.class);
                            //startActivity(intent);
                            tvAttempt.setText("");
                        }
                    }
                });
                index++;
                grid.addView(btn);
                buttons.add(btn);
            }
        }
    }

    private void generateWordContainer(int difficulty) {
        LinearLayout guessWord = (LinearLayout) rootView.findViewById(R.id.guess_word);
        TextView tv;
        for (int i = 0; i < difficulty - 1; i++) {
            tv = new TextView(getActivity());
            tv.setBackgroundColor(0xfff00000);
            guessWord.addView(tv);
        }
    }
}
