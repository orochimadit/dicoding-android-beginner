package com.badra.submissiondicoding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewBahasaAdapter extends RecyclerView.Adapter<CardViewBahasaAdapter.CardViewHolder> {
    private ArrayList<BahasaPemograman>listBahasa;
    private Context context;
    private Activity activity;

    public CardViewBahasaAdapter(Context context){
        this.context =context;
    }
    public ArrayList<BahasaPemograman>getListBahasa(){
        return listBahasa;
    }
    public void setListBahasa(ArrayList<BahasaPemograman> listBahasa){
        this.listBahasa=listBahasa;
    }
    @NonNull
    @Override
    public CardViewBahasaAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewBahasaAdapter.CardViewHolder holder, int position) {
        final BahasaPemograman bahasas = getListBahasa().get(position);
        Glide.with(context).load(bahasas.getPhoto()).override(350,550).into(holder.img);
        holder.tv_name.setText(bahasas.getName());
        holder.tv_note.setText(bahasas.getNote());
        holder.bahasa = bahasas;
    }

    @Override
    public int getItemCount() {
        return getListBahasa().size();
    }
    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView img;
        TextView tv_name,tv_note;
        Button btn_detail;
        BahasaPemograman bahasa;
        public CardViewHolder(View view){
            super(view);
            img     = (ImageView)view.findViewById(R.id.img_photo);
            tv_name = (TextView)view.findViewById(R.id.tv_name);
            tv_note = (TextView)view.findViewById(R.id.tv_note);
            btn_detail = (Button)view.findViewById(R.id.btn_set_detail);
            btn_detail.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            Intent intent= new Intent (context, DetailBahasaActivity.class);
            intent.putExtra("listku",bahasa);
            context.startActivity(intent);
        }
    }
}
