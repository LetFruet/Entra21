/*O código a seguir foi escrito por um programador descuidado que, após tê-lo escrito, perdeu o código original da classe Cidade.
Verifique o trecho de código abaixo, e escreva qual seria o código necessário da classe.

Cidade gaspar = new Cidade();
gaspar.nome( "Gaspar" );
gaspar.uf( "SC" );
gaspar.populacaoMasculina( 28141 );
 
Cidade indaial = new Cidade();
indaial.nome( "Indaial" );
indaial.populacaoFeminina( 25844 );
indaial.calculado( true ); */
package Lista08_Encapsulamento.Exe06;

public class Cidade {
    
    private String nome; 
    private String uf;
    private double populacaoMasculina;
    private double populacaoFeminina;
    private boolean calculado;

    public Cidade(String nome, String uf, double populacaoMasculina, double populacaoFeminina, boolean calculado) {
        setNome(nome);
        setUf(uf);
        setPopulacaoMasculina(populacaoMasculina);
        setPopulacaoFeminina(populacaoFeminina);
        setCalculado(calculado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome vazio");
        }
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) throws IllegalArgumentException {
        if (uf == null || uf.trim().isEmpty()) {
            System.out.println("Unidade federativa vazia");
        }
        this.uf = uf;
    }

    public double getPopulacaoMasculina() {
        return populacaoMasculina;
    }

    public void setPopulacaoMasculina(double populacaoMasculina) throws IllegalArgumentException {
        if (populacaoMasculina < 0) {
            System.out.println("Número da população masculina inválido");
        }
        this.populacaoMasculina = populacaoMasculina;
    }

    public double getPopulacaoFeminina() {
        return populacaoFeminina;
    }

    public void setPopulacaoFeminina(double populacaoFeminina) throws IllegalArgumentException {
        if (populacaoFeminina < 0) {
            System.out.println("Número da população feminina inválido");
        }
        this.populacaoFeminina = populacaoFeminina;
    }

    public boolean isCalculado() {
        return calculado;
    }

    public void setCalculado(boolean calculado) throws IllegalArgumentException {
        this.calculado = calculado;
    }   
}
