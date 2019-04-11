import java.util.ArrayList;

public class Banco {
  private int codigo;
  private String nome;
  private ArrayList<Conta> contas = new ArrayList<>();

  public String getNome() {
    return this.nome;
  }

  public int getCodigo() {
    return this.codigo;
  }

  public ArrayList<Conta> getContas() {
    return this.contas;
  }
  
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setConta(Conta conta) {
    this.contas.add(conta);
  }
}