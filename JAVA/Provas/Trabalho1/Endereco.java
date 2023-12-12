package Trabalho1;
public class Endereco {

    //criando os atribustos da classe Endereco
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String uf;
    
    //criando o contrutor que armazenará os dados do Endereco do restaurante
    public Endereco(String rua, int numero, String bairro, String cep, String uf) {
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCep(cep);
        setUf(uf);
    }

    //criando getters, settters e tratamento de exceção
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws IllegalArgumentException {
        if (rua == null || rua.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da rua inválido");
        }
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) {
            throw new IllegalArgumentException("Número de endereço inválido");
        }
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws IllegalArgumentException {
        if (bairro == null || bairro.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do bairro inválido");
        }
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws IllegalArgumentException {
        if (cep == null || cep.trim().isEmpty()) {
            throw new IllegalArgumentException("CEP inválido");
        }
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) throws IllegalArgumentException {
        if (uf == null || uf.trim().isEmpty()) {
            throw new IllegalArgumentException("Sigla da unidade federativa inválida");
        }
        this.uf = uf;
    }

    //imprimindo os dados do Endereco do restaurante 
    @Override
    public String toString() {
        return "Rua: " + getRua() + " - " + getNumero() + "\nBairro: " + getBairro() + "\nCEP: " + getCep() + "\nUF: " + getUf();
    }
}