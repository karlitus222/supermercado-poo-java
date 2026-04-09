package supermercado;

public class Venda {

    public void processar(Produto produto, int quantidade) {
        double total = produto.getPreco() * quantidade;
        System.out.println("Total da venda: R$ " + total);
        produto.vender(quantidade);
    }
}
