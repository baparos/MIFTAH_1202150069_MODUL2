package com.example.mifta.miftah_1202150069_modul2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClickOrder(View view) {
        if (((RadioButton) findViewById(R.id.rbt_DineIn)).isChecked()) { //radio button untuk memilih dine in
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent);
        } else if (((RadioButton) findViewById(R.id.rbt_TakeAway)).isChecked()) { //untuk memilih take away
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Pilih salah satu terlebih dahulu", Toast.LENGTH_SHORT).show(); // toast yang akan muncul
        }
    }
}