package com.example.avaliacao2bi.activity;
///////////////////////////////////////////////////
import androidx.appcompat.app.AppCompatActivity;
//////////////////////////////////////////////////
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.example.avaliacao2bi.R;
//////////////////////////////////////////////////
import com.example.avaliacao2bi.database.CarrosDB;
import com.example.avaliacao2bi.database.dao.CarroDAO;
import com.example.avaliacao2bi.entity.Carro;

public class DetalhesActivity extends AppCompatActivity {

    TextView tvMarcaD;
    TextView tvModeloD;
    TextView tvCombustivelD;
    TextView tvAnoD;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tvMarcaD  = findViewById(R.id.tvMarcaD);
        tvModeloD  = findViewById(R.id.tvModeloD);
        tvCombustivelD  = findViewById(R.id.tvCombustivelD);
        tvAnoD  = findViewById(R.id.tvAnoD);

        dao = CarrosDB.getInstance(this).getCarroDAO();

        Intent intent = getIntent();

        Carro dCarro;

        dCarro = (Carro) intent.getSerializableExtra("carro");
        tvMarcaD.setText(dCarro.getMarca());
        tvModeloD.setText(dCarro.getModelo());
        tvCombustivelD.setText(dCarro.getCombustivel());
        tvAnoD.setText(dCarro.getAno());

        ibVoltar.setOnClickListener(v->{
            finish();
        });
    }
}