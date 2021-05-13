package com.example.practica1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica1.Adapters.ProductAdapter;
import com.example.practica1.Adapters.ProductData;

public class ProductListFragment extends Fragment implements ProductAdapter.ProductAdapterListener{
    private int currentPosition;
    private ProductListener productListener;

    public interface ProductListener{
        void productClicked(int position);
    }

    public void productClicked(View v, int position) {
        if(productListener != null){
            productListener.productClicked(position);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.productListener = (ProductListener) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_list, container, false);
    }

    public void setCompany(int position){
        this.currentPosition = position;
    }

    @Override
    public void onStart() {
        super.onStart();
        View v = getView();
        if(v != null) {
            RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.productListRecycler);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);
            ProductAdapter mAdapter = new ProductAdapter(ProductData.PRODUCT_DATA[this.currentPosition], this);
            recyclerView.setAdapter(mAdapter);
        }
    }
}