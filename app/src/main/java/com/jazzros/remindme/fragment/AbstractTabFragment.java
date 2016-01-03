package com.jazzros.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by Oktay on 03.01.2016.
 */
public class AbstractTabFragment extends Fragment {
    private String title;
    private Context context;

    protected View view;

    protected void setContext(Context context) {
        this.context = context;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
