package supermercado;

public class Supermercado {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 25.50, 20);
        Perecivel leite = new Perecivel("Leite", 5.00, 10, "10/05/2026");
        ProdutoImportado vinho = new ProdutoImportado("Vinho", 50.00, 5, 0.2);

        Venda venda = new Venda();

        venda.processar(arroz, 2);
        venda.processar(leite, 3);
        venda.processar(vinho, 1);
    }
}
