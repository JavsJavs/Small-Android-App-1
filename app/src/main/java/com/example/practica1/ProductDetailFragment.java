package com.example.practica1;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    private String model;
    private String company;

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
            this.model = ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].name;
            this.company = ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].company;
            productDetailName.setText(this.model);
            productDetailPrice.setText(ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].price);
            productDetailDescription.setText(ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].description);
            String imageResource = ProductData.PRODUCT_DATA[this.currentCompany][this.currentPosition].image;
            if(String.valueOf(getResources().getIdentifier(imageResource, "drawable", Objects.requireNonNull(getContext()).getPackageName())).equals("0")) {
                String currentLogo = this.company.toLowerCase();
                if(currentLogo.equals("apple") || currentLogo.equals("huawei") || currentLogo.equals("microsol") || currentLogo.equals("samsung"))
                    currentLogo += "logo";
                else
                    currentLogo = "defaultminiature";
                productDetailImage.setImageResource(getResources().getIdentifier(  currentLogo, "drawable", Objects.requireNonNull(getContext()).getPackageName()));
            }else{
                productDetailImage.setImageResource(getResources().getIdentifier(imageResource, "drawable", Objects.requireNonNull(getContext()).getPackageName()));
            }
            Button shareButton = v.findViewById(R.id.shareButton);
            shareButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sendMail(v);
                }
            });
        }
    }

    private String fillMailString(String model, String company){
        return "Hey! Mira como mola el nuevo " + model + " de " + company + "!\n\nPuedes comprarlo en este link: www.amazoff.com/"+ company.toLowerCase().replace(" ", "") + "/" + model.toLowerCase().replace(" ", "") + "\n\nYa me lo agradecerás luego\uD83D\uDC4D";
    }

    private void sendMail(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, fillMailString(this.model, this.company));
        startActivity(intent);
    }
}