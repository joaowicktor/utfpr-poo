public class Principal {
  public static void main (String arg[]) {
    Banco bancoItau = new Banco();
    bancoItau.setCodigo(31);
    bancoItau.setNome("Itau Unibanco");

    Cliente cliente = new Cliente("Joao Wicktor", "0215489365-5", 20);

    ContaCorrente contaCorrente = new ContaCorrente(cliente, bancoItau, 2000.00, "00001-1", 10.2f);
    contaCorrente.exibirDadosConta();
  }
}
