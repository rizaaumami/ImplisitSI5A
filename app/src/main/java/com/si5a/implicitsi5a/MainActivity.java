package com.si5a.implicitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUrl, etLokasi, etTeks;
    Button btnBukaWebsite, btnBukaLokasi, btnBagikanTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrl = findViewById(R.id.et_url);
        etLokasi = findViewById(R.id.et_lokasi);
        etTeks = findViewById(R.id.et_teks);
        btnBukaWebsite = findViewById(R.id.btn_buka_website);
        btnBukaLokasi = findViewById(R.id.btn_buka_lokasi);
        btnBagikanTeks = findViewById(R.id.btn_bagikan_teks);

        btnBukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = etUrl.getText().toString();
                Uri uriUrlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriUrlWebsite);
                startActivity(intentWebsite);
            }
        });
        btnBukaLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnBagikanTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}