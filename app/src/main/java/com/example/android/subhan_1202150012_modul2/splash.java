package com.example.android.subhan_1202150012_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //configurasi untuk toast
        Toast toast = Toast.makeText(this, "MUHAMMAD SUBHAN AL AZMI_1202150012 ", Toast.LENGTH_LONG);
        toast.show();
        //deklarasi dan identifikasi splash pada komponen id
        ImageView splash = findViewById(R.id.View);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), menuutama.class));
                finish();
            }
        }, 3000L);
    }
}