/*Faça uma classe chamada OnibusEscolar, com os atributos estudantes e professor. Faça uma exceção no método setAlunos que se o número 
de alunos for maior do que 40, faça com que o número de alunos seja 40. Caso o número de professores for 0, o número de alunos também 
deve ser zerado. Faça também um método chamado remover alunos, que deverá remover os alunos de acordo com o valor passado como parâmetro */
package Lista10_Exceção.Exe02;
public class OnibusEscolar {
    
    private int estudantes;
    private int professor;

    public OnibusEscolar(int estudantes, int professor) {
        setEstudantes(estudantes);
        setProfessor(professor);
    }

    public int getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(int estudantes) throws IllegalArgumentException {
        if (estudantes > 40) {
            this.estudantes = 40; //não utiliza-se set dentro do método dele mesmo
        } else {
            this.estudantes = estudantes;
        }
    }

    public int getProfessor() {
        return professor;
    }

    public void setProfessor(int professor) throws IllegalArgumentException {
        if (professor == 0) {
            setEstudantes(0); //apenas utiliza-se o set fora do método set
        }
        this.professor = professor;
    }

    public String removerEstudantes(int qtdRemover) {
        if (qtdRemover < getEstudantes()) {
            setEstudantes(getEstudantes() - qtdRemover);
        } else {
            return "O número de estudantes é menor do que o número a ser removido";
        }
        return "O número de estudantes removido foi " + qtdRemover;
    }

    @Override
    public String toString() {
        return "A quantidade final de estudantes é: " + getEstudantes() + "\nA quantidade de professores é: " + getProfessor();
    }

}
