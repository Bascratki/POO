import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    static Menu menu = new Menu();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Matricular aluno");
            System.out.println("2. Mostrar disciplinas");
            System.out.println("3. Listar alunos da disciplina");
            System.out.println("4. Mostrar alunos");
            System.out.println("5. Pesquisar aluno");
            System.out.println("6. Alterar dados cadastrais");
            System.out.println("7. Desmatricular aluno");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Menu.matricularAluno();
                    break;
                case 2:
                    Menu.mostrarDisciplinas();
                    break;
                case 3:
                    Menu.listarAlunosDisciplina();
                    break;
                case 4:
                    Menu.mostrarAlunos();
                    break;
                case 5:
                    Menu.pesquisarAluno();
                    break;
                case 6:
                    Menu.alterarDadosCadastrais();
                    break;
                case 7:
                    Menu.desmatricularAluno();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}
