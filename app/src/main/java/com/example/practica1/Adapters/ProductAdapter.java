package com.example.practica1.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica1.R;

import java.util.Objects;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder>{

    private ProductData[] ProductDataset;
    private static ProductAdapterListener productAdapterListener;
    private Context context;

    public interface ProductAdapterListener{
        void productClicked(View v, int position);
    }

    public ProductAdapter(ProductData[] ProductDataset, ProductAdapterListener productAdapterListener){
        this.ProductDataset = ProductDataset;
        this.productAdapterListener = productAdapterListener;
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent,
                false);
        return new ProductAdapter.MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.MyViewHolder holder, int position) {
        ((TextView)holder.linearView.findViewById(R.id.productName)).setText(ProductDataset[position].name);
        ((TextView)holder.linearView.findViewById(R.id.productPrice)).setText(ProductDataset[position].price);
        if(String.valueOf(this.context.getResources().getIdentifier(ProductDataset[position].image, "drawable", context.getPackageName())).equals("0")) {
            Log.e("ProductAdapter", "going default");
            ((ImageView)holder.linearView.findViewById(R.id.productImage)).setImageResource(this.context.getResources().getIdentifier("defaultminiature", "drawable", context.getPackageName()));
        }else{
            ((ImageView)holder.linearView.findViewById(R.id.productImage)).setImageResource(this.context.getResources().getIdentifier(ProductDataset[position].image, "drawable", context.getPackageName()));
        }
    }

    /*
    * String imageResource = ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].image;
            if(imageResource.equals("")) {
                Log.e("ProductDetailFragment", "Empty imageResource");
                productDetailImage.setImageResource(R.drawable.ic_launcher_foreground);
            }else {
                Log.e("ProductDetailFragment", "onStart imageResource = " + imageResource);
                productDetailImage.setImageResource(getResources().getIdentifier(imageResource, "drawable", Objects.requireNonNull(getContext()).getPackageName()));
            }
    * */

    @Override
    public int getItemCount() {
        return ProductDataset.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public LinearLayout linearView;
        public MyViewHolder(LinearLayout v){
            super(v);
            linearView = v;
            linearView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v){
            productAdapterListener.productClicked(v, this.getLayoutPosition());
        }
    }
}
