package com.example.willie_the_coyote.beep_beep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView visitCard = (ImageView)findViewById(R.id.visit_card);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.show_visit_card);
        visitCard.startAnimation(animation1);
    }
}
