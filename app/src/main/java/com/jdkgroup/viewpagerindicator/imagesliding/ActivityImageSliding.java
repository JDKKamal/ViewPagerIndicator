package com.jdkgroup.viewpagerindicator.imagesliding;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.jdkgroup.viewpagerindicator.R;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class ActivityImageSliding extends AppCompatActivity {
    ViewPager mViewPager;
    int[] viewpagerimage = {R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    String[] viewpagertitle = {"Master Card", "Visa", "American Express"};
    AdapterImageSliding adapterImageSliding;
    PageIndicator mIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_sliding);

        mViewPager = (ViewPager) findViewById(R.id.mViewPager);
        adapterImageSliding = new AdapterImageSliding(getApplicationContext(), viewpagerimage, viewpagertitle);
        mViewPager.setAdapter(adapterImageSliding);

        CirclePageIndicator indicator = (CirclePageIndicator) findViewById(R.id.circle_indicator);
        mIndicator = indicator;
        indicator.setViewPager(mViewPager);

    }
}