package AD.model;

public class Presidente {
    private String nome;
    private  int idade;
    private String partido;

    public Presidente(String nome, int idade, String partido) {
        this.nome = nome;
        this.idade = idade;
        this.partido = partido;
    }

    public Presidente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Presidente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", partido='" + partido + '\'' +
                '}';
    }
}
