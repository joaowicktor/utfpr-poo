public class Conta {
  private Cliente titular = new Cliente();
  private double saldo;
  private int numero;

  public Cliente getTitular() {
    return this.titular;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
}