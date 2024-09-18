package InstagramApp;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    String email;
    List<Postagem> postagens;
    List<Postagem> postagensCurtidas;

    // Construtor
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.postagens = new ArrayList<>();
        this.postagensCurtidas = new ArrayList<>();
    }

    // Métodos
    public void criarPostagem(Postagem p) {
        postagens.add(p);
        System.out.println("Postagem criada!");
    }

    public void curtirPostagem(Postagem p) {
        Curtida curtida = new Curtida(this);
        p.adicionarCurtida(curtida);
        postagensCurtidas.add(p);
        System.out.println(nome + " curtiu a postagem.");
    }

    public void comentarPostagem(Postagem p, String texto) {
        Comentario comentario = new Comentario(this, texto);
        p.adicionarComentario(comentario);
        System.out.println(nome + " comentou: " + texto);
    }

    public void verPostagens() {
        for (Postagem p : postagens) {
            System.out.println("Autor: " + p.autor.nome + " - " + p.conteudo);
            System.out.println("Curtidas: " + p.contarCurtidas());
            System.out.println("Comentários: " + p.verComentarios());
        }
    }
}
