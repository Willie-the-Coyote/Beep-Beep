package com.example.willie_the_coyote.beep_beep;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelDifficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_difficulty);
    }

    public void loadChooseLevel2x2(View view){
       attachDifficultyInfo("2x2");
    }

    public void loadChooseLevel3x3(View view) {
        attachDifficultyInfo("3x3");
    }

    public void attachDifficultyInfo(String difficulty){
        Intent intent;
        intent = new Intent(this, ChooseLevel.class);
        String frag = "2x2";
        intent.putExtra("diff", difficulty);
        startActivity(intent);
    }
}
