package com.mypopsy.slidinguppanelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

public class ScrollViewFragment extends BaseFragment<ScrollView> {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_scrollview, container, false);
    }

    @Override
    protected void populate(ScrollView scrollView) {
        ViewGroup content = ((ViewGroup)scrollView.getChildAt(0));
        for(int i = 0; i < getItemCount(); i++)
            content.addView(bindItemView(createItemView(content), i));
    }
}
