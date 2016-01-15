package com.example.willie_the_coyote.beep_beep;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

import com.example.willie_the_coyote.beep_beep.Objects.GameObject;
import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity implements View.OnTouchListener {

    private PushButton button1;
    private PushButton button2;
    private PushButton button3;
    private PushButton button4;
    TextView wordAtt;
    private View.OnTouchListener listener;
    public static ArrayList<GameObject> games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button1 = (PushButton) findViewById(R.id.Tile1);
        button2 = (PushButton) findViewById(R.id.Tile2);
        button3 = (PushButton) findViewById(R.id.Tile3);
        button4 = (PushButton) findViewById(R.id.Tile4);
        wordAtt = (TextView) findViewById(R.id.tv_wordAttempt);

        games = new ArrayList<GameObject>();
        GameObject game1 = new GameObject(0, "T","S", "L", "A", "SALT");
        GameObject game2 = new GameObject(1, "C", "N", "I", "N", "CHIN");
        GameObject game3 = new GameObject(2, "E", "S", "O", "N", "NOSE");
        GameObject game4 = new GameObject(3,"S", "O", "P", "T", "SPOT");
        GameObject game5 = new GameObject(4, "E", "A", "D", "I", "IDEA");
        GameObject game6 = new GameObject(5, "T", "A", "K", "L", "TALK");
        GameObject game7 = new GameObject(6, "C", "A", "L", "M", "CALM");
        GameObject game8 = new GameObject(7, "P", "S", "U", "O", "SOUP");
        GameObject game9 = new GameObject(8, "M", "E", "A", "Z", "MAZE");
        GameObject game10 = new GameObject(9, "D", "U", "C", "K", "DUCK");
        games.add(game1);
        games.add(game2);
        games.add(game3);
        games.add(game4);
        games.add(game5);
        games.add(game6);
        games.add(game7);
        games.add(game8);
        games.add(game9);
        games.add(game10);

        button1.setText(games.get(0).getLetter1());
        button2.setText(games.get(0).getLetter2());
        button3.setText(games.get(0).getLetter3());
        button4.setText(games.get(0).getLetter4());


        GridLayout grid = (GridLayout) findViewById(R.id.gridview);
       // listener = getTouchListener();

//        button1.setOnTouchListener(listener);
//        button2.setOnTouchListener(listener);
//        button3.setOnTouchListener(listener);
//        button4.setOnTouchListener(listener);
    }

    public void addLetter(View view){
        String w = "";
        for(int i=0; i < PushButton.wordCombo.size(); i++)
        {
         w+= PushButton.wordCombo.get(i).toString();
        }
        wordAtt.setText("");
        wordAtt.setText(w);
        if(w.equals(games.get(0).Word)){

            for(int i= PushButton.wordCombo.size()-1; i >=0;  i--)
            {
                PushButton.wordCombo.remove(i);
            }
            Intent intent = new Intent(this, ChooseLevel.class);
            startActivity(intent);
            wordAtt.setText("");
        }
    }

//    private void onGameLoad() {
//        for(int i= 0; i < games.size(); i++){
//            button1.setText(games.get(i).getLetter1());
//            button2.setText(games.get(i).getLetter2());
//            button3.setText(games.get(i).getLetter3());
//            button4.setText(games.get(i).getLetter4());
//
//        }
//    }

//    public View.OnTouchListener getTouchListener() {
//        return new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        if (button1.isPressed()) {
//                            button1.setPressed(true);
//                        } else if (button2.isPressed()) {
//                            button2.setPressed(true);
//                        } else if (button3.isPressed()) {
//                            button3.setPressed(true);
//                        } else if (button4.isPressed()) {
//                            button4.setPressed(true);
//                        }
//                        return true;
//
//                    case MotionEvent.ACTION_MOVE:
//                        if (button1.isPressed()) {
//                            button1.setPressed(true);
//                        } else if (button2.isPressed()) {
//                            button2.setPressed(true);
//                        } else if (button3.isPressed()) {
//                            button3.setPressed(true);
//                        } else if (button4.isPressed()) {
//                            button4.setPressed(true);
//                        }
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        return true;
//                    default:
//                        return false;
//                }
//
//                return true;
//            }
//        };
//    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_MOVE:
        }
        return true;
    }
}
