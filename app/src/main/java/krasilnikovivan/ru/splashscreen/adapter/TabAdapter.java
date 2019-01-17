package krasilnikovivan.ru.splashscreen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import krasilnikovivan.ru.splashscreen.fragments.CurrentTask;
import krasilnikovivan.ru.splashscreen.fragments.DoneTask;

public class TabAdapter extends FragmentStatePagerAdapter {
    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
               return new CurrentTask();
            case 1:
               return new DoneTask();
               default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
