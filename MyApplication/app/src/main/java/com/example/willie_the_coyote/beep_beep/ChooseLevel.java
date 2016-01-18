package com.example.willie_the_coyote.beep_beep;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.willie_the_coyote.beep_beep.Data.GameLevels;
import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevelFragment;
import com.example.willie_the_coyote.beep_beep.Fragments.GameFragment;
import com.example.willie_the_coyote.beep_beep.Objects.GameObject;
import com.example.willie_the_coyote.beep_beep.customeControls.PushButton;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ChooseLevel extends AppCompatActivity implements SensorEventListener {
    public static final String DIFICULTY_LEVEL = "DificultyLevel";
    public static final int CURRRENT_PAGE = 1;

    private int difficulty;
    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;
    public static GameObject current;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private long lastUpdate = 0;
    private float last_x, last_y, last_z;
    private static final int SHAKE_THRESHOLD = 800;

    private SensorManager senSensorManager;
    private Sensor senAccelerometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        GameLevels gl = new GameLevels();
        gl.addData();
        GridLayout grid = (GridLayout) findViewById(R.id.gridview);

        Intent intent = getIntent();
        difficulty = Integer.parseInt(intent.getStringExtra("diff"));

        viewPager = (ViewPager) this.findViewById(R.id.vp_choose_level);
        adapter = new ChooseLevelAdapter(this.getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        setupSensor();
    }

    public void loadLevel1(View view) {
        int id = 1;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel2(View view) {
        int id = 2;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel3(View view) {
        int id = 3;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel4(View view) {
        int id = 4;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel5(View view) {
        int id = 5;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel6(View view) {
        int id = 6;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel7(View view) {
        int id = 7;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel8(View view) {
        int id = 8;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel9(View view) {
        int id = 9;
        current = loadNeededLevel(difficulty, id);
        clearLevelArray();
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void populateButtons(GameObject game) {
        for (int i = 0; i < game.Letters.size(); i++) {
            GameFragment.buttons.get(i).setText(game.Letters.get(i).toString());
        }
    }

    public void clearLevelArray(){
        for(int i= 0; i< current.guessedWords.size(); i++){
            current.guessedWords.set(i, false);
        }
    }

    public GameObject loadNeededLevel(int difficulty, int numberLevel) {
        GameObject current = null;
        for (int i = 0; i < GameLevels.levels.size(); i++) {
            if (GameLevels.levels.get(i).Dificulty == difficulty) {
                if (GameLevels.levels.get(i).Level == numberLevel) {
                    current = GameLevels.levels.get(i);
                    break;
                }
            }
        }

        return current;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "ChooseLevel Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.willie_the_coyote.beep_beep/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "ChooseLevel Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.willie_the_coyote.beep_beep/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor mySensor = sensorEvent.sensor;

        if (mySensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];

            long curTime = System.currentTimeMillis();

            if ((curTime - lastUpdate) > 100) {
                long diffTime = (curTime - lastUpdate);
                lastUpdate = curTime;

                float speed = Math.abs(x + y + z - last_x - last_y - last_z) / diffTime * 10000;

                if (speed > SHAKE_THRESHOLD) {
                    String message = "";

                    for (int i = 0; i < current.Words.size(); i++) {
                       message += current.Words.get(i) + " ";
                    }
                    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                }

                last_x = x;
                last_y = y;
                last_z = z;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private class ChooseLevelAdapter extends FragmentPagerAdapter {
        public ChooseLevelAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new ChooseLevelFragment();
                    break;
                default:
                    fragment = new GameFragment();
                    Bundle args = new Bundle();
                    args.putInt(DIFICULTY_LEVEL, difficulty);
                    fragment.setArguments(args);
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return 10;
        }
    }

    public void setupSensor(){
        senSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        senAccelerometer = senSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        senSensorManager.registerListener(this, senAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }
}
