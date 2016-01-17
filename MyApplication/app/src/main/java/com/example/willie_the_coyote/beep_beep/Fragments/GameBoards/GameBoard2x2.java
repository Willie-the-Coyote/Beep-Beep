//package com.example.willie_the_coyote.beep_beep.Fragments.GameBoards;
//
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.GridLayout;
//import android.widget.TextView;
//
//import com.example.willie_the_coyote.beep_beep.ChooseLevel;
//import com.example.willie_the_coyote.beep_beep.Objects.GameObject;
//import com.example.willie_the_coyote.beep_beep.R;
//import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;
//
//import java.util.ArrayList;
//
//
//public class GameBoard2x2 extends Fragment {
//
//    private PushButton start_button;
//    private PushButton button2;
//    private PushButton button3;
//    private PushButton button4;
//    TextView wordAtt;
//    private View.OnTouchListener listener;
//    public static ArrayList<GameObject> games;
//
//    public GameBoard2x2() {
//        // Required empty public constructor
//    }
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
////        start_button = (PushButton) getActivity().findViewById(R.id.Tile1);
////        button2 = (PushButton) getActivity().findViewById(R.id.Tile2);
////        button3 = (PushButton) getActivity().findViewById(R.id.Tile3);
////        button4 = (PushButton) getActivity().findViewById(R.id.Tile4);
//        wordAtt = (TextView) getActivity().findViewById(R.id.tv_wordAttempt);
//
//        games = new ArrayList<GameObject>();
//        GameObject game1 = new GameObject(0, "T","S", "L", "A", "SALT");
//        GameObject game2 = new GameObject(1, "C", "N", "I", "N", "CHIN");
//        GameObject game3 = new GameObject(2, "E", "S", "O", "N", "NOSE");
//        GameObject game4 = new GameObject(3,"S", "O", "P", "T", "SPOT");
//        GameObject game5 = new GameObject(4, "E", "A", "D", "I", "IDEA");
//        GameObject game6 = new GameObject(5, "T", "A", "K", "L", "TALK");
//        GameObject game7 = new GameObject(6, "C", "A", "L", "M", "CALM");
//        GameObject game8 = new GameObject(7, "P", "S", "U", "O", "SOUP");
//        GameObject game9 = new GameObject(8, "M", "E", "A", "Z", "MAZE");
//        GameObject game10 = new GameObject(9, "D", "U", "C", "K", "DUCK");
//        games.add(game1);
//        games.add(game2);
//        games.add(game3);
//        games.add(game4);
//        games.add(game5);
//        games.add(game6);
//        games.add(game7);
//        games.add(game8);
//        games.add(game9);
//        games.add(game10);
//
//        start_button.setText(games.get(0).getLetter1());
//        button2.setText(games.get(0).getLetter2());
//        button3.setText(games.get(0).getLetter3());
//        button4.setText(games.get(0).getLetter4());
//
//
//        GridLayout grid = (GridLayout)  getView().findViewById(R.id.gridview);
//        // listener = getTouchListener();
//
////        start_button.setOnTouchListener(listener);
////        button2.setOnTouchListener(listener);
////        button3.setOnTouchListener(listener);
////        button4.setOnTouchListener(listener);
//
//        return inflater.inflate(R.layout.fragment_game_board, container, false);
//
//
//    }
//
//
//
//}
