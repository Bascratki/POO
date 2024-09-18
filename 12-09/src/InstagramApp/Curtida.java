package InstagramApp;

public class Curtida {
    Usuario autor;

    // Construtor
    public Curtida(Usuario autor) {
        this.autor = autor;
    }

    public void exibirCurtida() {
        System.out.println(autor.nome + " curtiu.");
    }
}
