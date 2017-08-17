package com.example.labrpl.mid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void menu1(View v) {
        Intent intent = new Intent(Main1Activity.this , Main2Activity.class);
        startActivity(intent);
    }

    public void menu2(View v) {
        Intent intent = new Intent(Main1Activity.this , Main3Activity.class);
        startActivity(intent);
    }

    public void menu3(View v) {
        Intent intent = new Intent(Main1Activity.this , Main4Activity.class);
        startActivity(intent);
    }
}
