/*Implemente um programa para ler o cadastro de um laboratório de informática. No laboratório existem N computadores.
  Cada computador possui as seguintes informações:
- número de série
- modelo do processador
- clock do processador em GHz
- um boolean informando se pode ser feito overclock no processador
- armazenamento do HDD
- quantidade de memória
- consumo de energia
- potência da fonte

O boolean referente ao overclock não deve ser passado como parâmetro do construtor, mas atribuido true no construtor caso
o modelo do processador termine em 'K' ou 'KF' ou 'X' e false caso não termine.

a) Um método que faça overclock no processador. O método deve ter como parâmetro o incremento em MHz que será feito de overclock.
Os processadores só aceitam overclock até 10% do clock original. A cada 100 MHz que o clock sobe, o consumo do computador aumenta em 75W.
O consumo do computador nunca deve ultrapassar 95% da potência da fonte. Note que o processador somente aceitará overclock caso a variável
booleana de overclock for true. Caso não seja possível fazer o overclock, por qualquer uma das limitações, informe por que não foi possível.

b) Um método que informe o armazenamento total desse laboratório

c) O laboratório está pensando em implementar mais 3 salas iguais a essa no prédio. Eles querem saber antes qual o impacto do total de 
computadores nos gastos de energia elétrica. Informe qual a potência mínima em Watts que o circuito elétrico deve ter para acomodar todas 
as salas. A potência mínima é calculada a partir do consumo total e adicionado 10% por questões de segurança.Assumindo que eles vão rodar 
por uma média de 12 horas por dia, informe também o gasto de energia elétrica que a empresa terá com essas 3 salas.Considere o preço da 
energia elétrica 71 centavos por KW/h.

Computador 1:
   - Número de série: "SN001"
   - Modelo do processador: "Intel Core i7-13700KF"
   - CPU Clock: 5.4 GHz
   - Permite overclock: True
   - Armazenamento do HDD: 512 GB
   - Memória RAM: 16 GB
   - Consumo de energia: 500W
   - Potência da fonte: 850W

Computador 2:
   - Número de série: "SN002"
   - Modelo do processador: "AMD Ryzen 9 5950X"
   - CPU Clock: 4.9 GHz
   - Permite overclock: True
   - Armazenamento do HDD: 1 TB
   - Memória RAM: 32 GB
   - Consumo de energia: 500W
   - Potência da fonte: 1000W

Computador 3:
   - Número de série: "SN003"
   - Modelo do processador: "Intel Core i5-9400F"
   - CPU Clock: 4.1 GHz
   - Permite overclock: False
   - Armazenamento do HDD: 256 GB
   - Memória RAM: 8 GB
   - Consumo de energia: 400W
   - Potência da fonte: 600W

Computador 4:
   - Número de série: "SN004"
   - Modelo do processador: "AMD Ryzen 7 3700X"
   - CPU Clock: 4.4 GHz
   - Permite overclock: True
   - Armazenamento do HDD: 512 GB
   - Memória RAM: 16 GB
   - Consumo de energia: 450W
   - Potência da fonte: 550W */
package Lista10_Exceção.Exe12;
public class Laboratorio {
    
   private String numeroSerie;
   private String modeloProcessador;
   private double clockProcessador;
   private boolean overlockProcessador; 
   private int armazenamentoHd;
   private int qntdMemoria;
   private int consumoEnergia;
   private int potenciaFonte;

   public Laboratorio(String numeroSerie, String modeloProcessador, double clockProcessador, int armazenamentoHd,
                      int qntdMemoria, int consumoEnergia, int potenciaFonte) {
      
      setNumeroSerie(numeroSerie);
      setModeloProcessador(modeloProcessador);
      setClockProcessador(clockProcessador);
      setArmazenamentoHd(armazenamentoHd);
      setQntdMemoria(qntdMemoria);
      setConsumoEnergia(consumoEnergia);
      setPotenciaFonte(potenciaFonte);
      setOverlockProcessador();  
   }

   public String getNumeroSerie() {
      return numeroSerie;
   }
   public void setNumeroSerie(String numeroSerie) {
      if (numeroSerie == null || numeroSerie.trim().isEmpty()) {
         throw new IllegalArgumentException("Número de série inválido");
      }
      this.numeroSerie = numeroSerie;
   }

   public String getModeloProcessador() {
      return modeloProcessador;
   }
   public void setModeloProcessador(String modeloProcessador) {
      if (modeloProcessador == null || modeloProcessador.trim().isEmpty()) {
         throw new IllegalArgumentException("Modelo de processador inválido");
      }
      this.modeloProcessador = modeloProcessador;
   }

