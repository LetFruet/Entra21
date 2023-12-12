package Lista12_Relacionamento.Exe04;

import java.util.ArrayList;
import java.util.List;

public class Setor {
    
    private List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    public void adicionarFuncionario(Funcionario umFuncionario) {
        listaFuncionarios.add(umFuncionario);
    }

    public double totalFolhaDePagamentoSetor() {
        double valorTotal = 0;

        for (Funcionario f : listaFuncionarios) {
            valorTotal += f.getSalario();
        }
        return valorTotal;
    }

    public double totalFolhaDePagamentoDepto(int umDepto) {
        double valorTotal = 0;

        for (Funcionario f : listaFuncionarios) {
            if (f.getDepto() == umDepto) {
                valorTotal += f.getSalario();
            }
        }
        return valorTotal;
    }

    public Funcionario funcionarioMaiorSalario() {
        double maiorSalario = Double.MIN_VALUE;
        Funcionario umFuncionario = null;

        for (Funcionario f : listaFuncionarios) {
            if (f.getSalario() > maiorSalario) {
                maiorSalario = f.getSalario();
                umFuncionario = f;
            }
        }
        return umFuncionario;
    }

    public Funcionario acharFuncionario(String nome, String matricula) {

        for (Funcionario f : listaFuncionarios) {
            if (f.getNome().equals(nome) && f.getMatricula().equals(matricula)) {
                return f;
            }
        }
        return null;
    }

    private String printarLista() {
        String str = "";
        for (Funcionario f : listaFuncionarios) {
            str += f.toString() + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        return "Funcioários: \n" + printarLista();
    }
}
