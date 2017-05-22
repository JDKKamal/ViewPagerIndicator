package com.jdkgroup.viewpagerindicator.indicatorview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jdkgroup.viewpagerindicator.R;

import java.util.ArrayList;
import java.util.List;


public class AdapterIndicatorView extends CustomPagerAdapter<AdapterIndicatorView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<Integer> tutorialImage = new ArrayList<>();

    public AdapterIndicatorView(Context context) {
        this.context = context;
    }

    @Override
    public AdapterIndicatorView.ViewHolder onCreateViewHolder(ViewGroup parent) {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }
        View view = inflater.inflate(R.layout.layout_pageindicator, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterIndicatorView.ViewHolder viewHolder, int position) {
        viewHolder.text.setText(String.valueOf(position + 1));
    }

    @Override
    public int getCount() {
        return tutorialImage.size();
    }

    public void setTutorialImage(List<Integer> tutorialImage) {
        this.tutorialImage.clear();
        this.tutorialImage.addAll(tutorialImage);
        notifyDataSetChanged();
    }

    public class ViewHolder extends CustomPagerAdapter.ViewHolder {
        TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }
}
