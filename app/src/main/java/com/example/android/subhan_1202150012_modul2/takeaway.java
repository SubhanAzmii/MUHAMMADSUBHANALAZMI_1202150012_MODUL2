package com.example.android.subhan_1202150012_modul2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class takeaway extends AppCompatActivity {
    //deklarasi variable
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;
    private SimpleDateFormat dateFormat;
    private TextView DateResult;
    private TextView TimeResult;
    private Button timePicker;
    private Button DatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
        //Mengset format dasar oada tanggal
        dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        //inisialisasi variable pada komponen id
        DateResult = (TextView) findViewById(R.id.dresult);
        DatePicker = (Button) findViewById(R.id.tgl);
        TimeResult =(TextView) findViewById(R.id.reswkt);
        timePicker = (Button) findViewById(R.id.wkt);


        //onclick listener untuk membuat fungsi tanggal
        DatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showdatedialog();
            }
        });
        //onclick listener untuk membuat fungsi waktu
        timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showtimedialog();
            }
        });
    }

    private void showtimedialog() {
        Calendar wktu = Calendar.getInstance();

        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int jam, int menit) {
                TimeResult.setText("Waktu Dipilih:" + jam +":"+ menit);
            }
        },      //mengset hasil pemilihan wakti
                wktu.get(Calendar.HOUR_OF_DAY), wktu.get(Calendar.MINUTE),
                //mengset format waktu 24 jam
                android.text.format.DateFormat.is24HourFormat(this));
        //menampilkan waktu yang sudah terset
        timePickerDialog.show();
    }



    private void showdatedialog() {
        Calendar kalender = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int thn, int bln, int hari) {

                Calendar newDate = Calendar.getInstance();
                newDate.set(thn, bln, hari);
                //mengset hasil pemilihan tanggal pada text view result untuk menampilkan
                DateResult.setText("Tanggal dipilih : "+dateFormat.format(newDate.getTime()));
            }
        //menampilkan tanggal bulan tahun yang sudah terset berdasarkan format
        },kalender.get(Calendar.YEAR), kalender.get(Calendar.MONTH), kalender.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }


    //yang bertindak untuk mengarahkan dalam berpindah activity
    public void pesanan(View view) {
        Intent intent = new Intent(this, Daftarmenu.class);
        startActivity(intent);
    }
}

/*Sumber Date Picker dan Time Picker
https://www.twoh.co/2017/01/20/tutorial-cara-membuat-datepicker-di-android-studio/
https://www.twoh.co/2017/01/21/tutorial-cara-membuat-timepicker-di-android-studio/
* */