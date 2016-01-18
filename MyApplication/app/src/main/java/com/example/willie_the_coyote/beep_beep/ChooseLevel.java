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
    public static ArrayList<GameObject> levels = new ArrayList<GameObject>();

    private GameObject game1 = new GameObject(1,
            new ArrayList<String>(Arrays.asList("S", "T", "A", "L")),
            new ArrayList<String>(Arrays.asList("SALT"))
            , new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game2 = new GameObject(2,
            new ArrayList<String>(Arrays.asList("C", "H", "I", "N")),
            new ArrayList<String>(Arrays.asList("CHIN")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game3 = new GameObject(3,
            new ArrayList<String>(Arrays.asList("O", "A", "V", "L")),
            new ArrayList<String>(Arrays.asList("OVAL")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game4 = new GameObject(4,
            new ArrayList<String>(Arrays.asList("T", "K", "E", "I")),
            new ArrayList<String>(Arrays.asList("KITE")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game5 = new GameObject(5,
            new ArrayList<String>(Arrays.asList("G", "T", "O", "A")),
            new ArrayList<String>(Arrays.asList("GOAT")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game6 = new GameObject(6,
            new ArrayList<String>(Arrays.asList("L", "I", "A", "S")),
            new ArrayList<String>(Arrays.asList("SAIL")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game7 = new GameObject(7,
            new ArrayList<String>(Arrays.asList("A", "M", "T", "S")),
            new ArrayList<String>(Arrays.asList("MAST")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game8 = new GameObject(8,
            new ArrayList<String>(Arrays.asList("H", "T", "A", "P")),
            new ArrayList<String>(Arrays.asList("PATH")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);
    private GameObject game9 = new GameObject(9,
            new ArrayList<String>(Arrays.asList("K", "C", "R", "O")),
            new ArrayList<String>(Arrays.asList("ROCK")),
            new ArrayList<Boolean>(Arrays.asList(false)), 2);

    private GameObject game11 = new GameObject(1,
            new ArrayList<String>(Arrays.asList("L", "S", "E", "L", "I", "D", "L", "O", "D")),
            new ArrayList<String>(Arrays.asList("SLIDE", "DOLL")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game12 = new GameObject(2,
            new ArrayList<String>(Arrays.asList("D", "C", "K", "U", "K", "A", "K", "A", "Y")),
            new ArrayList<String>(Arrays.asList("DUCK", "KAYAK")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game13 = new GameObject(3,
            new ArrayList<String>(Arrays.asList("D", "T", "R", "I", "A", "E", "E", "C", "H")),
            new ArrayList<String>(Arrays.asList("HEART", "DICE")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game14 = new GameObject(4,
            new ArrayList<String>(Arrays.asList("H", "E", "D", "S", "I", "B", "A", "R", "F")),
            new ArrayList<String>(Arrays.asList("FISH", "BEARD")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game15 = new GameObject(5,
            new ArrayList<String>(Arrays.asList("D", "N", "F", "L", "A", "C", "E", "N", "A")),
            new ArrayList<String>(Arrays.asList("CANDLE", "FAN")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game16 = new GameObject(6,
            new ArrayList<String>(Arrays.asList("B", "X", "E", "A", "R", "O", "R", "B", "L")),
            new ArrayList<String>(Arrays.asList("BOX", "BARREL")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game17 = new GameObject(7,
            new ArrayList<String>(Arrays.asList("D", "T", "E", "I", "Y", "M", "C", "E", "P")),
            new ArrayList<String>(Arrays.asList("DICE", "EMPTY")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game18 = new GameObject(8,
            new ArrayList<String>(Arrays.asList("H", "A", "P", "T", "U", "M", "L", "O", "S")),
            new ArrayList<String>(Arrays.asList("SOUTH", "LAMP")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);
    private GameObject game19 = new GameObject(9,
            new ArrayList<String>(Arrays.asList("M", "N", "L", "C", "E", "I", "A", "I", "M")),
            new ArrayList<String>(Arrays.asList("MINCE", "MAIL")),
            new ArrayList<Boolean>(Arrays.asList(false, false)), 3);

    private GameObject game21 = new GameObject(1,
            new ArrayList<String>(Arrays.asList("E", "N", "R", "D", "L", "O", "C", "O", "H", "B", "A", "T", "R", "T", "R", "E")),
            new ArrayList<String>(Arrays.asList("TABLE", "RECORD", "NORTH")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game22 = new GameObject(2,
            new ArrayList<String>(Arrays.asList("D", "O", "O", "R", "R", "A", "P", "O", "A", "O", "B", "U", "L", "V", "C", "F")),
            new ArrayList<String>(Arrays.asList("CUPBOARD", "OVAL", "ROOF")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game23 = new GameObject(3,
            new ArrayList<String>(Arrays.asList("B", "E", "S", "N", "A", "T", "E", "R", "R", "A", "N", "K", "R", "L", "L", "A")),
            new ArrayList<String>(Arrays.asList("LANTERN", "ASK", "BARREL")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game24 = new GameObject(4,
            new ArrayList<String>(Arrays.asList("L", "H", "E", "S", "I", "E", "P", "H", "C", "P", "A", "E", "N", "E", "T", "R")),
            new ArrayList<String>(Arrays.asList("PENCIL", "EARTH", "SHEEP")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game25 = new GameObject(5,
            new ArrayList<String>(Arrays.asList("E", "K", "S", "Y", "I", "C", "T", "R", "D", "H", "E", "E", "I", "L", "L", "C")),
            new ArrayList<String>(Arrays.asList("CELERY", "THICK", "SLIDE")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game26 = new GameObject(6,
            new ArrayList<String>(Arrays.asList("R", "C", "O", "U", "O", "W", "G", "E", "M", "R", "T", "N", "I", "R", "O", "R")),
            new ArrayList<String>(Arrays.asList("MIRROR", "TONGUE", "CROW")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game27 = new GameObject(7,
            new ArrayList<String>(Arrays.asList("N", "H", "Y", "N", "P", "R", "M", "O", "R", "O", "S", "L", "U", "T", "E", "E")),
            new ArrayList<String>(Arrays.asList("TROPHY", "NURSE", "MELON")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game28 = new GameObject(8,
            new ArrayList<String>(Arrays.asList("D", "K", "N", "R", "R", "I", "A", "E", "O", "B", "T", "T", "N", "C", "B", "U")),
            new ArrayList<String>(Arrays.asList("BUTTER", "BACON", "DRINK")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);
    private GameObject game29 = new GameObject(9,
            new ArrayList<String>(Arrays.asList("B", "N", "G", "Y", "A", "K", "I", "S", "G", "L", "V", "E", "G", "O", "E", "R")),
            new ArrayList<String>(Arrays.asList("GLOVES", "BAG", "KEYRING")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false)), 4);

    private GameObject game31 = new GameObject(1,
            new ArrayList<String>(Arrays.asList("O", "E", "A", "N", "P", "K", "M", "T", "O", "P", "S", "F", "A", "L", "I", "R", "C", "O", "O","L","A","I","N", "G","L")),
            new ArrayList<String>(Arrays.asList("RAINCOAT","SMOKE","LOLLIPOP","FANG")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game32 = new GameObject(2,
            new ArrayList<String>(Arrays.asList("K", "O", "E", "P", "R", "H", "I", "L", "E", "E", "P", "O", "L", "A", "T", "D", "W", "K", "C","N","O","O","U", "B","I")),
            new ArrayList<String>(Arrays.asList("WOODPILE","BUCKLE","PAINTER","HOOK")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game33 = new GameObject(3,
            new ArrayList<String>(Arrays.asList("R", "E", "L", "D", "B", "S", "E", "O", "I", "O", "P", "P", "R", "U", "L", "L", "I", "E", "P","I","S","T","L", "E","V")),
            new ArrayList<String>(Arrays.asList("SLIPPERS","PERIOD","OLIVE","BULLET")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game34 = new GameObject(4,
            new ArrayList<String>(Arrays.asList("V", "A", "N", "M", "O", "I", "P", "V", "E", "O", "T", "O", "A", "R", "R", "T", "S", "M", "E","D", "M","I","I", "P","B")),
            new ArrayList<String>(Arrays.asList("STOP","BEDROOM","VAMPIRE","VITAMINE")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game35 = new GameObject(5,
            new ArrayList<String>(Arrays.asList("P", "E", "S", "O", "C", "L", "T", "P", "C", "Y", "L", "U", "T", "N", "E", "B", "R", "L", "P","I","U","S","E", "T","A")),
            new ArrayList<String>(Arrays.asList("PATIENT","CYCLOPS","BULLET","PURSE")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game36 = new GameObject(6,
            new ArrayList<String>(Arrays.asList("D", "N", "T", "A", "T", "A", "B", "A", "R", "E", "D", "A", "E", "C", "H", "A", "C", "M", "I","N","H","E","H", "S","H")),
            new ArrayList<String>(Arrays.asList("HEADBAND","CAMERA","HATCHET","SHIN")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game37 = new GameObject(7,
            new ArrayList<String>(Arrays.asList("T", "G", "I", "R", "U", "E", "L", "N", "W", "A", "I", "N", "I", "L", "S", "R", "R", "O", "O","F","A","E","T", "D","O")),
            new ArrayList<String>(Arrays.asList("TOILET","DINOSAUR","EARRING","WOLF")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game38 = new GameObject(8,
            new ArrayList<String>(Arrays.asList("A", "N", "K", "D", "P", "P", "D", "R", "O", "E", "T", "E", "L", "C", "R", "N", "Y", "E", "M","I","L","A","T", "P","O")),
            new ArrayList<String>(Arrays.asList("LANTERN","PADLOCK","EMPTY","PERIOD")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);
    private GameObject game39 = new GameObject(9,
            new ArrayList<String>(Arrays.asList("K", "T", "R", "T", "E", "N", "O", "R", "N", "R", "H", "I", "B", "A", "I", "O", "T", "R", "E","P","G","I","D", "T","E")),
            new ArrayList<String>(Arrays.asList("DRINK","BEETROOT","RIGHT","PAINTER")),
            new ArrayList<Boolean>(Arrays.asList(false, false, false, false)), 5);

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    private long lastUpdate = 0;
    private float last_x, last_y, last_z;
    private static final int SHAKE_THRESHOLD = 600;

    private SensorManager senSensorManager;
    private Sensor senAccelerometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        levels.addAll(Arrays.asList(game1, game2, game3, game4, game5, game6, game7, game8, game9,
                game11, game12, game13, game14, game15, game16, game17, game18, game19,
                game21, game22, game23, game24, game25, game26, game27, game28, game29,
                game31, game32, game33, game34, game35, game36, game37, game38, game39));
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
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel2(View view) {
        int id = 2;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel3(View view) {
        int id = 3;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel4(View view) {
        int id = 4;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel5(View view) {
        int id = 5;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel6(View view) {
        int id = 6;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel7(View view) {
        int id = 7;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel8(View view) {
        int id = 8;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    public void loadLevel9(View view) {
        int id = 9;
        current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }


    public void loadLevel(GameObject game) {
        game = loadNeededLevel(game.Dificulty, game.Level);
        populateButtons(game);
        viewPager.setCurrentItem(CURRRENT_PAGE);
    }


    public void populateButtons(GameObject game) {
        for (int i = 0; i < game.Letters.size(); i++) {
            GameFragment.buttons.get(i).setText(game.Letters.get(i).toString());
        }
    }

    public GameObject loadNeededLevel(int difficulty, int numberLevel) {
        GameObject current = null;
        for (int i = 0; i < levels.size(); i++) {
            if (levels.get(i).Dificulty == difficulty) {
                if (levels.get(i).Level == numberLevel) {
                    current = levels.get(i);
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
