package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Caraguatatuba","Sao Paulo","Avenida Professor Almeida","APTO 905","11445-190");
        Endereco endereco2 = new Endereco("Porto Alegre","Rio Grande do Sul","AV. Ipiranga","APTO 105","10245-190");
        Endereco endereco3 = new Endereco("Porto Alegre","Rio Grande do Sul","Avenida Professor Ferreira","APTO 105","11385-190");
        Proprietario proprietario1 = new Proprietario("Joao", "02673912937", "3847183",endereco1);
        Proprietario proprietario2 = new Proprietario("Larissa", "02682732937", "3865183",endereco1);
        Proprietario proprietario3 = new Proprietario("Felipe", "02673928437", "3315183",endereco1);
        Marca marca1 = new Marca(1978,3,2203,"Ford");
        Marca marca2 = new Marca(1979,2,2204,"Volkswagen");
        Marca marca3 = new Marca(1978,2,2205,"Maserati");
        Carro carro1 = new Carro("Mustang","vermelho", marca1, 4, true, true, 6,"2309",proprietario1,2019);
        Carro carro2 = new Carro("Gol","branco", marca2, 4, true, true, 5,"6848",proprietario2,2019);
        Carro carro3 = new Carro("Grancabrio","vermelho", marca3, 2, false, true, 6,"4923HA",proprietario3,2019);
        Venda listaDeCarros = new Venda();

        listaDeCarros.adicionarVeiculos(carro1);
        listaDeCarros.adicionarVeiculos(carro2);
        listaDeCarros.adicionarVeiculos(carro3);

        listaDeCarros.obterVeiculo("2309");
        listaDeCarros.buscar("Mustang","vermelho");

    }
}