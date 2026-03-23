package SistemaSuperMercado;

public class TestaMercado {
    static void main(String[] args){
        Cliente cl1 = new Cliente(1, "Miguel");
        Produto p1 = new Produto(1, "tv", 2000);
        Produto p2 = new Produto(2, "NoteBook", 4000);

        Venda v1 = new Venda(cl1);
        v1.criaItemVenda(1, 2, p1);
        v1.criaItemVenda(2, 1, p2);

        System.out.println(v1.toString());


    }
}
