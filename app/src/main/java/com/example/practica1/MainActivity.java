package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements CompanyListFragment.CompanyListener {
    private int currentCompany = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void companyClicked(int currentCompany) {
        this.currentCompany = currentCompany;
        Intent intent = new Intent(this, ProductList.class);
        intent.putExtra("CompanyId", this.currentCompany);
        startActivity(intent);
    }
}