import java.util.Scanner;

public class Menu {
    private Conta banco;
    private Scanner scanner;

    public Menu(Conta banco) {
        this.banco = banco;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuLogin() {
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        scanner.nextLine(); // Consumir a nova linha após a entrada do número

        Cliente cliente = banco.buscarCliente(cpf);

        if (cliente != null) {
            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();

            if (cliente.verificarSenha(senha)) {
                System.out.println("Login efetuado com sucesso!");

                int opcao;

                do {
                    System.out.println("1️⃣  -  💵 Depositar");
                    System.out.println("2️⃣  -  🏧 Sacar");
                    System.out.println("3️⃣  -  🔄 Transferir");
                    System.out.println("4️⃣  -  💰 Exibir saldo");
                    System.out.println("5️⃣  -  📝 Exibir dados");
                    System.out.println("6️⃣  -  🚪 Sair");
                    System.out.print("🌟 Escolha uma opção: ");


                    while (!scanner.hasNextInt()) {
                        System.out.println("Por favor, digite um número válido.");
                        scanner.next();
                    }

                    opcao = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após a entrada do número

                    switch (opcao) {
                        case 1:
                            System.out.println("Digite o valor a ser depositado: ");
                            double valorDeposito = scanner.nextDouble();
                            scanner.nextLine(); // Consumir a nova linha após a entrada do número
                            cliente.depositar(valorDeposito);
                            System.out.println("Depósito efetuado com sucesso!");
                            break;
                        case 2:
                            System.out.println("Digite o valor a ser sacado: ");
                            double valorSaque = scanner.nextDouble();
                            scanner.nextLine(); // Consumir a nova linha após a entrada do número
                            cliente.sacar(valorSaque);
                            break;
                        case 3:
                            System.out.println("Digite o CPF do destinatário: ");
                            String cpfDestinatario = scanner.nextLine(); // Correção: Use nextLine() para capturar a entrada do CPF como String
                            Cliente destinatario = banco.buscarCliente(cpfDestinatario);


                            if (destinatario != null) {
                                System.out.println("Digite o valor a ser transferido: ");
                                double valorTransferencia = scanner.nextDouble();
                                scanner.nextLine(); // Consumir a nova linha após a entrada do número
                                cliente.transferir(destinatario, valorTransferencia);
                                System.out.println("Transferência efetuada com sucesso!");
                            } else {
                                System.out.println("Destinatário não encontrado.");
                            }
                            break;
                        case 4:
                            System.out.println("Saldo: " + cliente.getSaldo());
                            break;
                        case 5:
                            cliente.exibirTudo();
                            break;
                        case 6:
                            System.out.println("Saindo...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } while (opcao != 6);
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void exibirMenuCadastro() {
        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();
        scanner.nextLine(); // Consumir a nova linha após a entrada do número
        System.out.println("Digite a data de nascimento: ");
        String dataNascimento = scanner.nextLine();
        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite o email: ");
        String email = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite a conta: ");
        String conta = scanner.nextLine();
        System.out.println("Digite o tipo de conta: ");
        String tipoConta = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, 0, dataNascimento, endereco, telefone, email, senha, agencia, conta, tipoConta);
        banco.adicionarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}
