package com.example.avaliacao2bi.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "carros.tb")
public class Carro {

    @PrimaryKey (autoGenerate = true)
    private int id;
    private String marca;
    private String modelo;
    private String combustivel;
    private String ano;

    public Carro() {
    }

    @Ignore
    public Carro(int id, String marca, String modelo, String combustivel, String ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) { this.ano = ano; }
}
