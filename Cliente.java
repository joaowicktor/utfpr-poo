public final class Cliente {
  private String nome;
  private String cpf;
  private int idade;

  public Cliente() {
    this.setNome("");
    this.setCpf("");
    this.setIdade(0);
  }

  public Cliente(String nome, String cpf, int idade) {
    this.setNome(nome);
    this.setCpf(cpf);
    this.setIdade(idade);
  }

  public String getNome() {
    return this.nome;
  }

  public String getCpf() {
    return this.cpf;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}