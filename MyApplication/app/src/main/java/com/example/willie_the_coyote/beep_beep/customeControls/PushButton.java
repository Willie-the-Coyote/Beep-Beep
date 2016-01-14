package com.example.willie_the_coyote.beep_beep.customeControls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

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

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);

        if (this.isPressed()) {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    this.setPressed(false);
                        this.setPressed(false);
                case MotionEvent.ACTION_UP:
                    return true;
            }
        } else {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    this.setPressed(true);
                case MotionEvent.ACTION_UP:
                        return false;
            }

            return true;
        }

        return false;
    }
}
