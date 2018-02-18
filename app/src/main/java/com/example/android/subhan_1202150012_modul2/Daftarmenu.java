package com.example.android.subhan_1202150012_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Daftarmenu extends AppCompatActivity {

    //deklarasi variable yang di gunakan
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> makanan;
    private ArrayList<String> harga;
    private ArrayList<Integer> gambar;

    //membuat array untuk isi item pada RecyclerView
    private String[] mMakanan = {
            " Lontong Sayur",
            " Mie Ayam Bakso",
            " Nasi Becek khas Nganjuk",
            " Nasi Goreng Sosis",
            " Nasi Kuning",
            " Nasi Pecel Bledek khas Nganjuk"
    };
    private String[] mharga = {
            "  RP. 10000",
            "  RP. 12000",
            "  RP. 15000",
            "  RP. 13000",
            "  RP. 8000",
            "  RP. 13000"
    };
    private Integer[] mgbr = {
            R.drawable.lontongsayur,
            R.drawable.mieayambakso,
            R.drawable.nasibeceknganjuk,
            R.drawable.nasigorengsosis,
            R.drawable.nasikuning,
            R.drawable.nasipecelbledeknganjuk
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarmenu);

        //inisialisasi tiap variable
        makanan = new ArrayList<>();
        harga   = new ArrayList<>();
        gambar = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerview);
        daftaritem();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(makanan,harga,gambar);
        recyclerView.setAdapter(adapter);

    }

    private void daftaritem() {
        //memasukkan isi array pada tiap variable
        for (int a=0; a<mMakanan.length; a++){
            makanan.add(mMakanan[a]);
            harga.add(mharga[a]);
            gambar.add(mgbr[a]);
        }
    }
}
