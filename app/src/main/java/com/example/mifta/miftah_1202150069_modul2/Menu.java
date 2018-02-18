package com.example.mifta.miftah_1202150069_modul2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();        //variable untuk melist makanan
    private final LinkedList<Integer> priceses = new LinkedList<>(); //variable untuk melist harga
    private final LinkedList<Integer> photos = new LinkedList<>(); //variable untuk melist gambar
    private int mCount = 0;

    private RecyclerView mRecyclerView; // variable recycleview
    private MenuAdapter mAdapter; // variable adaper

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menset layout menu
        setContentView(R.layout.activity_menu);
        dummiesData();
        // membuat recycle view dengan memanggil id recycle view
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter view dengan memanggil id recycle view
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menyambungkan recyc;eview dan adapter
        mRecyclerView.setAdapter(mAdapter);
        // memberika default layout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData() {
        for (int i = 0; i < 3; i++) {
            foods.add("Ayam Bakar"); //untuk menampilkan menu makanan
            foods.add("Ayam Goreng");
            foods.add("Nasi Goreng");
            foods.add("Nasi Lemak");
            foods.add("Teh Tarik");

            priceses.add(30000); //untuk menampilkan harga makanan
            priceses.add(25000);
            priceses.add(22000);
            priceses.add(20000);
            priceses.add(10000);

            photos.add(R.drawable.ayambakar); //untuk menampilkan gambar makanan
            photos.add(R.drawable.ayamgoreng);
            photos.add(R.drawable.nasigoreng);
            photos.add(R.drawable.nasilemak);
            photos.add(R.drawable.tehtarik);
        }
    }
}