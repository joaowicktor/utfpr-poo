public class Violao {
  // Atributos
  // Todos definidos como privados para somente serem acessados pela própria classe (encapsulamento)
  private String afinacao;
  private String cor;
  private String madeira;

  // Métodos
  public String getAfinacao() {
     return this.afinacao;
  }
    
  public String getCor() {
    return this.cor;
  }
    
  public String getMadeira() {
    return this.madeira;
  }
    
  public void setAfinacao(String afinacao) {
    this.afinacao = afinacao;
  }

  public void setCor(String cor) {
    this.cor = cor;    
  }

  public void setMadeira(String madeira) {
    this.madeira = madeira;
  }
}