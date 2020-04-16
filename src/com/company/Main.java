package com.company;

public class Main {

    public static void main(String[] args) {

        Proprietário proprietário1 = new Proprietário("Joao", "02673912937", "3847183");
        Marca marca1 = new Marca("HB20",2020,119,172396, "Hyundai");
        Carro carro1 = new Carro(proprietário1, "Vermelho", marca1, 4, true, true, 4);
        Endereco endereco1 = new Endereco("Caraguatatuba","Sao Paulo","Avenida Professor Almeida","APTO 905","11445-190");




        carro1.trocarMarcha();
        carro1.trocarMarcha();
        carro1.trocarMarcha();
        carro1.reduzirMarcha();
        System.out.println(carro1);
        carro1.calcularautonomia(4);



    }
}