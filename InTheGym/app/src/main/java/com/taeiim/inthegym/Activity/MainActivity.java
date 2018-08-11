package com.taeiim.inthegym.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.taeiim.inthegym.Fragment.GymFragment;
import com.taeiim.inthegym.Fragment.HomeFragment;
import com.taeiim.inthegym.R;

public class MainActivity extends AppCompatActivity {
    private AHBottomNavigation bottomTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpTabLayout();
    }

    private void setUpTabLayout() {
        bottomTabLayout = (AHBottomNavigation) findViewById(R.id.main_tabLayout);

        AHBottomNavigationItem item1 = new AHBottomNavigationItem("홈", R.drawable.ic_person);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("체육관", R.drawable.ic_person);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("운동모집", R.drawable.ic_person);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem("MY", R.drawable.ic_person);

        AHBottomNavigationItem[] navigationItems = {item1,item2,item3,item4};

        for(AHBottomNavigationItem navigationItem : navigationItems){
            bottomTabLayout.addItem(navigationItem);
        }

        bottomTabLayout.setAccentColor(Color.parseColor("#4a90e2"));
        bottomTabLayout.setInactiveColor(Color.parseColor("#b7b7b7"));
        bottomTabLayout.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottomTabLayout.setCurrentItem(0);
        bottomTabLayout.setTitleTextSizeInSp(10,10);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
        bottomTabLayout.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                switch (position) {
                    case 0:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                        break;
                    case 1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new GymFragment()).commit();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                        break;
                    case 3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
                        break;
                }
                return true;
            }
        });
        bottomTabLayout.setOnNavigationPositionListener(new AHBottomNavigation.OnNavigationPositionListener() {
            @Override public void onPositionChange(int y) {

            }
        });
    }
}
