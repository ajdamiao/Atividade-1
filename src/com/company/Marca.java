package com.company;

public class Marca {
    private String marca;
    private int ano;
    private int numeroDeModelos;
    private int codigoIdentificador;


    public Marca(int ano, int numeroDeModelos, int codigoIdentificador, String marca) {
        this.marca = marca;
        this.ano = ano;
        this.numeroDeModelos = numeroDeModelos;
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return
                marca + '\'' +
                        ", ano=" + ano +
                        ", numeroDeModelos=" + numeroDeModelos +
                        ", codigoIdentificador=" + codigoIdentificador +
                        '}';
    }
}