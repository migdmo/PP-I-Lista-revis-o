package ComputadorProcessador;

public class TestaComputador {
    static void main(String[] args){
        Computador c1 = new Computador(1,"Lenovo");

        c1.criarProcessador("intel", "i5","15000hz");

        System.out.println(c1.toString());
    }
}
