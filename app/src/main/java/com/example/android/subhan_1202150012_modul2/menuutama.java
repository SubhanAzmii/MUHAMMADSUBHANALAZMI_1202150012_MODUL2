package com.example.android.subhan_1202150012_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class menuutama extends AppCompatActivity {
    //deklarasi variable
    RadioGroup radbutn;
    RadioButton rb1;
    RadioButton rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuutama);
        //identifikasi variable pada komponen
        radbutn = findViewById(R.id.radiobtn);
    }

    //perintah onclik berdasar kan pilihan
    public void pilihan(View view) {
        //identifikasi pemilihan berdasarkan pilihan radio button
        int selectedid = radbutn.getCheckedRadioButtonId();
        rb1 = findViewById(R.id.taaw);
        rb2 = findViewById(R.id.diin);


        //pemilihan ketentuan untuk pilihan
        if (selectedid == rb1.getId()){
            Intent intent = new Intent(this, takeaway.class);
            startActivity(intent);
            Toast toast = Toast.makeText(this, "Take Away ", Toast.LENGTH_LONG);
            toast.show();
        }else if (selectedid == rb2.getId()){
            Intent intent = new Intent(this, dinein.class);
            startActivity(intent);
            Toast toast = Toast.makeText(this, "Dine In ", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}