package com.mobile.xcode.final1;

import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.app.TabActivity;
import android.content.Intent;


@SuppressWarnings("deprecation")
public class WmMain extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wm_main);
        
        TabHost tabHost = getTabHost();
        
        TabSpec reserve = tabHost.newTabSpec("Reserve");
        reserve.setIndicator("Reserve");
        Intent reserveIntent = new Intent(this, WmReserve.class);
        reserve.setContent(reserveIntent);
        
        TabSpec menu = tabHost.newTabSpec("Menu");
        menu.setIndicator("Menu");
        Intent menuIntent = new Intent(this, WmMenu.class);
        menu.setContent(menuIntent);
        
        
        tabHost.addTab(reserve);
        tabHost.addTab(menu);
        
    }

    
}
