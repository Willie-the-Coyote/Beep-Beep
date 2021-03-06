package com.example.willie_the_coyote.beep_beep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.willie_the_coyote.beep_beep.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = (Button) findViewById(R.id.start_button);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.start_button_zoom_in);
        startBtn.startAnimation(animation);
    }

    public void loadLevelDifficulty(View view) {
        Intent intent;
        intent = new Intent(this, LevelDifficulty.class);
        startActivity(intent);
    }
}
