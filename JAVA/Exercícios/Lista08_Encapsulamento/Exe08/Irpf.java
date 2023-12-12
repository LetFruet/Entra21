/*Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME, CPF, UF (RS, PR e SC) e RENDA ANUAL.
Nome: João da Silva
CPF: 123.456.789-00
UF: PR
RendaAnual: R$40.000

Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:

Nível de Renda Anual     Alíquota
0 a 4.000                  0%
4.001 a 9.000              5,8%
9.001 a 25.000             15%
25.001 a 35.000            27,5%
acima de 35.000            30%

Sendo assim, deve-se calcular o imposto a pagar do seguinte modo: Imposto a pagar = Renda Anual * Alíquota
Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.

a) Quem mais paga imposto.
b) Quem menos paga imposto.
c) Qual o total de imposto pago entre os 5 contribuintes? */
package Lista08_Encapsulamento.Exe08;
public class Irpf {
    
    private String nome;
    private String cpf;
    private String uf; 
    private double rendaAnual;

    public Irpf(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) throws IllegalArgumentException {
        if (uf == null || uf.trim().isEmpty()) {
            System.out.println("Unidade federativa inválida");
        }
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) throws IllegalArgumentException {
        if (rendaAnual < 0) {
            System.out.println("Renda anual inválida");
        }
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        
        double imposto = 0;

        if (rendaAnual <= 4000) {
            imposto = 0;
        } else if (rendaAnual >= 4001 && rendaAnual <= 9000) {
            imposto = rendaAnual * 0.058;
        } else if (rendaAnual >= 9001 && rendaAnual <= 25000) {
            imposto = rendaAnual * 0.15;
        } else if (rendaAnual >= 25001 && rendaAnual <= 35000) {
            imposto = rendaAnual * 0.275;
        } else {
            imposto = rendaAnual * 0.3;
        }
        
        return imposto;
    }
}
