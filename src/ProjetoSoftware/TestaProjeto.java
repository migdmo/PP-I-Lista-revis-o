package ProjetoSoftware;

import java.util.ArrayList;

public class TestaProjeto {
    static void main(String[] args){
        ArrayList<Programador> programadores = new ArrayList<>();
        Programador p1 = new Programador(1, "Isa", "Java");
        programadores.add(p1);
        Programador p2 = new Programador(2, "Miguel", "Java");
        programadores.add(p2);

        Projeto pj1 = new Projeto(1, "TIC", programadores);

        System.out.println(pj1.listaTimeDeProgramadores());

    }
}
