package com.company;
public class Carro {
    Proprietario proprietario;
    private String nome;
    private String cor;
    private Marca marca;
    private String chassi;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroPortas;
    private boolean tetoSolar;
    private int numeroMarchas;
    private int marchaAtual = 0;
    private boolean cambioAutomatico;
    private int volumeCombustivel;
    private int consumomedio;
    private int ano;

    //Construtor Veiculo

    public Carro(String nome,String cor, Marca marca, int numeroPortas, boolean tetoSolar, boolean cambioAutomatico, int numeroMarchas, String chassi, Proprietario proprietario, int ano)
    {
        this.ano = ano;
        this.nome = nome;
        this.numeroMarchas = numeroMarchas;
        this.velocidadeAtual = 0;
        this.volumeCombustivel = 15;
        this.numeroMarchas = numeroPortas;
        this.tetoSolar = tetoSolar;
        this.numeroMarchas = numeroMarchas;
        this.cambioAutomatico = cambioAutomatico;
        this.cor = cor;
        this.marca = marca;
        this.chassi = chassi;
        this.proprietario = proprietario;
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

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", marca=" + marca +
                ", chassi=" + chassi +
                ", numeroPortas=" + numeroPortas +
                ", tetoSolar=" + tetoSolar +
                ", numeroMarchas=" + numeroMarchas +
                ", cambioAutomatico=" + cambioAutomatico +
                ", ano=" + ano +
                " proprietario=" + proprietario +'}';
    }
}