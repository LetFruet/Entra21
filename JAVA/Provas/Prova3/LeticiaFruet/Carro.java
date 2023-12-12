package Prova3.LeticiaFruet;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    
    private String modelo, marca, placa, cor;
    private int ano, localizacao;
    private double preco;
    public static List<Carro> listaCarros = new ArrayList<>();

    public Carro(String modelo, String marca, String placa, String cor, int ano, int localizacao, double preco) {
        setModelo(modelo);
        setMarca(marca);
        setPlaca(placa);
        setCor(cor);
        setAno(ano);
        setLocalizacao(localizacao);
        setPreco(preco);
        listaCarros.add(this);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws IllegalArgumentException {
        if (modelo == null || modelo.isEmpty() || modelo.isBlank()) {
            throw new IllegalArgumentException("Modelo inválido");
        }
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws IllegalArgumentException {
        if (marca == null || marca.isEmpty() || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws IllegalArgumentException {
        if (placa == null || placa.isEmpty() || placa.isBlank()) {
            throw new IllegalArgumentException("Placa inválida");
        }
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) throws IllegalArgumentException {
        if (cor == null || cor.isEmpty() || cor.isBlank()) {
            throw new IllegalArgumentException("Cor inválida");
        }
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws IllegalArgumentException {
        if (ano <0) {
            throw new IllegalArgumentException("Ano inválido");
        }
        this.ano = ano;
    }

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws IllegalArgumentException {
        if (preco < 0) {
            throw new IllegalArgumentException("Preço inválido");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "- Modelo: " + getModelo() + "\n  Marca: " + getMarca() + "\n  Placa" + getPlaca() + "\n  Cor: " + getCor() +  
               "\n  Ano: " + getAno() + "\n  Preço: R$ " + getPreco() + "\n  Localização: " + getLocalizacao();
    }
}
