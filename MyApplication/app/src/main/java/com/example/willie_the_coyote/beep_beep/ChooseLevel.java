package com.example.willie_the_coyote.beep_beep;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.willie_the_coyote.beep_beep.Fragments.ChooseLevelFragment;
import com.example.willie_the_coyote.beep_beep.Fragments.GameFragment;

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
    }

    public void loadLevel(View view) {
        String id = view.getResources().getResourceName(view.getId());
        int numberLevel = Integer.parseInt(id.substring(id.length() - 1));

        viewPager.setCurrentItem(numberLevel + 1);
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
