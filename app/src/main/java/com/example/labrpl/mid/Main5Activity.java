package com.example.labrpl.mid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView tx1, tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tx1 = (TextView)findViewById(R.id.namaView);
        tx2 = (TextView)findViewById(R.id.stambukView);

        Intent intent = getIntent();
        String data1 = intent.getStringExtra("Data1");
        String data2 = intent.getStringExtra("Data2");

        tx1.setText(data1);
        tx2.setText(data2);
    }
}
