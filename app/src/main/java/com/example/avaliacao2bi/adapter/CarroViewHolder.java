package com.example.avaliacao2bi.adapter;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.avaliacao2bi.R;

public class CarroViewHolder extends RecyclerView.ViewHolder {

    TextView tvMarca;
    TextView tvModelo;
    TextView tvCombustivel;
    TextView tvAno;
    ImageButton ibEditar;
    ImageButton ibExcluir;
    ImageButton ibDetalhes;

    public CarroViewHolder(@NonNull View itemView) {
        super(itemView);

        tvMarca  = itemView.findViewById(R.id.tvMarcaD);
        tvModelo = itemView.findViewById(R.id.tvModeloD);
        tvCombustivel   = itemView.findViewById(R.id.tvCombustivelD);
        tvAno = itemView.findViewById(R.id.tvAnoD);
        ibEditar = itemView.findViewById(R.id.ibEditar);
        ibExcluir = itemView.findViewById(R.id.ibExcluir);
        ibDetalhes = itemView.findViewById(R.id.ibDetalhes);
    }
}