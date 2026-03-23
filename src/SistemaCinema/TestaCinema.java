package SistemaCinema;

import java.time.LocalDateTime;

public class TestaCinema {
    static void main(String[] args){
        Filme f1 = new Filme(1, "Batman", "Drama", 120);
        Filme f2 = new Filme(2, "Homem Aranha", "Ação", 110);

        LocalDateTime data = LocalDateTime.of(2026, 3, 23, 20, 45);
        Sessao s1 = new Sessao(1, data, 2, f1);

        s1.venderIgresso(1, "L-1", "meia", 24);
        s1.venderIgresso(2, "L-2", "inteira", 40);
        s1.venderIgresso(3, "L-4", "meia", 24);

        System.out.println(s1.toString());

    }
}
