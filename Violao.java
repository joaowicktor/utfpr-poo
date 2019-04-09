public class Violao {
  // Atributos
  // Todos definidos como privados para somente serem acessados pela própria classe (encapsulamento)
  private String afinacao;
  private String cor;
  private String madeira;

  // Métodos
  public void entDados (String afi, String cor, String mad) {
    if (afi.isEmpty() || cor.isEmpty() || mad.isEmpty()) {
      System.out.println("Todos os dados devem ser informados");
    } else {
      this.afinacao = afi;
      this.cor = cor;
      this.madeira = mad;
    }
  }
  
  public void saiDados () {
    System.out.println("\nViolao");
    System.out.println("================================");
    System.out.println(" Afinacao: " + this.afinacao);
    System.out.println(" Cor: " + this.cor);
    System.out.println(" Tipo de Madeira: " + this.madeira + "\n");
  }
}