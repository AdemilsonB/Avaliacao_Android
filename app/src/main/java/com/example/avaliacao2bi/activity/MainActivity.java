package com.example.avaliacao2bi.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.example.avaliacao2bi.R;
import com.example.avaliacao2bi.adapter.CarroAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCarros;
    FloatingActionButton fabNovo;
    CarroAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCarros = findViewById(R.id.rvCarros);
        fabNovo = findViewById(R.id.fabNovo);

        LinearLayoutManager layout = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        adapter = new CarroAdapter(this);

        rvCarros.setLayoutManager(layout);
        rvCarros.setAdapter(adapter);

        fabNovo.setOnClickListener( v->{ startActivity(new Intent(this, FormsActivity.class)); });
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.updateDataSet();
    }
}