package SistemaSuperMercado;

public class itemVenda {
    private int id, qtd;
    private Produto produto;

    public itemVenda() {
    }

    public itemVenda(int id, int qtd, Produto produto) {
        this.id = id;
        this.qtd = qtd;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n itemVenda{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", produto=" + produto +
                '}';
    }
}
