package com.example.willie_the_coyote.beep_beep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class LevelDifficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_difficulty);
    }

    public void loadChooseLevel2x2(View view) {
        ImageButton arrow = (ImageButton)findViewById(R.id.arrow_button_2x2);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_arrow_right);
        arrow.startAnimation(animation1);
        attachDifficultyInfo("2");
    }

    public void loadChooseLevel3x3(View view) {
        ImageButton arrow = (ImageButton)findViewById(R.id.arrow_button_3x3);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_arrow_left);
        arrow.startAnimation(animation1);
        attachDifficultyInfo("3");
    }

    public void loadChooseLevel4x4(View view) {
        ImageButton arrow = (ImageButton)findViewById(R.id.arrow_button_4x4);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_arrow_right);
        arrow.startAnimation(animation1);
        attachDifficultyInfo("4");
    }

    public void loadChooseLevel5x5(View view) {
        ImageButton arrow = (ImageButton)findViewById(R.id.arrow_button_5x5);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move_arrow_left);
        arrow.startAnimation(animation1);
        attachDifficultyInfo("5");
    }

    public void attachDifficultyInfo(String difficulty) {
        Intent intent;
        intent = new Intent(this, ChooseLevel.class);
        intent.putExtra("diff", difficulty);
        startActivity(intent);
    }

    public void loadAboutPage(View view) {
        ImageButton arrow = (ImageButton)findViewById(R.id.arrow_button_about);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        arrow.startAnimation(animation1);
    }
}
