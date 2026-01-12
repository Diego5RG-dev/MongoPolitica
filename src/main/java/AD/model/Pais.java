package AD.model;

import java.lang.reflect.Array;
import java.util.List;

public class Pais {
    private String nome;
    private String organizacion;
    private List<String> partidos;
    private int id_presidente;

    public Pais() {
    }

    public Pais(String nome, String organizacion, List<String> partidos, int id_presidente) {
        this.nome = nome;
        this.organizacion = organizacion;
        this.partidos = partidos;
        this.id_presidente = id_presidente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public List<String> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<String> partidos) {
        this.partidos = partidos;
    }

    public int getId_presidente() {
        return id_presidente;
    }

    public void setId_presidente(int id_presidente) {
        this.id_presidente = id_presidente;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", organizacion='" + organizacion + '\'' +
                ", partidos=" + partidos +
                ", id_presidente=" + id_presidente +
                '}';
    }
}
