/*Faça uma classe chamada Conta, com os atributos nome e saldo.
Faça um método para sacar dinheiro
Outro método para depositar dinheiro
E outro método para transferir dinheiro de uma conta para outra */
package Lista10_Exceção.Exe07;
import java.util.ArrayList;
import java.util.List;
public class Conta {
    
    private String nome; 
    private Double saldo;
    public static List<Conta> listaContas = new ArrayList<>();

    public Conta(String nome, Double saldo) {
        setNome(nome);
        setSaldo(saldo);
        listaContas.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if ( nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome inválido");
        }
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String sacarDinheiro(double valorSacar) {

        double saldoFinal = 0;
        if(valorSacar <= getSaldo() && valorSacar > 0) {
            saldoFinal = getSaldo() - valorSacar;
            return "O saldo de " + getNome() + " após o saque é de R$ " + saldoFinal;
        } else {
            return "Não é possível realizar o saque na conta de " + getNome();
        }
    }

    public String depositarDinheiro(double valorDepositar) {
        
        double saldoFinal = 0;
        if(valorDepositar > 0) {
            saldoFinal = getSaldo() - valorDepositar;
        }
        return "O saldo de " + getNome() + " após o depósito é de R$ " + saldoFinal;
    }

    public String tranferirDinheiro(Conta contaDestino, double valorTransferir) {
        if(valorTransferir <= getSaldo() && valorTransferir > 0) {
                setSaldo(getSaldo() - valorTransferir);
                contaDestino.saldo += valorTransferir;
                return "Valor tranferido da conta de " + getNome() + " para a conta de " + contaDestino.getNome();
        } else {
                return "Não pe possível realizar a transação";
        }
    }

    @Override
    public String toString() {
        return "- A conta de " + getNome() + " possui um saldo final de R$ " + getSaldo();
    }
}