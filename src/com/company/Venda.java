package com.company;

import java.util.ArrayList;
import java.util.List;

public class Venda{
    private List<Carro> lista = new ArrayList<Carro>();
    private Carro Carro;

    public List<Carro> getLista() {
        return lista;
    }

    public void setLista(List<Carro> lista) {
        this.lista = lista;
    }

    // METODOS
    public void adicionarVeiculos(Carro veiculo)
    {
        lista.add(veiculo);
        System.out.println("Veiculo " + veiculo.getNome() + " " +  veiculo.getCor() + " adicionado com sucesso!");
    }


    public void obterVeiculo(String chassi) {
        for(int i=0;i<lista.size();i++) {
            Carro veiculo = lista.get(i);
            if (veiculo.getChassi().equals(chassi)) {
                System.out.println(veiculo);
            }
        }
    }

    public void buscar(String nome, String cor)
    {
        for(int i =0; i<lista.size(); i++)
        {
            Carro veiculo = lista.get(i);
            if(veiculo.getNome().equals(nome) || veiculo.getCor().equals(cor))
            {
                System.out.println(veiculo);
            }
        }
    }

    // FIM METODOS


    @Override
    public String toString() {
        return "Venda{" +
                "lista=" + lista +
                '}';
    }
}