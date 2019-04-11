public class Principal {
  public static void main (String arg[]) {
    Banco bancoItau = new Banco();

    bancoItau.setCodigo(031);
    bancoItau.setNome("Itau Unibanco");

    ContaCorrente contaCorrente = new ContaCorrente();

    contaCorrente.getTitular().setNome("Joao Wicktor");
    contaCorrente.getTitular().setCpf("0215489365-5");
    contaCorrente.getTitular().setIdade(20);
    contaCorrente.setNumero(15265);
    contaCorrente.setSaldo(2000.00);
    contaCorrente.setTaxa(10.2f);

    bancoItau.setConta(contaCorrente);
    
    System.out.println("\nBanco: " + bancoItau.getNome());
    System.out.println("Conta: " + bancoItau.getContas().get(0).getNumero());
    System.out.println("Titular: " + bancoItau.getContas().get(0).getTitular().getNome());
    System.out.println("Saldo: R$ " + bancoItau.getContas().get(0).getSaldo());
  }
}