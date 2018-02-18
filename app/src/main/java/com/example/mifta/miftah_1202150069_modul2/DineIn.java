package com.example.mifta.miftah_1202150069_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        // membuat spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner_table); //mencari nomor meja

        // membuat arrayadapter dan membuat layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);
        // menset layout
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // menaruh adapter pada layout
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }
    //ketika item diselect
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }
    //ketika tidak ada yang diselect
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    //ketika diklik
    public void onClickOrder(View view) {
        //menuju menu.class
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}

