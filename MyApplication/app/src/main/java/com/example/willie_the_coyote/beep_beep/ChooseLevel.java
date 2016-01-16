package com.example.willie_the_coyote.beep_beep;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevelFragment;
import com.example.willie_the_coyote.beep_beep.Fragments.GameFragment;
import com.example.willie_the_coyote.beep_beep.Objects.GameObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ChooseLevel extends AppCompatActivity {
    public static final String DIFICULTY_LEVEL = "DificultyLevel";
    public static final int CURRRENT_PAGE = 1;



    private int difficulty;
    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;
    private ArrayList<GameObject> levels = new ArrayList<GameObject>();
    private GameObject game1 = new GameObject(1, new ArrayList<String>(Arrays.asList("S", "T", "A", "L")), new ArrayList<String>(Arrays.asList("SALT")), 2);
    private GameObject game2 = new GameObject(2, new ArrayList<String>(Arrays.asList("C", "H", "I", "N")), new ArrayList<String>(Arrays.asList("CHIN")), 2);
    private GameObject game3 = new GameObject(3, new ArrayList<String>(Arrays.asList("S", "T", "A", "L")), new ArrayList<String>(Arrays.asList("SALT")), 2);
    private GameObject game4 = new GameObject(4, new ArrayList<String>(Arrays.asList("C", "H", "I", "N")), new ArrayList<String>(Arrays.asList("CHIN")), 2);
    private GameObject game5 = new GameObject(5, new ArrayList<String>(Arrays.asList("S", "T", "A", "L")), new ArrayList<String>(Arrays.asList("SALT")), 2);
    private GameObject game6 = new GameObject(6, new ArrayList<String>(Arrays.asList("C", "H", "I", "N")), new ArrayList<String>(Arrays.asList("CHIN")), 2);
    private GameObject game7 = new GameObject(7, new ArrayList<String>(Arrays.asList("S", "T", "A", "L")), new ArrayList<String>(Arrays.asList("SALT")), 2);
    private GameObject game8 = new GameObject(8, new ArrayList<String>(Arrays.asList("C", "H", "I", "N")), new ArrayList<String>(Arrays.asList("CHIN")), 2);
    private GameObject game9 = new GameObject(9, new ArrayList<String>(Arrays.asList("S", "T", "A", "L")), new ArrayList<String>(Arrays.asList("SALT")), 2);

    private GameObject game11 = new GameObject(1, new ArrayList<String>(Arrays.asList("L", "S", "E", "L", "I", "D", "L", "O", "D")), new ArrayList<String>(Arrays.asList("SLIDE", "DOLL")), 3);
    private GameObject game12 = new GameObject(2, new ArrayList<String>(Arrays.asList("D", "C", "K", "U", "K", "A", "K", "A", "Y")), new ArrayList<String>(Arrays.asList("DUCK", "KAYAK")), 3);
    private GameObject game13 = new GameObject(3, new ArrayList<String>(Arrays.asList("L", "S", "E", "L", "I", "D", "L", "O", "D")), new ArrayList<String>(Arrays.asList("SLIDE", "DOLL")), 3);
    private GameObject game14 = new GameObject(4, new ArrayList<String>(Arrays.asList("D", "C", "K", "U", "K", "A", "K", "A", "Y")), new ArrayList<String>(Arrays.asList("DUCK", "KAYAK")), 3);
    private GameObject game15 = new GameObject(5, new ArrayList<String>(Arrays.asList("L", "S", "E", "L", "I", "D", "L", "O", "D")), new ArrayList<String>(Arrays.asList("SLIDE", "DOLL")), 3);
    private GameObject game16 = new GameObject(6, new ArrayList<String>(Arrays.asList("D", "C", "K", "U", "K", "A", "K", "A", "Y")), new ArrayList<String>(Arrays.asList("DUCK", "KAYAK")), 3);
    private GameObject game17 = new GameObject(7, new ArrayList<String>(Arrays.asList("L", "S", "E", "L", "I", "D", "L", "O", "D")), new ArrayList<String>(Arrays.asList("SLIDE", "DOLL")), 3);
    private GameObject game18 = new GameObject(8, new ArrayList<String>(Arrays.asList("D", "C", "K", "U", "K", "A", "K", "A", "Y")), new ArrayList<String>(Arrays.asList("DUCK", "KAYAK")), 3);
    private GameObject game19 = new GameObject(9, new ArrayList<String>(Arrays.asList("L", "S", "E", "L", "I", "D", "L", "O", "D")), new ArrayList<String>(Arrays.asList("SLIDE", "DOLL")), 3);

    private GameObject game21 = new GameObject(1, new ArrayList<String>(Arrays.asList("E", "N", "R", "D", "L", "O", "C", "O", "H", "B", "A", "T", "R", "T", "R", "E")), new ArrayList<String>(Arrays.asList("TABLE", "RECORD", "NORTH")), 4);
    private GameObject game22 = new GameObject(2, new ArrayList<String>(Arrays.asList("D", "O", "O", "R", "R", "A", "P", "O", "A", "O", "B", "U", "L", "V", "C", "F")), new ArrayList<String>(Arrays.asList("CUPBOARD", "OVAL", "ROOF")), 4);
    private GameObject game23 = new GameObject(3, new ArrayList<String>(Arrays.asList("E", "N", "R", "D", "L", "O", "C", "O", "H", "B", "A", "T", "R", "T", "R", "E")), new ArrayList<String>(Arrays.asList("TABLE", "RECORD", "NORTH")), 4);
    private GameObject game24 = new GameObject(4, new ArrayList<String>(Arrays.asList("D", "O", "O", "R", "R", "A", "P", "O", "A", "O", "B", "U", "L", "V", "C", "F")), new ArrayList<String>(Arrays.asList("CUPBOARD", "OVAL", "ROOF")), 4);
    private GameObject game25 = new GameObject(5, new ArrayList<String>(Arrays.asList("E", "N", "R", "D", "L", "O", "C", "O", "H", "B", "A", "T", "R", "T", "R", "E")), new ArrayList<String>(Arrays.asList("TABLE", "RECORD", "NORTH")), 4);
    private GameObject game26 = new GameObject(6, new ArrayList<String>(Arrays.asList("D", "O", "O", "R", "R", "A", "P", "O", "A", "O", "B", "U", "L", "V", "C", "F")), new ArrayList<String>(Arrays.asList("CUPBOARD", "OVAL", "ROOF")), 4);
    private GameObject game27 = new GameObject(7, new ArrayList<String>(Arrays.asList("E", "N", "R", "D", "L", "O", "C", "O", "H", "B", "A", "T", "R", "T", "R", "E")), new ArrayList<String>(Arrays.asList("TABLE", "RECORD", "NORTH")), 4);
    private GameObject game28 = new GameObject(8, new ArrayList<String>(Arrays.asList("D", "O", "O", "R", "R", "A", "P", "O", "A", "O", "B", "U", "L", "V", "C", "F")), new ArrayList<String>(Arrays.asList("CUPBOARD", "OVAL", "ROOF")), 4);
    private GameObject game29 = new GameObject(9, new ArrayList<String>(Arrays.asList("E", "N", "R", "D", "L", "O", "C", "O", "H", "B", "A", "T", "R", "T", "R", "E")), new ArrayList<String>(Arrays.asList("TABLE", "RECORD", "NORTH")), 4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        levels.addAll(Arrays.asList(game1,game2, game3, game4, game5, game6, game7, game8, game9,game11,game12, game13, game14, game15, game16, game17, game18, game19,game21,game22, game23, game24, game25, game26, game27, game28, game29));
        GridLayout grid = (GridLayout) findViewById(R.id.gridview);

        Intent intent = getIntent();
        difficulty = Integer.parseInt(intent.getStringExtra("diff"));

        viewPager = (ViewPager) this.findViewById(R.id.vp_choose_level);
        adapter = new ChooseLevelAdapter(this.getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    public void loadLevel1(View view){
        int id = 1;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel2(View view){
        int id = 2;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel3(View view){
        int id = 3;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel4(View view){
        int id = 4;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel5(View view){
        int id = 5;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel6(View view){
        int id = 6;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel7(View view){
        int id = 7;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel8(View view){
        int id = 8;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }
    public void loadLevel9(View view){
        int id = 9;
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);

        viewPager.setCurrentItem(CURRRENT_PAGE);
    }

    //public GameObject current;
    public void loadLevel(View view) {
        int id = 0;
        //String id = view.getResources().getResourceName(view.getId());
        //int numberLevel = Integer.parseInt(R.id.);
        GameObject  current = loadNeededLevel(difficulty, id);
        populateButtons(current);
        viewPager.setCurrentItem(id);
    }

    public void populateButtons(GameObject game){
        for(int i = 0; i < game.Letters.size(); i++){
            GameFragment.buttons.get(i).setText(game.Letters.get(i).toString());
        }
    }

    public GameObject loadNeededLevel(int difficulty, int numberLevel){
        GameObject current = null;
        for(int i=0; i < levels.size(); i++){
            if(levels.get(i).Dificulty == difficulty){
                if(levels.get(i).Level == numberLevel) {
                    current =  levels.get(i);
                    break;

                }
            }
        }

        return current;

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
}
