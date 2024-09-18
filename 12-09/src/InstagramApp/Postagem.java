package InstagramApp;

import java.util.ArrayList;
import java.util.List;

public class Postagem {
    Usuario autor;
    String conteudo;
    List<Comentario> comentarios;
    List<Curtida> curtidas;

    // Construtor
    public Postagem(Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>();
        this.curtidas = new ArrayList<>();
    }

    // Métodos
    public void adicionarComentario(Comentario c) {
        comentarios.add(c);
    }

    public void adicionarCurtida(Curtida c) {
        curtidas.add(c);
    }

    public String verComentarios() {
        StringBuilder sb = new StringBuilder();
        for (Comentario c : comentarios) {
            sb.append(c.autor.nome).append(": ").append(c.texto).append("\n");
        }
        return sb.toString();
    }

    public int contarCurtidas() {
        return curtidas.size();
    }
}
