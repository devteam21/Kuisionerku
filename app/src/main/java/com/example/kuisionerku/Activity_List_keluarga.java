package com.example.kuisionerku;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class Activity_List_keluarga extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Calling_data_keluarga> data_keluargalist = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data_keluarga);

        recyclerView = findViewById(R.id.recycleview_datakeluarga);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        data_keluargalist = (ArrayList<Calling_data_keluarga>) getIntent().getExtras().getSerializable("list");
        recyclerView.setAdapter(new CricketerAdapter(data_keluargalist));
    }
}
