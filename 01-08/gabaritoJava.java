package PBL01;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//início do meu código (TUDO deve ficar aqui dentro)
public class Main {
    // Função que retorna um array estático de inteiros
    // e que recebe como parâmetro o tamanho da lista informado pelo usuário
    public static int[] randomValuesArray(int size) {
        // Declaração de  array estático com valor informado pelo usuário
        int[] values = new int[size];
        //Criando um "gerenciador" de números aleatórios
        Random random = new Random();
        //For i com contador (i) começando em 0,
        // fica em loop enquanto o contador for menor que o tamanho do array
        // incrementa o contador em 1
        for (int i = 0; i < values.length; i++) {
            // Adiciona em cada posição do array, um valor aleatório entre 0 e 20
            values[i] = random.nextInt(21);
        }

        // Retorna a lista preenchida
        return values;
    }

    //Função que retorna uma lista dinâmica de inteiros
    // e que recebe como parâmetro o tamanho da lista informado pelo usuário
    public static ArrayList<Integer> randomValuesList(int size) {
        // Declaração da lista (vazia) que será retornada
        ArrayList<Integer> values = new ArrayList<>();
        // Criação de um objeto que irá gerar números aleatórios
        Random random = new Random();
        // Criação de um loop que percorre a lista e preenche com valores aleatórios
        // Contador (i) começa em 0, o loop acontece até que o contador atinja o tamanho informado pelo usuário
        // E o contador é incrementado de 1 em 1
        for (int i = 0; i < size; i++) {
            // Adição do número aleatório inteiro entre 0 e 20 à lista
            values.add(random.nextInt(21));
        }
        // Retornamos a lista preenchida com os valores aleatórios
        return values;
    }

    // Função padrão do Java onde nosso programa é executado
    public static void main(String[] args) {
        // Criação de um "gerenciador" de inputs, para pegar valores informados pelo usuário
        Scanner scanner = new Scanner(System.in);
        // Impressão de uma mensagem para informar ao usuário que tipo de dado ele deve digitar para o programa
        System.out.println("Digite um tamanho para a lista: ");
        // Armazenamento do valor informado dentro da variável size
        int size = scanner.nextInt();

        // Impressão do cabeçalho RESULTADO
        System.out.println("--------- RESULTADO ---------");
        // loop foreach: Para cada valor dentro da lista que foi retornada pela função randomValueList
        for (var value : randomValuesList(size)) {
            // Se o valor for múltiplo de 3 (resto da divisão do valor por 3 for igual a 0)
            if(value % 3 == 0) {
                // Impressão do valor seguido de uma descrição
                System.out.println(value + " - número múltiplo de três");
            }
            // Se não, se o valor for múltiplo de 2 (resto da divisão do valor por 2 for igual a 0)
            else if (value % 2 == 0) {
                // Impressão do valor seguido de uma descrição
                System.out.println(value + " - número par");
            }
            // Caso não seja nenhum dos casos anteriores
            else {
                // Impressão do valor seguido de uma descrição
                System.out.println(value + " - número ímpar");
            }
        }
    }
}