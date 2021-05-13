package com.example.practica1;

import android.content.Intent;
import android.graphics.Color;
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

        this.resetAddPage();

        confirmProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduct(v);
            }
        });
    }

    private void addProduct(View v){
        this.resetAddPage();
        boolean incorrectInput = false;
        String companyName = String.valueOf(this.newCompany.getText());
        String modelName = String.valueOf(this.newName.getText());
        String modelPrice = String.valueOf(this.newPrice.getText());
        String modelDescription = String.valueOf(this.newDescription.getText());
        int existingCompany = checkCompanyExists(companyName);
        if(modelName.equals("")){
            incorrectInput = true;
            this.wrongParameter("modelName", "Parámetro necesario");
        }else{
            if(modelName.length() > 32){
                incorrectInput = true;
                this.wrongParameter("modelName", "Nombre demasiado largo");
            } else if(modelName.length() <= 1){
                incorrectInput = true;
                this.wrongParameter("modelName", "Nombre demasiado corto");
            } else if (existingCompany != -1 && checkModelExists(existingCompany, modelName)){
                incorrectInput = true;
                this.wrongParameter("modelName", "Modelo ya registrado");
            }
        }
        if(companyName.equals("")){
            incorrectInput = true;
            this.wrongParameter("companyName", "Parámetro necesario");
        }else{
            if(companyName.length() > 16){
                incorrectInput = true;
                this.wrongParameter("companyName", "Nombre demasiado largo");
            } else if(companyName.length() <= 1){
                incorrectInput = true;
                this.wrongParameter("companyName", "Nombre demasiado corto");
            }else{
                companyName = companyName.substring(0, 1).toUpperCase() + companyName.substring(1).toLowerCase();
            }
        }
        if(modelPrice.equals("")){
            incorrectInput = true;
            this.wrongParameter("modelPrice", "Parámetro necesario");
        }else{
            if(!isNumeric(modelPrice)) {
                incorrectInput = true;
                this.wrongParameter("modelPrice", "Valor inválido");
            }else if(modelPrice.length() > 9){
                incorrectInput = true;
                this.wrongParameter("modelPrice", "Precio demasiado grande");
            }
        }
        if(modelDescription.equals("")){
            modelDescription = "Lorem ipsum dolor sit amet, vix at nulla saperet. Vim liber choro gloriatur cu, rebum malis cu cum. Dicant audire an eos, eos impedit perfecto te. Has ei inani argumentum, ne populo dissentiet qui.";
        }else{
            if(modelDescription.length() > 512){
                incorrectInput = true;
                this.wrongParameter("modelDescription", "Descripción demasiado larga");
            }
        }
        if(!incorrectInput){
            ProductData.addProduct(new ProductData(modelName, modelPrice + "$", modelDescription, "", companyName.substring(0, 1).toUpperCase() + companyName.substring(1).toLowerCase()));
        }
    }

    private void wrongParameter(String parameter, String error){
        Log.e("AddProductError", error);
        switch (parameter){
            case "modelName":
                this.newName.setText("");
                this.newName.setHint(error);
                this.newName.setHintTextColor(Color.RED);
                break;
            case "modelPrice":
                this.newPrice.setText("");
                this.newPrice.setHint(error);
                this.newPrice.setHintTextColor(Color.RED);
                break;
            case "modelDescription":
                this.newDescription.setText("");
                this.newDescription.setHint(error);
                this.newDescription.setHintTextColor(Color.RED);
                break;
            case "companyName":
                this.newCompany.setText("");
                this.newCompany.setHint(error);
                this.newCompany.setHintTextColor(Color.RED);
                break;
        }
    }

    private void resetAddPage(){
        this.newName.setHint("Nombre del producto");
        this.newPrice.setHint("Precio del producto");
        this.newCompany.setHint("Empresa distribuidora");
        this.newDescription.setHint("Descripción del producto");
        this.newName.setHintTextColor(Color.LTGRAY);
        this.newPrice.setHintTextColor(Color.LTGRAY);
        this.newCompany.setHintTextColor(Color.LTGRAY);
        this.newDescription.setHintTextColor(Color.LTGRAY);

    }

    private int checkCompanyExists(String companyName){
        for(int i = 0; i < CompanyData.COMPANY_DATA.length; i++) {
            if (CompanyData.COMPANY_DATA[i].name.toLowerCase().equals(companyName.toLowerCase())) {
                Log.e("Checking if mod", "true");
                return i;
            }
        }
        return -1;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private boolean checkModelExists(int existingCompany, String modelName){
        boolean modelExists = false;
        for(int i = 0; i < ProductData.PRODUCT_DATA[existingCompany].length; i++) {
            Log.e("Checking if mod", ProductData.PRODUCT_DATA[existingCompany][i].name + " " + modelName);
            if (ProductData.PRODUCT_DATA[existingCompany][i].name.equals(modelName)) {
                modelExists = true;
                break;
            }
        }
        return modelExists;
    }
}
