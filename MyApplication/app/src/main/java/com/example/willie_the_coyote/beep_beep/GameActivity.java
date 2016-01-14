package com.example.willie_the_coyote.beep_beep;

import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;

public class GameActivity extends AppCompatActivity implements View.OnTouchListener {

    private PushButton button1;
    private PushButton button2;
    private PushButton button3;
    private PushButton button4;
    private View.OnTouchListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button1 = (PushButton) findViewById(R.id.Tile1);
        button2 = (PushButton) findViewById(R.id.Tile2);
        button3 = (PushButton) findViewById(R.id.Tile3);
        button4 = (PushButton) findViewById(R.id.Tile4);

        GridLayout grid = (GridLayout) findViewById(R.id.gridview);
       // listener = getTouchListener();

//        button1.setOnTouchListener(listener);
//        button2.setOnTouchListener(listener);
//        button3.setOnTouchListener(listener);
//        button4.setOnTouchListener(listener);
    }

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
