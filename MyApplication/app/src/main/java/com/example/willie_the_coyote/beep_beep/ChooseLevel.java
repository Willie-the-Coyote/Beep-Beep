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
import com.example.willie_the_coyote.beep_beep.Interfaces.IFragmentChangeListener;


public class ChooseLevel extends AppCompatActivity implements IFragmentChangeListener {

    private static final String DETAILFRAGMENT_TAG = "PESHO";
    ChooseLevel2x2 fragment = new ChooseLevel2x2();

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
                // Create new fragment and transaction
                ChooseLevel2x2 frag = new ChooseLevel2x2();
                replaceFragment(frag);
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
