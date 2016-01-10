package com.example.willie_the_coyote.beep_beep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.willie_the_coyote.beep_beep.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadLevelDifficulty(View view) {
        Intent intent;
        intent = new Intent(this, ChooseLevel.class);
       startActivity(intent);
    }
}
