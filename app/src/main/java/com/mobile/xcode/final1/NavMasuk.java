package com.mobile.xcode.final1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by Muhammad Husni Farid on 22/05/2017.
 */

public class NavMasuk extends AppCompatActivity {

    EditText username, pass;
    Button tlogin;

    int counter =3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

        username=(EditText)findViewById(R.id.txtusername);
        pass=(EditText)findViewById(R.id.txtpass);
        tlogin=(Button) findViewById(R.id.tmb_login);
        TextView daftarlog=(TextView)findViewById(R.id.reg_in_login);
        daftarlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toreg=new Intent(NavMasuk.this, Register.class);
                startActivity(toreg);
            }
        });

        tlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("Husni")&&pass.getText().toString().equals("husni")){
                    Toast.makeText(getApplicationContext(),"Selamat Datang ",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(NavMasuk.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Username atau Password Salah \n harap coba kembali",Toast.LENGTH_SHORT).show();

                    if (counter==0){
                        tlogin.setEnabled(false);
                    }
                }
            }
        });

    }
}