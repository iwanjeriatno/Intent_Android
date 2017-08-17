package com.example.labrpl.mid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    EditText ed1;
    ListView ls1;
    ArrayList<String> data = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void add(View v) {
        ed1 = (EditText) findViewById(R.id.editText);
        ls1 = (ListView)findViewById(R.id.list);

        String a = ed1.getText().toString();

        data.add(a);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);

        ls1.setAdapter(adapter);

        ed1.setText("");
    }



}
