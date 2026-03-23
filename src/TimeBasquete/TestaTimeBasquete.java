package TimeBasquete;

import java.util.ArrayList;

public class TestaTimeBasquete {

    static void main(String[] args){
        ArrayList<Atleta> atletas = new ArrayList<>();

        Atleta a1 = new Atleta(1, "X", "G");
        atletas.add(a1);

        Atleta a2 = new Atleta(2, "X", "SG");
        atletas.add(a2);

        Atleta a3 = new Atleta(3, "Z", "F");
        atletas.add(a3);

        Atleta a4 = new Atleta(4, "W", "PF");
        atletas.add(a4);

        Atleta a5 = new Atleta(5, "K", "C");
        atletas.add(a5);

        Time time = new Time(1, "Sesi Franca", "Helinho", atletas);

        System.out.println(time.toString());




    }
}
