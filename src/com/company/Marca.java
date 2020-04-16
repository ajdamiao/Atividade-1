package com.company;

public class Marca {
    private String marca;
    private String nome;
    private int ano;
    private int numeroDeModelos;
    private int codigoIdentificador;


    public Marca(String nome, int ano, int numeroDeModelos, int codigoIdentificador, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.numeroDeModelos = numeroDeModelos;
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return
                "marca='" + marca + '\'' +
                        ", nome='" + nome + '\'' +
                        ", ano=" + ano +
                        ", numeroDeModelos=" + numeroDeModelos +
                        ", codigoIdentificador=" + codigoIdentificador +
                        '}';
    }
}