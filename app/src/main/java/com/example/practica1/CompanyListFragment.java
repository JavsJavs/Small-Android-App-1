package com.example.practica1;

import android.content.Context;
import android.net.sip.SipSession;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica1.Adapters.CompanyAdapter;
import com.example.practica1.Adapters.CompanyData;

public class CompanyListFragment extends Fragment implements CompanyAdapter.CompanyAdapterListener {
    private CompanyListener companyListener;

    public interface CompanyListener{
        void companyClicked(int position);
    }

    @Override
    public void companyClicked(View v, int position) {
        if(companyListener != null){
            companyListener.companyClicked(position);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.companyListener = (CompanyListener) context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_company_list, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View v = getView();
        if(v != null) {
            RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.companyListRecycler);
            LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);
            CompanyAdapter mAdapter = new CompanyAdapter(CompanyData.COMPANY_DATA, this);
            recyclerView.setAdapter(mAdapter);
        }
    }
}