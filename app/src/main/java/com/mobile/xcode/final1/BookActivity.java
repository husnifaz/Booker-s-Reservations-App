package com.mobile.xcode.final1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Muhammad Husni Farid on 30/05/2017.
 */

public class BookActivity extends AppCompatActivity{

    DataHelper dbHelper;
    Button ton1;
    Spinner spin3;
    EditText text1, text2, text5;

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private EditText edited;
    String getnama;

    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                edited.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking_layout);

        dbHelper = new DataHelper(this);
        text1 = (EditText) findViewById(R.id.edit31);
        text2 = (EditText) findViewById(R.id.edit32);
        spin3 = (Spinner) findViewById(R.id.spin31);
        text5 = (EditText)findViewById(R.id.time33);
        ton1 = (Button) findViewById(R.id.button33);

        Bundle b = getIntent().getExtras();
        getnama = b.getString("parse_nama");

        TextView namRest=(TextView)findViewById(R.id.warungfix);
        namRest.setText(getnama);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        edited=(EditText)findViewById(R.id.edit33);
        edited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar mcurrentTime=Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(BookActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        text5.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();
            }
        });

        ton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into reservasi(ID, nama, telp, meja, tanggal, jam) values (NULL,'" +
                        text1.getText().toString()+"','"+
                        text2.getText().toString() +"','" +
                        spin3.getSelectedItem().toString()+"','"+
                        edited.getText().toString() +"','"+
                        text5.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
//              MainActivity.ma.RefreshList();
                finish();
            }
        });

    }

}
