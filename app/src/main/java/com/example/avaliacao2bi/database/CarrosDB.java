package com.example.avaliacao2bi.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.avaliacao2bi.database.dao.CarroDAO;
import com.example.avaliacao2bi.entity.Carro;

@Database(entities = {Carro.class}, version = 1, exportSchema = false)
public abstract class CarrosDB extends RoomDatabase {

    private static final String DB_NAME = "carros.db";

    public abstract CarroDAO getCarroDAO();

    private static CarrosDB instance;

    public static CarrosDB getInstance(Context context)
    {
        if (instance == null)
        {
            instance = Room.databaseBuilder(context, CarrosDB.class, DB_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
}