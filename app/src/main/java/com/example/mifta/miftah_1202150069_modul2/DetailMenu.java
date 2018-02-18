package com.example.mifta.miftah_1202150069_modul2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView tv_food, tv_price;
    ImageView iv_photo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price",0);
        Integer photo = intent.getIntExtra("photo",0);

        Log.d("getIntExtra", ""+price+photo);

        tv_food = (TextView)findViewById(R.id.tv_detailFood); //untuk mencari detail makanan
        tv_price = (TextView)findViewById(R.id.tv_detailPrice); //untuk mencari detail harga
        iv_photo = (ImageView)findViewById(R.id.iv_detailPhoto); //untuk mencari detail gambar

        tv_food.setText(food); //untuk mengisi makanan
        tv_price.setText("Rp. "+price); //untuk mengisi harga
        iv_photo.setImageResource(photo); //untuk mengisi gambar
    }
}
