package com.jazzros.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jazzros.remindme.Constants;
import com.jazzros.remindme.fragment.ExampleFragment;


public class TabsPagerFramentAdapter extends FragmentPagerAdapter {

    private String [] tabs;

    public TabsPagerFramentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Tab 1",
                "Notification",
                "Tab 2"
            };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case Constants.TAB_ONE:
                return ExampleFragment.getInstance();
            case Constants.TAB_TWO:
                return ExampleFragment.getInstance();
            case Constants.TAB_THREE:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
