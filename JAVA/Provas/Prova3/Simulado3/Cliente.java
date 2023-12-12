/*Implemente um sistema para realizar a consulta de contas bancárias de um determinado banco. Para testar o sistema, 
pede-se o armazenamento do seguinte conjunto de contas bancárias. Cada conta bancária possui as informações abaixo:
Nome do cliente	    Categoria 	    Ano de cadastro	        Saldo 	    Gerente 
Jorge 	             Private 	        2022 	        R$ 2.500.000 	  Ana
Luís 	             Stilo 	            2015 	        R$ 500.000 	      Ana 
Cláudio 	       Exclusive 	        2017 	        R$ 250.000 	     Marina
Bruna 	            Prime 	            2005 	        R$ 5.500.000 	  Paulo
Ana 	           Exclusive 	        2023 	        R$ 240.000 	      Paulo

Imprima:
a)	Informações do cliente com mais dinheiro no banco
b)	Informações do cliente mais antigo de um dado gerente
c)	Imprimir as informações de todos os clientes de um dado gerente
d)	Informar quantos clientes um dado gerente tem*/
package Prova3.Simulado3;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    
    private String nomeCliente;
    private char categoria;
    private int anoCadastro;
    private double saldo;
    private Gerente umGerente;
    public static List<Cliente> listaClientes = new ArrayList<>();
    
    public Cliente(String nomeCliente, char categoria, int anoCadastro, double saldo, Gerente umGerente) {
        setNomeCliente(nomeCliente);
        setCategoria(categoria);
        setAnoCadastro(anoCadastro);
        setSaldo(saldo);
        setUmGerente(umGerente);
        listaClientes.add(this);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) throws IllegalArgumentException {
        if (nomeCliente == null || nomeCliente.isEmpty() || nomeCliente.isBlank()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }
        this.nomeCliente = nomeCliente;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) throws IllegalArgumentException {
        if (categoria != 'p' && categoria != 'P' && categoria != 's' && categoria != 'S' && categoria != 'e' && categoria != 'E') {
            throw new IllegalArgumentException("Categoria inválido");
        }
        this.categoria = categoria;
    }

    public int getAnoCadastro() {
        return anoCadastro;
    }

    public void setAnoCadastro(int anoCadastro) throws IllegalArgumentException {
        if (anoCadastro < 0) {
            throw new IllegalArgumentException("Ano do cadastro inválido");
        }
        this.anoCadastro = anoCadastro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Gerente getUmGerente() {
        return umGerente;
    }

    public void setUmGerente(Gerente umGerente) throws IllegalArgumentException {
        if (umGerente == null) {
            throw new IllegalArgumentException("Nome do gerente inválido");
        }
        this.umGerente = umGerente;
    }
    @Override
    public String toString() {

        String str = "--- Cliente: " + getNomeCliente() + "\t | Ano de cadastro: " + getAnoCadastro() + "\t| Categoria: ";

        if (categoria == 'e' || categoria == 'E') {
            str += " executivo";
        } else if (categoria == 'p' || categoria == 'P') {
            str += " prime";
        } else {
            str += " stilo";
        }

        str += "\t| Saldo: " + getSaldo();
        return str;
    }
}