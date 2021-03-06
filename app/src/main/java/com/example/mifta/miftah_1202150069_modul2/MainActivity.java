package com.example.mifta.miftah_1202150069_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //membuat variable internval
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {

            //method untuk menjalankan splashscreen
            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i); // menghubungkan activity splashscren ke main activity dengan intent

                Toast.makeText(MainActivity.this,"Berhasil Masuk",Toast.LENGTH_LONG).show();

                //jeda selesai Splashscreen
                this.finish();
            }
            // ketika selesai
            private void finish() {
                // TODO Auto-generated method stub

            }
        }, splashInterval);

    };
}
