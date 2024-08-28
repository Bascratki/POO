import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VerificaLista {

    // Método para criar uma lista de números aleatórios
    public static List<Integer> criarLista(int tamanho) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt(101) + 1);
        }

        return lista;
    }

    // Método para verificar múltiplos de 3, números pares e ímpares
    public static void verificaNumero(List<Integer> lista) {
        List<Integer> multiplos_3 = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int num : lista) {
            if (num % 3 == 0) {
                multiplos_3.add(num);
            }
            if (num % 2 == 0) {
                pares.add(num);
            }
            if (num % 2 != 0) {
                impares.add(num);
            }
        }

        System.out.println("Múltiplos de 3: " + multiplos_3);
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da lista: ");
        int tamanho = scanner.nextInt();

        List<Integer> lista = criarLista(tamanho);
        System.out.println("Lista: " + lista);

        verificaNumero(lista);
    }
}
