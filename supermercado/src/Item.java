public class Item {

    private int quantidade;
    private produto produto;

    public Item(produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}