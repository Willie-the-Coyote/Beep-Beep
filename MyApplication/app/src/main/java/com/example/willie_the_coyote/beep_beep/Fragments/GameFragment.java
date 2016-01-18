package com.example.willie_the_coyote.beep_beep.Fragments;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.willie_the_coyote.beep_beep.ChooseLevel;
import com.example.willie_the_coyote.beep_beep.LevelDifficulty;
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

        return rootView;
    }

    GridLayout grid;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private  void generateGrid(final int dificulty) {
        grid = (GridLayout) rootView.findViewById(R.id.gridview);
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
                btn.setId(index);
                btn.setText("");
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String w = "";
                        for (int i = 0; i < PushButton.wordCombo.size(); i++) {
                            w += PushButton.wordCombo.get(i).toString();
                        }
                        tvAttempt.setText("");
                        tvAttempt.setText(w);

                        switch (dificulty) {
                            case 2:
                                if (w.equals(ChooseLevel.current.Words.get(0))) {

                                    for (int j = PushButton.wordCombo.size() - 1; j >= 0; j--) {
                                        PushButton.wordCombo.remove(j);
                                    }
                                    for (int b = 0; b < grid.getChildCount(); b++) {
                                        if (grid.getChildAt(b).isPressed()) {
                                            grid.getChildAt(b).setVisibility(View.GONE);
                                        }
                                    }
                                    ChooseLevel.current.guessedWords.set(0, true);
                                    //int ind = ChooseLevel.levels.indexOf(ChooseLevel.current);
                                    if (ChooseLevel.current.Level < 9) {
                                        Intent intent = new Intent(getActivity(), ChooseLevel.class);
                                        intent.putExtra("diff", "2");
                                        startActivity(intent);
                                    } else {
                                        Intent intent = new Intent(getActivity(), LevelDifficulty.class);
                                        startActivity(intent);
                                    }
                                    tvAttempt.setText("");
                                }
                                break;
                            case 3:
                                if (w.equals(ChooseLevel.current.Words.get(0)) || w.equals(ChooseLevel.current.Words.get(1))) {
                                    for (int j = PushButton.wordCombo.size() - 1; j >= 0; j--) {
                                        PushButton.wordCombo.remove(j);
                                    }
                                    for (int b = 0; b < grid.getChildCount(); b++) {
                                        if (grid.getChildAt(b).isPressed()) {
                                            grid.getChildAt(b).setVisibility(View.GONE);
                                        }
                                    }
                                    int ind = ChooseLevel.current.Words.indexOf(w);
                                    ChooseLevel.current.guessedWords.set(ind, true);
                                    tvAttempt.setText("");
                                }

                                if (ChooseLevel.current.guessedWords.get(0) && ChooseLevel.current.guessedWords.get(1)) {
                                    if (ChooseLevel.current.Level < 9) {
                                        Intent intent = new Intent(getActivity(), ChooseLevel.class);
                                        intent.putExtra("diff", "3");
                                        startActivity(intent);
                                    } else {
                                        Intent intent = new Intent(getActivity(), LevelDifficulty.class);
                                        startActivity(intent);
                                    }
                                }

                                break;
                            case 4:
                                if (w.equals(ChooseLevel.current.Words.get(0))
                                        || w.equals(ChooseLevel.current.Words.get(1))
                                        || w.equals(ChooseLevel.current.Words.get(2))) {
                                    for (int j = PushButton.wordCombo.size() - 1; j >= 0; j--) {
                                        PushButton.wordCombo.remove(j);
                                    }

                                    for (int b = 0; b < grid.getChildCount(); b++) {
                                        if (grid.getChildAt(b).isPressed()) {
                                            grid.getChildAt(b).setVisibility(View.GONE);
                                        }
                                    }
                                    int ind = ChooseLevel.current.Words.indexOf(w);
                                    ChooseLevel.current.guessedWords.set(ind, true);
                                    tvAttempt.setText("");
                                }


                                if (ChooseLevel.current.guessedWords.get(0) && ChooseLevel.current.guessedWords.get(1) && ChooseLevel.current.guessedWords.get(2)) {
                                    if (ChooseLevel.current.Level < 9) {
                                        Intent intent = new Intent(getActivity(), ChooseLevel.class);
                                        intent.putExtra("diff", "4");
                                        startActivity(intent);
                                    } else {
                                        Intent intent = new Intent(getActivity(), LevelDifficulty.class);
                                        startActivity(intent);
                                    }
                                }
                                break;
                            case 5: if (w.equals(ChooseLevel.current.Words.get(0))
                                    || w.equals(ChooseLevel.current.Words.get(1))
                                    || w.equals(ChooseLevel.current.Words.get(2))
                                    || w.equals(ChooseLevel.current.Words.get(3))) {
                                for (int j = PushButton.wordCombo.size() - 1; j >= 0; j--) {
                                    PushButton.wordCombo.remove(j);
                                }

                                for (int b = 0; b < grid.getChildCount(); b++) {
                                    if (grid.getChildAt(b).isPressed()) {
                                        grid.getChildAt(b).setVisibility(View.GONE);
                                    }
                                }
                                int ind = ChooseLevel.current.Words.indexOf(w);
                                ChooseLevel.current.guessedWords.set(ind, true);
                                tvAttempt.setText("");
                            }

                                if (ChooseLevel.current.guessedWords.get(0)
                                        && ChooseLevel.current.guessedWords.get(1)
                                        && ChooseLevel.current.guessedWords.get(2)
                                        && ChooseLevel.current.guessedWords.get(3)) {
                                    if (ChooseLevel.current.Level < 9) {
                                        Intent intent = new Intent(getActivity(), ChooseLevel.class);
                                        intent.putExtra("diff", "5");
                                        startActivity(intent);
                                    } else {
                                        Intent intent = new Intent(getActivity(), LevelDifficulty.class);
                                        startActivity(intent);
                                    }
                                }
                                break;
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
