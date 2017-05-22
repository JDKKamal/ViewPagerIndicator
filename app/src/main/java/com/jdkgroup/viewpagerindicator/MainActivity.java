package com.jdkgroup.viewpagerindicator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.jdkgroup.viewpagerindicator.fragmentindicator.ActivityFragmentIndicator;
import com.jdkgroup.viewpagerindicator.imagesliding.ActivityImageSliding;
import com.jdkgroup.viewpagerindicator.indicatorview.ActivityPageIndicator;
import com.jdkgroup.viewpagerindicator.tabtext.ActivityTabText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AppCompatTextView tvFragmentIndicator, tvImageSliding, tvTabText, tvIndicatorView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFragmentIndicator = (AppCompatTextView) findViewById(R.id.tvFragmentIndicator);
        tvImageSliding = (AppCompatTextView) findViewById(R.id.tvImageSliding);
        tvTabText = (AppCompatTextView) findViewById(R.id.tvTabText);
        tvIndicatorView = (AppCompatTextView) findViewById(R.id.tvIndicatorView);

        tvFragmentIndicator.setOnClickListener(this);
        tvImageSliding.setOnClickListener(this);
        tvTabText.setOnClickListener(this);
        tvIndicatorView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvFragmentIndicator:
                intent = new Intent(MainActivity.this, ActivityFragmentIndicator.class);
                startActivity(intent);
                break;

            case R.id.tvImageSliding:
                intent = new Intent(MainActivity.this, ActivityImageSliding.class);
                startActivity(intent);
                break;

            case R.id.tvTabText:
                intent = new Intent(MainActivity.this, ActivityTabText.class);
                startActivity(intent);
                break;

            case R.id.tvIndicatorView:
                intent = new Intent(MainActivity.this, ActivityPageIndicator.class);
                startActivity(intent);
                break;
        }
    }
}
