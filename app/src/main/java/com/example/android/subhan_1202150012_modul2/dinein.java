package com.example.android.subhan_1202150012_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class dinein extends AppCompatActivity {
    //deklarasi variable dan deklarasi Array untuk membuat nomor meja
    Spinner sp1;
    private String[] listArray = {"Meja 1", "Meja 2", "Meja 3", "Meja 4", "Meja 5", "Meja 6", "Meja 7"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);

        //inisialisasi untuk variable spinner
        sp1 = (Spinner) findViewById(R.id.spinner);

        //mengeset isi array pada spinner
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, listArray);
        sp1.setAdapter(adapter);


    }

    public void pesanan(View view) {
        //perintah onclink button untuk berpindah aktifitas
        Intent intent = new Intent(this, Daftarmenu.class);
        startActivity(intent);
    }
}
