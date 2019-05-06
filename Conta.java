public abstract class Conta {
  private Cliente titular = new Cliente();
  private Banco banco = new Banco();
  private double saldo;
  private String numeroConta;

  public abstract void exibirDadosConta();

  public Cliente getTitular() {
    return this.titular;
  }
  
  public Banco getBanco() {
    return this.banco;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public String getNumeroConta() {
    return this.numeroConta;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public void setBanco(Banco banco) {
    this.banco = banco;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

}