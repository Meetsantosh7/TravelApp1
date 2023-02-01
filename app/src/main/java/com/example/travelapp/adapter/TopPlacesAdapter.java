package com.example.travelapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelapp.R;
import com.example.travelapp.model.RecentsData;
import com.example.travelapp.model.TopPlacesData;

import java.util.List;

public class TopPlacesAdapter extends RecyclerView.Adapter<TopPlacesAdapter.TopPlacesViewHolder> {

    Context context;
    List<TopPlacesData> topPlacesDataList;

    public TopPlacesAdapter(Context context, List<TopPlacesData> topPlacesDataList) {
        this.context = context;
        this.topPlacesDataList = topPlacesDataList;
    }

    @NonNull
    @Override
    public TopPlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_places_row,parent,false);
       return new TopPlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopPlacesViewHolder holder, int position) {
        holder.countryname.setText(topPlacesDataList.get(position).getCountryName());
        holder.placename.setText(topPlacesDataList.get(position).getPlaceName());
        holder.placeimage.setImageResource(topPlacesDataList.get(position).getImageUrl());
        holder.price.setText(topPlacesDataList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return topPlacesDataList.size();
    }

    public static final class TopPlacesViewHolder extends RecyclerView.ViewHolder{
        ImageView placeimage;
        TextView placename,countryname,price;

        public TopPlacesViewHolder(@NonNull View itemView) {

            super(itemView);
            placeimage= itemView.findViewById(R.id.place_image);
            countryname = itemView.findViewById(R.id.country_name);
            placename = itemView.findViewById(R.id.place_name);
            price = itemView.findViewById(R.id.price);

        }
    }
}
