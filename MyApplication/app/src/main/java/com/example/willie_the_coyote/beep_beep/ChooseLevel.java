package com.example.willie_the_coyote.beep_beep;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevelFragment;
import com.example.willie_the_coyote.beep_beep.Fragments.GameFragment;
import com.example.willie_the_coyote.beep_beep.Interfaces.IFragmentChangeListener;


public class ChooseLevel extends AppCompatActivity {
    public static final String DIFICULTY_LEVEL = "DificultyLevel";

    private int difficulty;
    private ViewPager viewPager;
    private FragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);

        Intent intent = getIntent();
        difficulty = Integer.parseInt(intent.getStringExtra("diff"));

        viewPager = (ViewPager) this.findViewById(R.id.vp_choose_level);
        adapter = new ChooseLevelAdapter(this.getSupportFragmentManager());
        viewPager.setAdapter(adapter);

//        switch (difficultyString) {
//            case "2x2":
//                ChooseLevel2x2 frag2x2 = new ChooseLevel2x2();
//                replaceFragment(frag2x2);
//                break;
//
//            case "3x3":
//                ChooseLevel3x3 frag3x3 = new ChooseLevel3x3();
//                replaceFragment(frag3x3);
//                break;
//
//            case "4x4":
//                ChooseLevel4x4 frag4x4 = new ChooseLevel4x4();
//                replaceFragment(frag4x4);
//                break;
//
//            case "5x5":
//                ChooseLevel5x5 frag5x5 = new ChooseLevel5x5();
//                replaceFragment(frag5x5);
//                break;
//        }
    }

    public void loadLevel(View view) {
        String id = view.getResources().getResourceName(view.getId());
        int numberLevel = Integer.parseInt(id.substring(id.length() - 1));

        viewPager.setCurrentItem(numberLevel + 1);
    }

    public void loadLevelOne2x2(View view) {
        attachBoardInfo("FirstLevel");
    }

    public void attachBoardInfo(String difficulty){
        Intent intent;
        intent = new Intent(this, GameActivity.class);
        intent.putExtra("board", difficulty);
        startActivity(intent);
    }

    private class ChooseLevelAdapter extends FragmentPagerAdapter {
        public ChooseLevelAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0: fragment = new ChooseLevelFragment(); break;
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
