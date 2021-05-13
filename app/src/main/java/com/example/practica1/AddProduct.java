package com.example.practica1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practica1.Adapters.CompanyData;
import com.example.practica1.Adapters.ProductData;

public class AddProduct extends AppCompatActivity {
    private Button confirmProductButton;
    private EditText newCompany;
    private EditText newName;
    private EditText newPrice;
    private EditText newDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        this.newCompany = findViewById(R.id.newCompany);
        this.newName = findViewById(R.id.newName);
        this.newPrice = findViewById(R.id.newPrice);
        this.newDescription = findViewById(R.id.newDescription);
        this.confirmProductButton = findViewById(R.id.confirmProduct);

        confirmProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct(v);
            }
        });
    }

    private void addProduct(View v){
        String companyName = String.valueOf(this.newCompany.getText());
        String modelName = String.valueOf(this.newName.getText());
        String modelPrice = String.valueOf(this.newPrice.getText());
        String modelDescription = String.valueOf(this.newDescription.getText());
        int existingCompany = checkCompanyExists(companyName);
        if (existingCompany != -1 && checkModelExists(existingCompany, modelName)){
            Log.e("AddProductError", "Model already exists");
        }else{
            ProductData.addProduct(modelName, modelPrice, modelDescription, companyName);
        }
    }

    private int checkCompanyExists(String companyName){
        for(int i = 0; i < CompanyData.COMPANY_DATA.length; i++) {
            if (CompanyData.COMPANY_DATA[i].name.equals(companyName)) {
                return i;
            }
        }
        return -1;
    }

    private boolean checkModelExists(int existingCompany, String modelName){
        boolean modelExists = false;
        for(int i = 0; i < ProductData.PRODUCT_DATA[existingCompany].length; i++) {
            if (ProductData.PRODUCT_DATA[existingCompany][i].name.equals(modelName)) {
                modelExists = true;
                break;
            }
        }
        return modelExists;
    }
}
