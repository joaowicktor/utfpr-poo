public class Principal {
  public static void main (String arg[]) {
    Loja loja = new Loja();

    loja.getProduto().setNome("Violao");
    loja.getProduto().setPreco(250.00);
    loja.getProduto().setQuantidade(10);

    System.out.println("\nNome do Produto: " + loja.getProduto().getNome());
    System.out.println("\nPreco do Produto: " + loja.getProduto().getPreco());
    System.out.println("\nQuantidade do Produto: " + loja.getProduto().getQuantidade());
  }
}