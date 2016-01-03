package com.jazzros.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import com.jazzros.remindme.R;
import com.jazzros.remindme.fragment.AbstractTabFragment;
import com.jazzros.remindme.fragment.BirthdayFragment;
import com.jazzros.remindme.fragment.HistoryFragment;
import com.jazzros.remindme.fragment.IdeaFragment;
import com.jazzros.remindme.fragment.TodoFragment;

public class TabsFramentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    Context context;

    public TabsFramentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;


        initTabMap(context);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap();

        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeaFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
