package Prova3.Simulado3;

import java.util.List;

public class Gerente {
    
    private String nomeGerente;
    private List<Cliente> listaClientes;
 
    public Gerente (String nomeGerente) {
        setNomeGerente(nomeGerente);
    }

    public void adicionarCliente(Cliente novoCliente) {
        listaClientes.add(novoCliente);
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) throws IllegalArgumentException {
        if (nomeGerente == null || nomeGerente.isEmpty() || nomeGerente.isBlank()) {
            throw new IllegalArgumentException("Nome do gerente inválido");
        }
        this.nomeGerente = nomeGerente;
    }

    @Override
    public String toString() {
        
        return getNomeGerente();
    }
}
