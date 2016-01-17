//package com.example.willie_the_coyote.beep_beep;
//
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.MotionEvent;
//import android.view.View;
//import android.widget.Button;
//
//import com.example.willie_the_coyote.beep_beep.Fragments.GameBoards.GameBoard2x2;
//import com.example.willie_the_coyote.beep_beep.Interfaces.IFragmentChangeListener;
//import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;
//
//import java.util.ArrayList;
//
//public class GameActivity extends AppCompatActivity implements View.OnTouchListener {
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game);
//    }
//
////    private void onGameLoad() {
////        for(int i= 0; i < games.size(); i++){
////            start_button.setText(games.get(i).getLetter1());
////            button2.setText(games.get(i).getLetter2());
////            button3.setText(games.get(i).getLetter3());
////            button4.setText(games.get(i).getLetter4());
////
////        }
////    }
//
////    public View.OnTouchListener getTouchListener() {
////        return new View.OnTouchListener() {
////            @Override
////            public boolean onTouch(View v, MotionEvent event) {
////                switch (event.getAction()) {
////                    case MotionEvent.ACTION_DOWN:
////                        if (start_button.isPressed()) {
////                            start_button.setPressed(true);
////                        } else if (button2.isPressed()) {
////                            button2.setPressed(true);
////                        } else if (button3.isPressed()) {
////                            button3.setPressed(true);
////                        } else if (button4.isPressed()) {
////                            button4.setPressed(true);
////                        }
////                        return true;
////
////                    case MotionEvent.ACTION_MOVE:
////                        if (start_button.isPressed()) {
////                            start_button.setPressed(true);
////                        } else if (button2.isPressed()) {
////                            button2.setPressed(true);
////                        } else if (button3.isPressed()) {
////                            button3.setPressed(true);
////                        } else if (button4.isPressed()) {
////                            button4.setPressed(true);
////                        }
////                        break;
////                    case MotionEvent.ACTION_UP:
////                        return true;
////                    default:
////                        return false;
////                }
////
////                return true;
////            }
////        };
////    }
//
//    @Override
//    public boolean onTouch(View v, MotionEvent event) {
//        switch (event.getActionMasked()) {
//            case MotionEvent.ACTION_MOVE:
//        }
//        return true;
//    }
//}
