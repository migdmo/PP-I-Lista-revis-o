package SistemaCinema;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; //agregação
    private ArrayList<Ingresso> ingressos; //composição

    public Sessao(int id, LocalDateTime horario, int sala, Filme filme) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.filme = filme;
        this.ingressos = new ArrayList<Ingresso>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void venderIgresso(int id, String assento, String tipo, float preco){
        this.ingressos.add(new Ingresso(id, assento, tipo, preco));
    }

    @Override
    public String toString() {
        return "\n Sessao{" +
                "id=" + id +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}
