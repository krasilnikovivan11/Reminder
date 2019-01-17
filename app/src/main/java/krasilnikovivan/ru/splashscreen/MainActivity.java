package krasilnikovivan.ru.splashscreen;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import krasilnikovivan.ru.splashscreen.adapter.TabAdapter;
import krasilnikovivan.ru.splashscreen.fragments.SplashScreen;

public class MainActivity extends AppCompatActivity {
FragmentManager fragmentManager;
Toolbar toolbar;
ViewPager viewPager;
TabLayout tabLayout;
AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        runSplash();
        setUI();
    }
    public  void runSplash(){
        SplashScreen splashScreen = new SplashScreen();
        fragmentManager.beginTransaction().replace(R.id.frame_layout,splashScreen)
                .addToBackStack(null)
                .commit();
    }
    public void setUI(){
        toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
        appBarLayout = findViewById(R.id.app_bar_layout);
        if(toolbar!=null){
            toolbar.setTitleTextColor(getResources().getColor(R.color.white));
            setSupportActionBar(toolbar);
        }
        tabLayout.addTab(
                tabLayout.newTab().setText(R.string.current_task_title)
                ,0
                ,true
        );
        tabLayout.addTab(
                tabLayout.newTab().setText(R.string.done_task_title)
                ,1
                ,false
        );
        TabAdapter tabAdapter = new TabAdapter(fragmentManager,2);
        viewPager.setAdapter(tabAdapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
