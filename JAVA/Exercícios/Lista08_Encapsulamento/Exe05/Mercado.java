/*Utilizando a classe Mercado atribua valores às variáveis da classe Mercado para cada um dos objetos de Mercado.
Sendo que o preço de compra dos produtos foi igual em todos os mercados.

a) Quem teve o maior lucro vendendo maçãs?
b) Quem teve o maior lucro vendendo laranjas?
c) Qual das lojas teve o maior lucro nesse ano específico?
d) Qual das lojas teve o menor lucro?
e) Qual das lojas ficou no "meio" em termos de lucro?
f) Juntando as 3 lojas, a franquia teve um lucro maior vendendo maçãs ou laranjas? */
package Lista08_Encapsulamento.Exe05;
public class Mercado {
    
    private int vendaMacasAno;
    private double valorMacas;
    private int vendaLaranjaAno;
    private double valorLaranjas;

    public Mercado(int vendaMacasAno, double valorMacas, int vendaLaranjaAno, double valorLaranjas) {
        setVendaMacasAno(vendaMacasAno);
        setValorMacas(valorMacas);
        setVendaLaranjaAno(vendaLaranjaAno);
        setValorLaranjas(valorLaranjas);
    }

    public int getVendaMacasAno() throws IllegalArgumentException {
        return vendaMacasAno;
    }

    public void setVendaMacasAno(int vendaMacasAno) throws IllegalArgumentException {
        if (vendaMacasAno < 0) {
            System.out.println("Número da vendas de maças inválido");
        }
        this.vendaMacasAno = vendaMacasAno;
    }

    public double getValorMacas() {
        return valorMacas;
    }

    public void setValorMacas(double valorMacas) throws IllegalArgumentException {
        if (valorMacas <= 0) {
            System.out.println("Valor da venda das maças inválido");
        }
        this.valorMacas = valorMacas;
    }

    public int getVendaLaranjaAno() {
        return vendaLaranjaAno;
    }

    public void setVendaLaranjaAno(int vendaLaranjaAno) throws IllegalArgumentException {
        if (vendaLaranjaAno < 0) {
            System.out.println("Número da vendas de laranjas inválido");
        }
        this.vendaLaranjaAno = vendaLaranjaAno;
    }

    public double getValorLaranjas() {
        return valorLaranjas;
    }

    public void setValorLaranjas(double valorLaranjas) throws IllegalArgumentException {
        if (valorLaranjas <= 0) {
            System.out.println("Valor da venda das laranjas inválido");
        }
        this.valorLaranjas = valorLaranjas;
    }
}