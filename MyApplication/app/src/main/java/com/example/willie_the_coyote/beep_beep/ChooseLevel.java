package com.example.willie_the_coyote.beep_beep;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChooseLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        TextView tv=(TextView)findViewById(R.id.tv_attempt);
        Typeface face=Typeface.createFromAsset(getAssets(), "font/cactus_font.ttf");
        tv.setTypeface(face);
    }

    public void loadLevel(View view){
        Intent intent;
        intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
