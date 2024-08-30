public class Menu {
    public static void matricularAluno() {
        // Lógica para matricular aluno
        System.out.print("Nome: ");
        String nome = Main.scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = Main.scanner.nextLine();

        // Lógica para gerar matrícula
        String matricula = "2021" + Main.alunos.size();

        Main.alunos.add(new Aluno(nome, cpf, matricula));

        System.out.println("Aluno matriculado com sucesso!");
    }

    public static void mostrarDisciplinas() {
        // Lógica para mostrar disciplinas
    }

    public static void listarAlunosDisciplina() {
        // Lógica para listar alunos de uma disciplina
    }

    public static void mostrarAlunos() {
        // Lógica para mostrar alunos
        for (Aluno aluno : Main.alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println();
        }
    }

    public static void pesquisarAluno() {
        // Lógica para pesquisar aluno por nome, CPF ou matrícula
    }

    public static void alterarDadosCadastrais() {
        // Lógica para alterar dados cadastrais do aluno
    }

    public static void desmatricularAluno() {
        // Lógica para desmatricular aluno
    }
}
