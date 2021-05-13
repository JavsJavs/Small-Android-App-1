package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements CompanyListFragment.CompanyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addProductButton = findViewById(R.id.addProduct);
        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAddProduct(v);
            }
        });
    }

    private void goToAddProduct(View v) {
        Intent intent = new Intent(this, AddProduct.class);
        startActivity(intent);
    }

    public void companyClicked(int currentCompany) {
        Intent intent = new Intent(this, ProductList.class);
        intent.putExtra("CompanyId", currentCompany);
        startActivity(intent);
    }
}