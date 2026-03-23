package SistemaClinicaMedica;

import java.time.LocalDateTime;

public class TestaConsultaMedica {
    public static void main(String[] args) {
        Medico m1 = new Medico(1, "Evandro", "Ortopedia");
        Paciente p1 = new Paciente(28, "Miguel", "441.333.038-22");

        LocalDateTime data = LocalDateTime.of(2026, 5, 20, 8, 15);

        Consulta c1 = new Consulta(data, 500, m1, p1);

        System.out.println(c1.toString());
    }
}
