package com.example.holiday.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.holiday.R;
import com.example.holiday.model.holiday.HolidaysDiscoverItem;

import java.util.ArrayList;

public class HolidayDiscoverAdapter extends RecyclerView.Adapter<HolidayDiscoverAdapter.ViewHolder>  {

    private ArrayList<HolidaysDiscoverItem> holidaysDiscoverItems = new ArrayList<>();
    private Context context;

    public HolidayDiscoverAdapter(Context context){
        this.context = context;
    }

    public void setData(ArrayList<HolidaysDiscoverItem> items){
        holidaysDiscoverItems.clear();
        holidaysDiscoverItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HolidayDiscoverAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inisiasi item list
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayDiscoverAdapter.ViewHolder holder, int position) {
        holder.tvTanggal.setText(holidaysDiscoverItems.get(position).getDate());
        holder.tvNama.setText(holidaysDiscoverItems.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return holidaysDiscoverItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTanggal,tvNama;
        CardView cvItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem = itemView.findViewById(R.id.itemlist_cv);
            tvTanggal = itemView.findViewById(R.id.itemlist_tanggal);
            tvNama = itemView.findViewById(R.id.itemlist_nama);
        }
    }
}
