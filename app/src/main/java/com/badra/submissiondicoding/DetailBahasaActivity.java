package com.badra.submissiondicoding;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailBahasaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        BahasaPemograman bahasaPemogramanku = getIntent().getParcelableExtra("listku");

        ImageView imgV = (ImageView)findViewById(R.id.item_img_photo);
        TextView name = (TextView)findViewById(R.id.text_name);
        TextView note = (TextView)findViewById(R.id.text_note);


        Glide.with(this).load(bahasaPemogramanku.getPhoto()).override(350,550).into(imgV);
        name.setText(bahasaPemogramanku.getName());
        note.setText(bahasaPemogramanku.getDesc());

        Log.i("photo", bahasaPemogramanku.getPhoto());
        Log.i("name", bahasaPemogramanku.getName());
        Log.i("deskripsi", bahasaPemogramanku.getDesc());
    }
}
