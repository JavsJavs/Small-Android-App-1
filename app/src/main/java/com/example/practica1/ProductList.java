package com.example.practica1;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class ProductList extends AppCompatActivity implements ProductListFragment.ProductListener{
    private int currentCompany = 0;
    private int currentProduct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        this.currentCompany = (int)getIntent().getExtras().get("CompanyId");
        ProductListFragment productListFragment = (ProductListFragment) getSupportFragmentManager().findFragmentById(R.id.product_list_fragment);
        assert productListFragment != null;
        productListFragment.setCompany(this.currentCompany);
    }

    @Override
    public void productClicked(int currentProduct) {
        Log.e("ProductList", "productClicked");
        this.currentProduct = currentProduct;
        Intent intent = new Intent(this, ProductDetail.class);
        intent.putExtra("CompanyId", this.currentCompany);
        intent.putExtra("ProductId", this.currentProduct);
        startActivity(intent);
    }
}
