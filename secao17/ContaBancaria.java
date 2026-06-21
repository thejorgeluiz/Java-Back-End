package secao17;

public class ContaBancaria {
  
  private String titular;
  private double saldo;

  public void setTitulat(String titular) {
    // lógica para válidar ou manipular
    if (titular != null && !titular.isEmpty()) {
      this.titular = titular;
    } else {
      System.out.println("Nome do titular inválido");
    }
  }
  public void setSaldo(double saldo) {
    if (saldo >= 0) {
      this.saldo =  saldo;
    } else {
      System.out.println("Valor precisa ser positivo");
    }
  }

  public void exibirInfo() {
    System.out.println("Títular: "+ titular + ", saldo: R$" + saldo);
  }

  public String getTitular() {
    return titular;
  }

  public String getSaldo() {
    return "R$" + saldo;
  }
}
