package com.example.labrpl.mid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    EditText ed1;
    EditText ed2;

    TextView tx1;

    double a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void proses() {
        ed1 = (EditText) findViewById(R.id.editText1);
        ed2 = (EditText) findViewById(R.id.editText2);
        tx1 = (TextView) findViewById(R.id.hasil);

        a = Double.parseDouble(ed1.getText().toString());
        b = Double.parseDouble(ed2.getText().toString());
    }

    public void tambah(View v) {
        proses();
        String hasil = String.valueOf(a+b);
        tx1.setText(hasil);
    }

    public void kurang(View v) {
        proses();
        String hasil = String.valueOf(a-b);
        tx1.setText(hasil);
    }

    public void kali(View v) {
        proses();
        String hasil = String.valueOf(a*b);
        tx1.setText(hasil);
    }

    public void bagi(View v) {
        proses();
        String hasil = String.valueOf(a/b);
        tx1.setText(hasil);
    }
}
