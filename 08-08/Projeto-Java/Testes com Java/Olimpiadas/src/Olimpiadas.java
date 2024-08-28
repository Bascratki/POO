package Olimpiadas.src;

import java.util.Scanner;

public class Olimpiadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando as informações do atleta
        System.out.println("Digite o nome do atleta: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do atleta: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Digite a modalidade do atleta: ");
        String modalidade = scanner.nextLine();

        System.out.println("Digite o país do atleta: ");
        String pais = scanner.nextLine();

        // Criando o objeto atleta com os dados fornecidos
        Atletas atleta = new Atletas(nome, idade, modalidade, pais);

        // Exibindo informações e simulando uma competição
        atleta.exibirInformacoes();
        atleta.competir();

        // Simulação de conquistas de medalhas
        atleta.ganharOuro();
        atleta.ganharPrata();
        atleta.ganharBronze();

        // Exibir todas as informações do atleta e suas medalhas
        atleta.exibirTudo();

        scanner.close();
    }
}