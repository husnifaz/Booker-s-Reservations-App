package com.mobile.xcode.final1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class BuanaReserve extends AppCompatActivity{
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buana_reserve);


		Button kirim = (Button)findViewById(R.id.tmb_sms2);
		Button book	=(Button)findViewById(R.id.tmb_booking2);

		book.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String buana = String.valueOf("Rumah Makan Buana");

				Intent intent = new Intent(BuanaReserve.this, BookActivity.class);

				startActivity(intent);
			}
		});

		kirim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(BuanaReserve.this, KirimRasut.class);
				startActivity(intent);
			}
		});

	}

}
