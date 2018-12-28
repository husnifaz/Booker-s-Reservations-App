package com.mobile.xcode.final1;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Awal extends Fragment {

    public Awal(){}
    View awalView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        awalView = inflater.inflate(R.layout.awal, container, false);

        getActivity().setTitle("Booker's");

        return awalView;
    }
}
