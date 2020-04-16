package com.company;
    public class Carro {
        private String cor;
        private Marca marca;
        private int chassi;
        private Proprietário dono;
        private int velocidadeMaxima;
        private int velocidadeAtual;
        private int numeroPortas;
        private boolean tetoSolar;
        private int numeroMarchas;
        private int marchaAtual = 0;
        private boolean cambioAutomatico;
        private int volumeCombustivel;
        private int consumomedio;

        //Construtor Veiculo

        public Carro(Proprietário dono, String cor, Marca marca, int numeroPortas, boolean tetoSolar, boolean cambioAutomatico, int numeroMarchas)
        {
            this.dono = dono;
            this.numeroMarchas = numeroMarchas;
            this.velocidadeAtual = 0;
            this.volumeCombustivel = 15;
            this.numeroMarchas = numeroPortas;
            this.tetoSolar = tetoSolar;
            this.cambioAutomatico = cambioAutomatico;
            this.cor = cor;
            this.marca = marca;
        }
        //Fim construtor veiculo

        // metodos
        public void acelerar()
        {
            this.velocidadeAtual = this.velocidadeAtual++;
        }

        public void feiar()
        {
            this.velocidadeAtual = this.velocidadeAtual - this.velocidadeAtual;
            //this.velocidadeAtual = 0;
        }

        public void trocarMarcha() {
            if (marchaAtual == numeroMarchas) {
                System.out.println("Voce ja esta na marcha " + numeroMarchas + " impossivel passar mais marchas.");
            }
            else {
                this.marchaAtual = marchaAtual + 1;
                System.out.println("Marcha atual: " + marchaAtual);
            }
        }

        public void reduzirMarcha() {
            if(marchaAtual == -1 && velocidadeAtual > 0)
            {
                System.out.println("Impossivel engatar a ré com velocidade acima de 0 KM/H");
            }
            if (marchaAtual == -1) {
                System.out.println("Voce ja esta na marcha ré, impossivel reduzir mais.");
            } else
            {
                this.marchaAtual = marchaAtual - 1;
            }
            System.out.println("Marcha atual: " + marchaAtual);
        }

        public void volumeCombustivel()
        {
            System.out.println("O volume atual do combustivel é: " + volumeCombustivel);
        }

        public void calcularautonomia(int kmPorLitro)
        {
            this.consumomedio = kmPorLitro * volumeCombustivel;
            System.out.println("O carro tem autonomia de mais " + consumomedio + " quilometros");
        }
        // fim metodos

        public int getNumeroMarchas() {
            return numeroMarchas;
        }

        public void setNumeroMarchas(int numeroMarchas) {
            this.numeroMarchas = numeroMarchas;
        }

        @Override
        public String toString() {
            return "Carro{" +
                    "cor='" + cor + '\'' +
                    ", marca=" + marca +
                    ", chassi=" + chassi +
                    ", dono=" + dono +
                    ", velocidadeMaxima=" + velocidadeMaxima +
                    ", velocidadeAtual=" + velocidadeAtual +
                    ", numeroPortas=" + numeroPortas +
                    ", tetoSolar=" + tetoSolar +
                    ", numeroMarchas=" + numeroMarchas +
                    ", marchaAtual=" + marchaAtual +
                    ", cambioAutomatico=" + cambioAutomatico +
                    ", volumeCombustivel=" + volumeCombustivel +
                    ", consumomedio=" + consumomedio +
                    '}';
        }
    }