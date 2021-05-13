package com.example.practica1.Adapters;

public class CompanyData {
    public String name = "";
    public String image = "";

    public static final CompanyData[] COMPANY_DATA = {
            new CompanyData("Apple", "applelogo"),
            new CompanyData("Samsung", "samsunglogo"),
            new CompanyData("Huawei", "huaweilogo"),
            new CompanyData("Microsol", "microsollogo")};

    public CompanyData(String name, String image){
        this.name = name;
        this.image = image;
    }
}
