package com.example.android.subhan_1202150012_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class detailmenu extends AppCompatActivity {

    //deklarasi variable
    TextView mnmakanan, nmharga, nmkomposisi;
    ImageView nmgambar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailmenu);

        //identifikasi variable untuk di gubungakan dengan komponen id
        mnmakanan = (TextView)findViewById(R.id.namamkn);
        nmharga = (TextView)findViewById(R.id.price);
        nmkomposisi = (TextView)findViewById(R.id.komposisi);
        nmgambar = (ImageView)findViewById(R.id.Viewimg);

        //menangkap intent/permindahan aktifitas
        Intent intent = getIntent();
        String mnuMakan = intent.getStringExtra("makanan");
        String mnuprice = intent.getStringExtra("harga");
        String nmukomposisi = intent.getStringExtra("komposisi");
        Integer gbr = intent.getIntExtra("imgae",0);

        //mengset data yang di dapat dari internt untuk di tampilkan pada komponen id
        mnmakanan.setText(mnuMakan);
        nmharga.setText(mnuprice);
        nmkomposisi.setText(nmukomposisi);
        nmgambar.setImageResource(gbr);
    }
}
