package com.jdkgroup.viewpagerindicator.fragmentindicator;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;
import com.jdkgroup.viewpagerindicator.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class ActivityFragmentIndicator extends FragmentActivity {

	PageIndicator mIndicator;
	ViewPager mPager;
	CirclePageIndicator indicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_indicator);
        
        mPager = (ViewPager) findViewById(R.id.pager);
        indicator = (CirclePageIndicator)findViewById(R.id.indicator);
        
        mPager.setAdapter(new Adapter(getSupportFragmentManager()));
        
        mIndicator = indicator;
		indicator.setViewPager(mPager);
		
    }
}
