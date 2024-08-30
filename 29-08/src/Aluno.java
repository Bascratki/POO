public class Aluno {
    private String nome;
    private String cpf;
    private String matricula;

    public Aluno(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    // Métodos para alterar dados, etc.
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
