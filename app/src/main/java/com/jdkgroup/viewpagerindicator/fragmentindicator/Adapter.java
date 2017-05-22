package com.jdkgroup.viewpagerindicator.fragmentindicator;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class Adapter extends FragmentPagerAdapter {

    public Adapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentLogin fragmentLogin = new FragmentLogin();
                return fragmentLogin;
            case 1:
                FragmentRegisterUser fragmentRegisterUser = new FragmentRegisterUser();
                return fragmentRegisterUser;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
