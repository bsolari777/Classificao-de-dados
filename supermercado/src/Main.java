import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int escolha = -1;
        Pedido pedidoAtual = null;

        produto[] produtos = {
                new produto(descricao.ARROZ, 25.00, 10),
                new produto(descricao.FEIJAO, 10.00, 20),
                new produto(descricao.FARINHA, 8.00, 15),
                new produto(descricao.LEITE, 6.00, 30)
        };

        while (escolha != 0) {

            System.out.println("\n1 - Novo pedido");
            System.out.println("2 - Realizar pagamento");
            System.out.println("0 - Sair");
            escolha = entrada.nextInt();

            switch (escolha) {

                case 1:

                    entrada.nextLine();

                    System.out.print("Digite seu nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Digite seu CPF: ");
                    String cpf = entrada.nextLine();

                    cliente c = new cliente(nome, cpf);
                    pedidoAtual = new Pedido(c);

                    int opcaoProduto = -1;

                    while (opcaoProduto != 0) {

                        System.out.println("\n1 - ARROZ - R$ " + produtos[0].getPreco() + " QUANTIDADE: " +produtos[0].getQuantidadeEstoque());
                        System.out.println("2 - FEIJAO - R$ " + produtos[1].getPreco() + " QUANTIDADE: " +produtos[1].getQuantidadeEstoque());
                        System.out.println("3 - FARINHA - R$ " + produtos[2].getPreco() + " QUANTIDADE: " +produtos[2].getQuantidadeEstoque());
                        System.out.println("4 - LEITE - R$ " + produtos[3].getPreco() + " QUANTIDADE: " + produtos[3].getQuantidadeEstoque());
                        System.out.println("0 - Finalizar pedido");

                        opcaoProduto = entrada.nextInt();

                        if (opcaoProduto >= 1 && opcaoProduto <= 4) {
                            System.out.print("Digite a quantidade: ");
                            int quantidade = entrada.nextInt();

                            pedidoAtual.adicionarItem(produtos[opcaoProduto - 1], quantidade);
                        }
                    }

                    System.out.println("Pedido finalizado.");
                    break;


                case 2:

                    if (pedidoAtual == null) {
                        System.out.println("Nenhum pedido foi criado.");
                        break;
                    }

                    System.out.println("\nCliente: " + pedidoAtual.getCliente().getNome());
                    System.out.println("Produtos comprados:");

                    for (int i = 0; i < pedidoAtual.getItens().size(); i++) {
                        Item item = pedidoAtual.getItens().get(i);
                        System.out.println(item.getProduto().getDescricao() + " - Quantidade: " + item.getQuantidade());
                    }

                    System.out.println("Total: R$ " + pedidoAtual.getTotal());

                    System.out.println("\n1 - DINHEIRO");
                    System.out.println("2 - CHEQUE");
                    System.out.println("3 - CARTAO");
                    System.out.println("4 - PIX");

                    System.out.print("Forma de pagamento: ");
                    int pagamento = entrada.nextInt();

                    if (pagamento >= 1 && pagamento <= 4) {
                        Tipo_pagamento tipo = Tipo_pagamento.values()[pagamento - 1];
                        pedidoAtual.setTipo(tipo);

                        System.out.println("Pagamento escolhido: " + pedidoAtual.getTipo());
                        System.out.println("Pagamento realizado.");
                    } else {
                        System.out.println("Forma de pagamento invalida.");
                    }

                    break;


                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }
        }

        entrada.close();
    }
}