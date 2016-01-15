package com.example.willie_the_coyote.beep_beep;


import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevel2x2;
import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevel3x3;
import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevel4x4;
import com.example.willie_the_coyote.beep_beep.Interfaces.IFragmentChangeListener;


public class ChooseLevel extends AppCompatActivity implements IFragmentChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        TextView tv = (TextView) findViewById(R.id.tv_attempt);
        Typeface face = Typeface.createFromAsset(getAssets(), "font/cactus_font.ttf");
        tv.setTypeface(face);

        Intent intent = getIntent();
        String difficultyString = intent.getStringExtra("diff");

        switch (difficultyString) {
            case "2x2":
                ChooseLevel2x2 frag2x2 = new ChooseLevel2x2();
                replaceFragment(frag2x2);
                break;

            case "3x3":
                ChooseLevel3x3 frag3x3 = new ChooseLevel3x3();
                replaceFragment(frag3x3);
                break;

            case "4x4":
                ChooseLevel4x4 frag4x4 = new ChooseLevel4x4();
                replaceFragment(frag4x4);
                break;
        }
    }

    public void loadLevel(View view) {
        Intent intent;
        intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    @Override
    public void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_level_grid_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
