package supermercado;

public class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, int estoque, double taxaImportacao) {
        super(nome, preco, estoque);
        this.taxaImportacao = taxaImportacao;
    }

    public double calcularPrecoFinal() {
        return getPreco() + (getPreco() * taxaImportacao);
    }

    @Override
    public void vender(int quantidade) {
        System.out.println("Preço final: " + calcularPrecoFinal());
        super.vender(quantidade);
    }
}
