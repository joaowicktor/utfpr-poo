public final class ContaPoupanca extends Conta {
  private float rentabilidade;

  public ContaPoupanca(Cliente titular, Banco banco, double saldo, String numeroConta, float rentabilidade) {
    this.setTitular(titular);
    this.setBanco(banco);
    this.setSaldo(saldo);
    this.setNumeroConta(numeroConta);
    this.setRentabilidade(rentabilidade);
  }

  public final void exibirDadosConta() {
    System.out.println("\nBanco: " + this.getBanco().getNome());
    System.out.println("Conta: " + this.getNumeroConta());
    System.out.println("Titular: " + this.getTitular().getNome());
    System.out.printf("Saldo: R$ %.2f", this.getSaldo());
    System.out.printf("\nRentabilidade: %.1f%%", this.getRentabilidade());
  }

  public float getRentabilidade() {
    return rentabilidade;
  }

  public void setRentabilidade(float rentabilidade) {
    this.rentabilidade = rentabilidade;
  }
}