package com.mobile.xcode.final1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by Muhammad Husni Farid on 31/05/2017.
 */
@SuppressWarnings("deprecation")
public class RaitoMain extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raito_main);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec reserve = tabHost.newTabSpec("Reserve");
        reserve.setIndicator("Reserve");
        Intent reserveIntent = new Intent(this, RaitoReserve.class);
        reserve.setContent(reserveIntent);

        TabHost.TabSpec menu = tabHost.newTabSpec("Menu");
        menu.setIndicator("Menu");
        Intent menuIntent = new Intent(this, RaitoMenu.class);
        menu.setContent(menuIntent);


        tabHost.addTab(reserve);
        tabHost.addTab(menu);

    }
}