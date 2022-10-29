package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listItem;
    private ArrayList<Berita> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItem = findViewById(R.id.recyclerview);
        listItem.setHasFixedSize(true);

        list.addAll(DataBerita.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        listItem.setLayoutManager(new LinearLayoutManager(this));
        ListAdapter listAdapter = new ListAdapter(list);
        listItem.setAdapter(listAdapter);
    }
}