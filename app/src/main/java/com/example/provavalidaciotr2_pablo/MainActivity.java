package com.example.provavalidaciotr2_pablo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();



    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#000000", "Pablo", getString(R.string.sala)+" 1"));
        elements.add(new ListElement("#000000", "Pepe",  getString(R.string.sala) + " 4"));
        elements.add(new ListElement("#000000", "Javier",  getString(R.string.sala) + " 2"));
        elements.add(new ListElement("#000000", "Maria",  getString(R.string.sala) + " 3"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listarecyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }
}