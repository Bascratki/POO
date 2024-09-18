package InstagramApp;

public class Comentario {
    Usuario autor;
    String texto;

    // Construtor
    public Comentario(Usuario autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public void exibirComentario() {
        System.out.println(autor.nome + ": " + texto);
    }
}
