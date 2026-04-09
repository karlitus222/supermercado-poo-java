package supermercado;

public class Perecivel extends Produto {
    private String dataValidade;

    public Perecivel(String nome, double preco, int estoque, String dataValidade) {
        super(nome, preco, estoque);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public void vender(int quantidade) {
        System.out.println("Produto perecível - verificar validade.");
        super.vender(quantidade);
    }
}
