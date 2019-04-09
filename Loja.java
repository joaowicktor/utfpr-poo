public class Loja {
    // Atributos
    private String nome;
    private String endereco;
    private Produto produto = new Produto();

    // Métodos
    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}