   public double getClockProcessador() {
      return clockProcessador;
   }
   public void setClockProcessador(double clockProcessador) {
      if (clockProcessador < 0) {
         throw new IllegalArgumentException("Número do clock do processador inválido");
      }
      this.clockProcessador = clockProcessador;
   }

   public boolean isOverlockProcessador() {
      return overlockProcessador;
   }
   public void setOverlockProcessador() {
      //verificando se o modelo do processador permite overclock (verificando pela última letra da String)
      if (modeloProcessador.endsWith("K") || modeloProcessador.endsWith("KF") || modeloProcessador.endsWith("X")) {
          this.overlockProcessador = true;
      } else {
          this.overlockProcessador = false;
      }
   }

   public int getArmazenamentoHd() {
      return armazenamentoHd;
   }
   public void setArmazenamentoHd(int armazenamentoHd) {
      if (armazenamentoHd < 0) {
         throw new IllegalArgumentException("Número de armazenamento inválido");
      }
      this.armazenamentoHd = armazenamentoHd;
   }

   public int getQntdMemoria() {
      return qntdMemoria;
   }
   public void setQntdMemoria(int qntdMemoria) {
      if (qntdMemoria < 0) {
         throw new IllegalArgumentException("Quantidade de memória inválida");
      }
      this.qntdMemoria = qntdMemoria;
   }

   public int getConsumoEnergia() {
      return consumoEnergia;
   }
   public void setConsumoEnergia(int consumoEnergia) {
      if (consumoEnergia < 0) {
         throw new IllegalArgumentException("Consumo de energia inválido");
      }
      this.consumoEnergia = consumoEnergia;
   }

   public int getPotenciaFonte() {
      return potenciaFonte;
   }
   public void setPotenciaFonte(int potenciaFonte) {
      if (potenciaFonte < 0) {
         throw new IllegalArgumentException("Potência da fonte inválida");
      }
      this.potenciaFonte = potenciaFonte;
   }

   //método para fazer overclock no processador com base nas especificações fornecidas
   public String fazerOverclock(int incrementoMhz) {

      if(!overlockProcessador) {
         return "Overclock não é permitido para este processador";
      }

      double incrementoGhz = incrementoMhz / 1000.0; //convertendo de Mhz para Ghz

      //verificando se o incremento ultrapassa o limite de 10% do original
      if((clockProcessador + incrementoGhz) > (clockProcessador * 0.10)) {
         return "O incremento ultrapassa o limite de 10% do clock original.";
      } 
         
      //caso o incremento não ultrapassar o limite do original
      //encontrando quantas vezes os 100 MHz existem no incremento e multiplicando o número de vezes pelo aumento de consumo de energia
      int aumentoConsumo = (incrementoMhz / 100) * 75; 
      
      //verificando se o incremento ultrapassa o limite de 95% da potência da fonte
      if((consumoEnergia + aumentoConsumo) > (potenciaFonte * 0.95)) {
         return "O consumo ultrapassaria 95% da potência da fonte com esse overclock.";
      }

      //caso o incremento não ultrapassar o limite de potência da fonte
      clockProcessador += incrementoGhz;
      consumoEnergia += aumentoConsumo;

      return "Overclock realizado com sucesso!";
   }

   //calculando o armazenamento total de todos os computadores do laboratório
   public static int armazenamentoTotal(Laboratorio[] computadores) {

      int armazenamentoTotal = 0;
      for (Laboratorio L : computadores) {
         armazenamentoTotal += L.getArmazenamentoHd();
      }

      return armazenamentoTotal;
   }

   //calculando a potência total de todos os computadores do laboratório considerando novas salas
   public static double potenciaTotal(Laboratorio[] computadores) {

      double totalPotencia = 0;
      for (Laboratorio comp : computadores) {
         totalPotencia += comp.getConsumoEnergia();
      }
      totalPotencia *= 4;  //incluindo as 3 novas salas

      return totalPotencia * 0.10; //adicionando os 10% por questões de segurança
   }

   //calculando o gasto de energia elétrica total de todos os computadores do laboratório
   public static double gastoEnergiaEletrica(Laboratorio[] computadores) {

      double totalPotencia = potenciaTotal(computadores);
      double consumoDiario = (totalPotencia / 1000) * 12; // em KWh

      return (consumoDiario * 0.71); //valor da energia/KWh 
   }
}
