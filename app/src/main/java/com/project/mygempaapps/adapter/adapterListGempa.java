package com.project.mygempaapps.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.mygempaapps.R;
import com.project.mygempaapps.pjModels.ListGempa.FeaturesItem;

import java.util.ArrayList;

public class adapterListGempa extends RecyclerView.Adapter<adapterListGempa.GempaViewHolder> {

    private ArrayList<FeaturesItem> listGempa = new ArrayList<>();

    public void setListenerGMP(ItemGempaClickListener listenerGMP) {
        this.listenerGMP = listenerGMP;
    }
    ItemGempaClickListener listenerGMP;

    public void setListGempa(ArrayList<FeaturesItem> listGempa) {
        this.listGempa = listGempa;
        notifyDataSetChanged();
    }

    public adapterListGempa() {
        this.listenerGMP = listenerGMP;

    }

    @NonNull
    @Override
    public GempaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_gempa, parent, false);
        return new GempaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GempaViewHolder holder, int position) {

        FeaturesItem gempa = listGempa.get(position);
        holder.lokasigempa.setText(gempa.getProperties().getPlace());
        holder.waktugempa.setText(gempa.getProperties().getTime());
        holder.skalagempa.setText(gempa.getProperties().getMag());

//        holder..setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                listenerIM.onItemGempaClick(gempa);
//            }
//        });

    }

    @Override
    public int getItemCount() {

        return listGempa.size();
    }

    public interface ItemGempaClickListener{
        void onItemGempaClick(FeaturesItem gempa);
    }

    public class GempaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView lokasigempa,waktugempa,skalagempa;


        public GempaViewHolder (@NonNull View itemView) {
            super(itemView);

            lokasigempa = itemView.findViewById(R.id.lokasiGempa);
            waktugempa = itemView.findViewById(R.id.waktuGempa);
            skalagempa = itemView.findViewById(R.id.skalaGempa);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            FeaturesItem featuresItem = listGempa.get(getBindingAdapterPosition());
            listenerGMP.onItemGempaClick(featuresItem);

        }
    }
}
