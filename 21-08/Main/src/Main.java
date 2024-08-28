import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta banco = new Conta();  // Instância do banco de clientes
        Cliente cliente = new Cliente("Lucas", "12345678910", 1000.0, "01/01/2000", "Rua A, 123", "1234-5678", "lucas@gmail.com", "123456", "0001", "123456", "Conta Corrente");
        banco.adicionarCliente(cliente);  // Adicionando um cliente de exemplo
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(banco);

        int opcao;

        do {
            System.out.println("1️⃣  -  🔐 Login");
            System.out.println("2️⃣  -  📝 Cadastro");
            System.out.println("3️⃣  -  🚪 Sair");
            System.out.print("🌟 Escolha uma opção: ");


            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();
            }

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a entrada do número

            switch (opcao) {
                case 1:
                    menu.exibirMenuLogin();
                    break;
                case 2:
                    menu.exibirMenuCadastro();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
