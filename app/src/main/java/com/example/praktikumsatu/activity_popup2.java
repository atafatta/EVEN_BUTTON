package com.example.praktikumsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_popup2 extends AppCompatActivity {

    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup2);

        tvnama = findViewById(R.id.tvnama);
        tvnomor = findViewById(R.id.tvnomor);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Udil":
                tvnama.setText("Udil S");
                tvnomor.setText("085712347561");
                break;
            case "Ilham":
                tvnama.setText("Udil W");
                tvnomor.setText("081984674563");
                break;
            case "Windah":
                tvnama.setText("Windah B");
                tvnomor.setText("082123874653");
                break;
            case "Godiva":
                tvnama.setText("Godiva A");
                tvnomor.setText("089874656125");
                break;
            case "Zuxxy":
                tvnama.setText("Zuxxy B");
                tvnomor.setText("084756123491");
                break;
            case "Luxxy":
                tvnama.setText("Luxxy B");
                tvnomor.setText("085098378471");
                break;
            case "Oura":
                tvnama.setText("Oura P");
                tvnomor.setText("085098476254");
                break;
            case "Gustian":
                tvnama.setText("Gustian R");
                tvnomor.setText("081984762564");
                break;
            case "Vior":
                tvnama.setText("Vior B");
                tvnomor.setText("081909874615");
                break;
            case "Catheez":
                tvnama.setText("Catheez C");
                tvnomor.setText("080974651234");
                break;
        }
    }
}