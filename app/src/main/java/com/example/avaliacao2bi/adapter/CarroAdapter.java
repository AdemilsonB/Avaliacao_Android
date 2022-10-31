package com.example.avaliacao2bi.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avaliacao2bi.R;
import com.example.avaliacao2bi.activity.DetalhesActivity;
import com.example.avaliacao2bi.database.CarrosDB;
import com.example.avaliacao2bi.database.dao.CarroDAO;
import com.example.avaliacao2bi.entity.Carro;
import com.example.avaliacao2bi.activity.FormsActivity;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<Carro> listaCarros;
    private CarroDAO dao;

    public CarroAdapter(Context context) {
        this.context = context;
        dao = CarrosDB.getInstance(context).getCarroDAO();
        listaCarros = dao.getCarros();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_carro, parent, false);

        CarroViewHolder cvh = new CarroViewHolder(itemView);

        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Carro c = listaCarros.get(position);

        CarroViewHolder cvh = (CarroViewHolder) holder;

        cvh.tvMarca.setText(c.getMarca());
        cvh.tvModelo.setText("Modelo: " + c.getModelo());
        cvh.tvCombustivel.setText("Combustivel: " + c.getCombustivel());
        cvh.tvAno.setText("Ano: " + c.getAno());


        cvh.ibEditar.setOnClickListener(v->{
            Intent editarIntent = new Intent(context, FormsActivity.class);
            editarIntent.putExtra("carro", c);
            context.startActivity(editarIntent);
        });

        cvh.ibExcluir.setOnClickListener(v->{
            new AlertDialog.Builder(context)
                   .setTitle("Excluir carro")
                    .setMessage("Deseja excluir este carro?")
                    .setNegativeButton("Não", null)
                    .setPositiveButton("Sim!", (dialogInterface, i) -> {
                        dao.excluirCarro(c);
                        updateDataSet();
                    })
                    .show();
        });

        cvh.ibDetalhes.setOnClickListener(v->{
            Intent DetalhesIntent = new Intent(context, DetalhesActivity.class);
            DetalhesIntent.putExtra("carro", c);
            context.startActivity(DetalhesIntent);
        });

    }

    @Override
    public int getItemCount() {
        return listaCarros.size();
    }

    public void updateDataSet(){
        listaCarros.clear();
        listaCarros = dao.getCarros();
        notifyDataSetChanged();
    }
}