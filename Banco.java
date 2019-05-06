public class Banco {
  private int codigo;
  private String nome;

  public Banco() {
    this.setCodigo(0);
    this.setNome("");
  }

  public Banco(int cod, String nome) {
    this.setCodigo(cod);
    this.setNome(nome);
  }

  public String getNome() {
    return this.nome;
  }

  public int getCodigo() {
    return this.codigo;
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
}