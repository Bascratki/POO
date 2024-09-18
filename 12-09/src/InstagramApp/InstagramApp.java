package InstagramApp;

import java.util.Scanner;

public class InstagramApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando usuário e postagens
        Usuario usuario = new Usuario("João", "joao@gmail.com");
        Usuario amigo = new Usuario("Maria", "maria@gmail.com");

        Postagem postagem1 = new Postagem(amigo, "Hoje é um ótimo dia!");
        Postagem postagem2 = new Postagem(amigo, "Café da manhã delicioso!");

        amigo.criarPostagem(postagem1);
        amigo.criarPostagem(postagem2);

        // Menu de opções
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver postagens");
            System.out.println("2. Curtir uma postagem");
            System.out.println("3. Comentar em uma postagem");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    amigo.verPostagens();
                    break;
                case 2:
                    System.out.println("Escolha uma postagem para curtir (1 ou 2): ");
                    int postId = scanner.nextInt();
                    if (postId == 1) {
                        usuario.curtirPostagem(postagem1);
                    } else if (postId == 2) {
                        usuario.curtirPostagem(postagem2);
                    } else {
                        System.out.println("Postagem inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Escolha uma postagem para comentar (1 ou 2): ");
                    postId = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    System.out.println("Escreva seu comentário: ");
                    String comentario = scanner.nextLine();
                    if (postId == 1) {
                        usuario.comentarPostagem(postagem1, comentario);
                    } else if (postId == 2) {
                        usuario.comentarPostagem(postagem2, comentario);
                    } else {
                        System.out.println("Postagem inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
