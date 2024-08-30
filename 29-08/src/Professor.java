public class Professor {
    private String nome;
    private String cpf;

    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos relacionados ao professor
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
