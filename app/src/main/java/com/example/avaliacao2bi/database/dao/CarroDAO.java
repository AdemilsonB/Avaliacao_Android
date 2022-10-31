package com.example.avaliacao2bi.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.avaliacao2bi.entity.Carro;

import java.util.List;

@Dao
public interface CarroDAO {

    @Insert
    void salvarCarro(Carro carro);

    @Update
    void editarCarro(Carro carro);

    @Delete
    void excluirCarro(Carro carro);

    @Query("SELECT * FROM `carros.tb`")
    List<Carro> getCarros();


}

