import java.util.ArrayList;

public class Pedido {

    private cliente c;
    private Tipo_pagamento tipo;
    private ArrayList<Item> itens;
    private double total;

    public Pedido(cliente c) {
        this.c = c;
        this.itens = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarItem(produto produto, int quantidade) {

        if (quantidade <= 0) {
            System.out.println("Quantidade invalida.");
            return;
        }

        if (quantidade > produto.getQuantidadeEstoque()) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        Item item = new Item(produto, quantidade);
        itens.add(item);

        total = total + (produto.getPreco() * quantidade);

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public cliente getCliente() {
        return c;
    }

    public void setTipo(Tipo_pagamento tipo) {
        this.tipo = tipo;
    }

    public Tipo_pagamento getTipo() {
        return tipo;
    }
}