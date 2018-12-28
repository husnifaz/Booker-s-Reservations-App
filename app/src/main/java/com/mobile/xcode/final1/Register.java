package com.mobile.xcode.final1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



/**
 * Created by Muhammad Husni Farid on 22/05/2017.
 */

public class Register extends AppCompatActivity {

    protected Cursor cursor;
    EditText nama, email, telp, username1, password1;
    Button daftar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_form);


        nama=(EditText)findViewById(R.id.nama_reg);
        telp=(EditText)findViewById(R.id.telp_reg);
        username1=(EditText)findViewById(R.id.user_reg);
        password1=(EditText)findViewById(R.id.pass_reg);
        daftar=(Button)findViewById(R.id.tregister);


        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Database Tidak Ditemukan",Toast.LENGTH_LONG).show();
            }
        });

    }
}
