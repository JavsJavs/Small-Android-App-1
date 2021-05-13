package com.example.practica1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica1.Adapters.ProductAdapter;
import com.example.practica1.Adapters.ProductData;

import com.example.practica1.R;

import java.util.Arrays;
import java.util.Objects;

public class ProductDetailFragment extends Fragment {
    private int currentPosition;
    private int currentCompany;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_detail, container, false);
    }

    public void setPositions(int position, int company){
        this.currentPosition = position;
        this.currentCompany = company;
    }

    @Override
    public void onStart() {
        super.onStart();
        View v = getView();
        if(v != null) {
            TextView productDetailName = (TextView) v.findViewById(R.id.productDetailName);
            TextView productDetailPrice = (TextView) v.findViewById(R.id.productDetailPrice);
            TextView productDetailDescription = (TextView) v.findViewById(R.id.productDetailDescription);
            ImageView productDetailImage = (ImageView) v.findViewById(R.id.productDetailImage);
            productDetailName.setText(ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].name);
            productDetailPrice.setText(ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].price);
            productDetailDescription.setText(ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].description);
            String imageResource = ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].image;
            if(String.valueOf(getResources().getIdentifier(imageResource, "drawable", Objects.requireNonNull(getContext()).getPackageName())).equals("0")) {
                productDetailImage.setImageResource(getResources().getIdentifier( ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].company + "logo", "drawable", Objects.requireNonNull(getContext()).getPackageName()));
            }else {
                productDetailImage.setImageResource(getResources().getIdentifier(imageResource, "drawable", Objects.requireNonNull(getContext()).getPackageName()));
            }
        }
    }
}