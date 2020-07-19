package com.example.senka;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {


    public MainFragment() {
    }
    RecyclerView recyclerView;
    List<Product> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_main, container,false);

        recyclerView.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//        initData();

        recyclerView.setAdapter(new ItemAdapter(initData()));
        return view;

    }

    private List<Product> initData() {
        itemList=new ArrayList<>();
        itemList.add(new Product(R.drawable.sua_rua_mat_1,"SENKA PERFECT WHIP ACNE CARE", "Sửa rủa mặt dành cho da mụn","105.000 VND"));
        itemList.add(new Product(R.drawable.sua_rua_mat_1,"SENKA PERFECT WHIP ACNE CARE", "Sửa rủa mặt dành cho da mụn","105.000 VND"));
        itemList.add(new Product(R.drawable.sua_rua_mat_1,"SENKA PERFECT WHIP ACNE CARE", "Sửa rủa mặt dành cho da mụn","105.000 VND"));
        itemList.add(new Product(R.drawable.sua_rua_mat_1,"SENKA PERFECT WHIP ACNE CARE", "Sửa rủa mặt dành cho da mụn","105.000 VND"));
        itemList.add(new Product(R.drawable.sua_rua_mat_1,"SENKA PERFECT WHIP ACNE CARE", "Sửa rủa mặt dành cho da mụn","105.000 VND"));

        return itemList;
    }
}
