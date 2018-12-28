package com.mobile.xcode.final1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RasutReserve extends AppCompatActivity{
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rasut_reserve);


		Button kirim = (Button)findViewById(R.id.tmb_sms1);
		Button book	=(Button)findViewById(R.id.tmb_booking1);

		book.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String rasut = String.valueOf("Rasa Utama");
				String norasut = String.valueOf("081291305333");

				Intent intent = new Intent(RasutReserve.this, BookActivity.class);

				Bundle b= new Bundle();
				b.putString("parse_nama", rasut);
				intent.putExtras(b);
				startActivity(intent);
			}
		});

		kirim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RasutReserve.this, KirimRasut.class);
				startActivity(intent);
			}
		});
	}

}
