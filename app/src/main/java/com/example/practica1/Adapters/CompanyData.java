package com.example.practica1.Adapters;

import java.util.ArrayList;
import java.util.Arrays;

public class CompanyData {
    public String name = "";
    public String image = "";

    public static CompanyData[] COMPANY_DATA = {
            new CompanyData("Apple", "applelogo"),
            new CompanyData("Samsung", "samsunglogo"),
            new CompanyData("Huawei", "huaweilogo"),
            new CompanyData("Microsol", "microsollogo")};

    public CompanyData(String name, String image){
        this.name = name;
        this.image = image;
    }

    private static CompanyData[] appendValue(CompanyData[] companyArray, CompanyData companyData){
        ArrayList<CompanyData> temp = new ArrayList<CompanyData>(Arrays.asList(companyArray));
        temp.add(companyData);
        return temp.toArray(new CompanyData[0]);
    }

    public static void addCompany(CompanyData companyData) {
        COMPANY_DATA = appendValue(COMPANY_DATA, companyData);
    }

    public static boolean companyRegistered(String companyName){
        boolean registered = false;
        for(int i = 0; i < COMPANY_DATA.length; i++){
            if(COMPANY_DATA[i].name.toLowerCase().equals(companyName.toLowerCase())){
                registered = true;
                break;
            }
        }
        return registered;
    }
}