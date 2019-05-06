public final class ContaCorrente extends Conta {
  private float taxa;

  public ContaCorrente(Cliente titular, Banco banco, double saldo, String numeroConta, float taxa) {
    this.setTitular(titular);
    this.setBanco(banco);
    this.setSaldo(saldo);
    this.setNumeroConta(numeroConta);
    this.setTaxa(taxa);
  }

  public final void exibirDadosConta() {
    System.out.println("\nBanco: " + this.getBanco().getCodigo() + " - " + this.getBanco().getNome());
    System.out.println("Conta: " + this.getNumeroConta());
    System.out.println("Titular: " + this.getTitular().getNome());
    System.out.printf("Saldo: R$ %.2f", this.getSaldo());
    System.out.printf("\nTaxa: %.1f%%", this.getTaxa());
  }

  public float getTaxa() {
    return taxa;
  }

  public void setTaxa(float taxa) {
    this.taxa = taxa;
  }
}