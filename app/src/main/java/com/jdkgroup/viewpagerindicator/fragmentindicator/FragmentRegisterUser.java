package com.jdkgroup.viewpagerindicator.fragmentindicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jdkgroup.viewpagerindicator.R;

public class FragmentRegisterUser extends Fragment {

	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_registeruser, container, false);
       
        return rootView;
    }
	
}