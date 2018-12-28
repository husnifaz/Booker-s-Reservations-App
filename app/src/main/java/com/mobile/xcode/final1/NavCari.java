package com.mobile.xcode.final1;

/**
 * Created by Susantokun on 29/05/2017.
 */

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class NavCari extends Fragment {

    public NavCari(){}
    RelativeLayout view;
    Button cari;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout)inflater.inflate(R.layout.nav_cari, container, false);

        getActivity().setTitle("Cari Lokasi Warung");

        return view;
    }
}