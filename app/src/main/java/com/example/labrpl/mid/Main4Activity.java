package com.example.labrpl.mid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {

    EditText ed1, ed2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void kirim(View view){
        ed1 = (EditText)findViewById(R.id.nama);
        ed2 = (EditText)findViewById(R.id.stambuk);
        bt1 = (Button)findViewById(R.id.button);

        Intent intent = new Intent(Main4Activity.this , Main5Activity.class);

        intent.putExtra("Data1" , ed1.getText().toString());
        intent.putExtra("Data2" , ed2.getText().toString());

        startActivity(intent);
    }
}
