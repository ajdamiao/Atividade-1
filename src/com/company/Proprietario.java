package com.company;

public class Proprietario {
    private Endereco endereco;
    private String nome;
    private String CPF;
    private String RG;
    private String dataNascimento;

    public Proprietario(String nome, String CPF, String RG, Endereco endereco) {
        this.endereco = endereco;
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'';
    }
}