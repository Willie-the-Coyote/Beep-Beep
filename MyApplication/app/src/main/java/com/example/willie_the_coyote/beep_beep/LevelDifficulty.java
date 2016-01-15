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
       attachDifficultyInfo("2");
    }

    public void loadChooseLevel3x3(View view) {
        attachDifficultyInfo("3");
    }

    public void loadChooseLevel4x4(View view) {
        attachDifficultyInfo("4");
    }

    public void loadChooseLevel5x5(View view) {
        attachDifficultyInfo("5");
    }

    public void attachDifficultyInfo(String difficulty){
        Intent intent;
        intent = new Intent(this, ChooseLevel.class);
        intent.putExtra("diff", difficulty);
        startActivity(intent);
    }
}
