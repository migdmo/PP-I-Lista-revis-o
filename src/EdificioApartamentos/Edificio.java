package EdificioApartamentos;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio() {
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<Apartamento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return apartamentos;
    }

    public void criaApartamento(int numero, int andar){
        this.apartamentos.add(new Apartamento(numero, andar));
    }

    @Override
    public String toString() {
        return "\n Edificio{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", apartamentos=" + apartamentos +
                '}';
    }
}
