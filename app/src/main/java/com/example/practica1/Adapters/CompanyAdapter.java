package com.example.practica1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica1.R;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.MyViewHolder>{

    private CompanyData[] companyDataset;
    private static CompanyAdapterListener companyAdapterListener;
    private Context context;

    public interface CompanyAdapterListener{
        void companyClicked(View v, int position);
    }

    public CompanyAdapter(CompanyData[] companyDataset, CompanyAdapterListener companyAdapterListener){
        this.companyDataset = companyDataset;
        this.companyAdapterListener = companyAdapterListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_company, parent,
                false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ((TextView)holder.linearView.findViewById(R.id.newCompany)).setText(companyDataset[position].name);
        if(String.valueOf(this.context.getResources().getIdentifier(companyDataset[position].image, "drawable", context.getPackageName())).equals("0")) {
            ((ImageView)holder.linearView.findViewById(R.id.companyImage)).setImageResource(this.context.getResources().getIdentifier("defaultminiature", "drawable", context.getPackageName()));
        }else{
            ((ImageView)holder.linearView.findViewById(R.id.companyImage)).setImageResource(this.context.getResources().getIdentifier(companyDataset[position].image, "drawable", context.getPackageName()));
        }
    }

    @Override
    public int getItemCount() {
        return companyDataset.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public LinearLayout linearView;
        public MyViewHolder(LinearLayout v){
            super(v);
            linearView = v;
            linearView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            companyAdapterListener.companyClicked(v, this.getLayoutPosition());
        }
    }
}