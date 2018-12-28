package com.mobile.xcode.final1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Muhammad Husni Farid on 31/05/2017.
 */

public class KirimRasut extends Activity {

    private TextView phoneNumber;
    private EditText smsBody;
    private Button smsSendToBtn;
    String getnama;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rasut_kirim);

        Button btn1 =(Button)findViewById(R.id.btnKembali);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });


        phoneNumber=(TextView)findViewById(R.id.phoneNumber);
        smsBody = (EditText) findViewById(R.id.smsBody);
        smsSendToBtn = (Button) findViewById(R.id.smsSIntent);

        smsSendToBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSmsBySIntent();
            }
        });


    }


    public void sendSmsBySIntent() {
        // add the phone number in the data
        Uri uri = Uri.parse("smsto:" + phoneNumber.getText().toString());

        Intent smsSIntent = new Intent(Intent.ACTION_SENDTO, uri);
        // add the message at the sms_body extra field
        smsSIntent.putExtra("sms_body", smsBody.getText().toString());
        try{
            startActivity(smsSIntent);
        } catch (Exception ex) {
            Toast.makeText(KirimRasut.this, "Pengiriman SMS Gagal...",
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }
    }

}
