package com.mobile.xcode.final1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class RasutMain extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rasut_main);

        TabHost tabHost = getTabHost();

        TabSpec reserve = tabHost.newTabSpec("Reserve");
        reserve.setIndicator("Reserve");
        Intent reserveIntent = new Intent(this, RasutReserve.class);
        reserve.setContent(reserveIntent);

        TabSpec menu = tabHost.newTabSpec("Menu");
        menu.setIndicator("Menu");
        Intent menuIntent = new Intent(this, RasutMenu.class);
        menu.setContent(menuIntent);



        tabHost.addTab(reserve);
        tabHost.addTab(menu);

    }


}
