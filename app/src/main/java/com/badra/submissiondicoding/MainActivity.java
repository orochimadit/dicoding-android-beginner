package com.badra.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<BahasaPemograman> list_bahasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyler_view);
        recyclerView.setHasFixedSize(true);

        list_bahasa = new ArrayList<>();
        list_bahasa.addAll(BahasaData.getListData());
        showRecylerCardView();
    }
    private void showRecylerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewBahasaAdapter cardViewPresidentAdapter= new CardViewBahasaAdapter(this);
        cardViewPresidentAdapter.setListBahasa(list_bahasa);
        recyclerView.setAdapter(cardViewPresidentAdapter);

    }
}