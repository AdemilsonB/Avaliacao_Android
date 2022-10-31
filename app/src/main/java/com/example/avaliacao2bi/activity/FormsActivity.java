package com.example.avaliacao2bi.activity;
///////////////////////////////////////////////////////
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//////////////////////////////////////////////////////
import com.example.avaliacao2bi.R;
import com.example.avaliacao2bi.database.CarrosDB;
import com.example.avaliacao2bi.database.dao.CarroDAO;
import com.example.avaliacao2bi.entity.Carro;

public class FormsActivity extends AppCompatActivity {

    EditText etMarca;
    EditText etModelo;
    EditText etCombustivel;
    EditText etAno;
    Button bSalvar;

    CarroDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forms);

        etMarca = findViewById(R.id.etMarca);
        etModelo = findViewById(R.id.etModelo);
        etCombustivel = findViewById(R.id.etCombustivel);
        etAno    = findViewById(R.id.etAno);
        bSalvar  = findViewById(R.id.bSalvar);

        dao = CarrosDB.getInstance(this).getCarroDAO();

        Intent intent = getIntent();

        Carro edtCarro;

        if (intent.hasExtra("carro"))
        {
            edtCarro = (Carro) intent.getSerializableExtra("carro");
            etMarca.setText(edtCarro.getMarca());
            etModelo.setText(edtCarro.getModelo());
            etCombustivel.setText(edtCarro.getCombustivel());
            etAno.setText(edtCarro.getAno() + "");
        }
        else
        {
            edtCarro = null;
        }

        bSalvar.setOnClickListener(v->{

            if (etMarca.getText().toString().isEmpty() ||
                    etModelo.getText().toString().isEmpty() ||
                    etCombustivel.getText().toString().isEmpty() ||
                    etAno.getText().toString().isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            } else {

                Carro c = new Carro(
                        0,
                        etMarca.getText().toString(),
                        etModelo.getText().toString(),
                        etCombustivel.getText().toString(),
                        etAno.getText().toString()
                );

                if(edtCarro == null) {
                    dao.salvarCarro(c);
                } else {
                    c.setId(edtCarro.getId());
                    dao.editarCarro(c);
                }

                Toast.makeText(this, "carro salvo!", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }
}