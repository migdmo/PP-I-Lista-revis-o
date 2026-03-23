package SistemaBiblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {
    static void main(String[] args){
        Leitor l1 = new Leitor(1, "Miguel");
        Livro lv1 = new Livro(1235, "A Dance of Dragons", "GrrMartin");


        LocalDateTime dataEmprestimo = LocalDateTime.of(2026,1, 2, 8, 15);
        LocalDateTime dataDevolucaoPrevista = LocalDateTime.of(2026, 2, 2, 8, 15);


        Emprestimo emp1 = new Emprestimo(dataEmprestimo, dataDevolucaoPrevista, lv1, l1);

        System.out.println(emp1.toString());

    }
}
