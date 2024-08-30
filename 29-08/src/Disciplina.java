import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String codigo;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados;

    public Disciplina(String nome, String codigo, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
        this.alunosMatriculados = new ArrayList<>();
    }

    // Métodos para adicionar alunos, listar alunos, etc.
    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public String getNome() {
        return nome;
    }
}
