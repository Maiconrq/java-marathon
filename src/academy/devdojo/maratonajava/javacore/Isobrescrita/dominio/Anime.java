package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override // Sobrescrita do método toString() da classe Object
    public String toString(){
        return "\n" + "Anime" + " nome '" + this.nome + '\'';
    }
}
