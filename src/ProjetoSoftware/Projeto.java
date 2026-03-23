package ProjetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> timeDeProgramadores;

    public Projeto() {
    }

    public Projeto(int id, String nomeProjeto, ArrayList<Programador> timeDeProgramadores) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.timeDeProgramadores = timeDeProgramadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getTimeDeProgramadores() {
        return timeDeProgramadores;
    }

    public void setTimeDeProgramadores(ArrayList<Programador> timeDeProgramadores) {
        this.timeDeProgramadores = timeDeProgramadores;
    }

    //método para listar o nome de todos os programadores do time
    public ArrayList<String> listaTimeDeProgramadores(){
        ArrayList<String> listaDeNomesProgramadores = new ArrayList<String>();
        for (Programador timeDeProgramadores: this.timeDeProgramadores) {
            listaDeNomesProgramadores.add(timeDeProgramadores.getNome());
        }

        return listaDeNomesProgramadores;

    }

    @Override
    public String toString() {
        return "\n Projeto{" +
                "id=" + id +
                ", nomeProjeto='" + nomeProjeto + '\'' +
                ", timeDeProgramadores=" + timeDeProgramadores +
                '}';
    }
}
