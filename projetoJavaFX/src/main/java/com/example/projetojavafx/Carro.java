package com.example.projetojavafx;

public class Carro {
    private String placa;
    private String modelo;
    private Integer ano;
    private String combustivel;

    public Carro(String placa, String modelo, Integer ano, String combustivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}

