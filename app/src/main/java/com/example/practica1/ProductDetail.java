package com.example.practica1;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        int productPosition = (int)getIntent().getExtras().get("ProductId");
        int companyPosition = (int)getIntent().getExtras().get("CompanyId");
        ProductDetailFragment productDetailFragment = (ProductDetailFragment) getSupportFragmentManager().findFragmentById(R.id.product_detail_fragment);
        assert productDetailFragment != null;
        productDetailFragment.setPositions(productPosition, companyPosition);
    }
}