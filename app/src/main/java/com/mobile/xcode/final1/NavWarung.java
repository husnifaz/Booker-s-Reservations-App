package com.mobile.xcode.final1;

/**
 * Created by Susantokun on 29/05/2017.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class NavWarung extends Fragment {

    public NavWarung(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.nav_warung, container, false);

        getActivity().setTitle("Warung Mahasiswa");

        return view;
    }
}