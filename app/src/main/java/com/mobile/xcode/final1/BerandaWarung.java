package com.mobile.xcode.final1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Muhammad Husni Farid on 31/05/2017.
 */

public class BerandaWarung extends AppCompatActivity{
    Button b1,b2,b3,b4,b5,b6;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_warung);

        b1=(Button)findViewById(R.id.view1);
        b2=(Button)findViewById(R.id.view2);
        b3=(Button)findViewById(R.id.view3);
        b4=(Button)findViewById(R.id.view4);
        b5=(Button)findViewById(R.id.view5);
        b6=(Button)findViewById(R.id.view6);


        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent1 = new Intent(BerandaWarung.this, RasutMain.class);
				/*Bundle b = new Bundle();*/
                startActivity(intent1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent2 = new Intent(BerandaWarung.this, BuanaMain.class);
                startActivity(intent2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent3 = new Intent(BerandaWarung.this, MrMain.class);
                startActivity(intent3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent4 = new Intent(BerandaWarung.this, WmMain.class);
                startActivity(intent4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent5 = new Intent(BerandaWarung.this, RaitoMain.class);
                startActivity(intent5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent intent6 = new Intent(BerandaWarung.this, KumisMain.class);
                startActivity(intent6);
            }
        });


    }
}
