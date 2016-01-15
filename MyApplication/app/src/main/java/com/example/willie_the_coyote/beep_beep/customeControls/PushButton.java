package com.example.willie_the_coyote.beep_beep.customeControls;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import com.example.willie_the_coyote.beep_beep.ChooseLevel;
import com.example.willie_the_coyote.beep_beep.GameActivity;

import java.util.ArrayList;

public class PushButton extends Button {
    public PushButton(Context context) {
        super(context);
    }

    public PushButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PushButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public static ArrayList<String> wordCombo = new ArrayList<String>();

    public static String letter;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);

        if (this.isPressed()) {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    this.setPressed(false);
                        this.setPressed(false);
                        wordCombo.remove(this.getText().toString());

                case MotionEvent.ACTION_UP:
                    return true;
            }
        } else {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    wordCombo.add(this.getText().toString());
                    letter = this.getText().toString();
                    this.setPressed(true);
                    this.performClick();

                case MotionEvent.ACTION_UP:
                        return false;
            }

            return true;
        }

        return false;
    }
}
