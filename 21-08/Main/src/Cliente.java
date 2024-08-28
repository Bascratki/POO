public class Cliente {
    private String nome;
    private String cpf;
    private double saldo;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private String email;
    private String senha;
    private String agencia;
    private String conta;
    private String tipoConta;

    // Construtor com todos os parâmetros
    public Cliente(String nome, String cpf, double saldo, String dataNascimento, String endereco, String telefone, String email, String senha, String agencia, String conta, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.agencia = agencia;
        this.conta = conta;
        this.tipoConta = tipoConta;
    }

    // Construtor com os parâmetros básicos
    public Cliente(String nome, String cpf, double saldo) {
        this(nome, cpf, 0, "", "", "", "", "", "", "", "");
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    // Exibir todos os dados do cliente
    public void exibirTudo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Email: " + this.email);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.conta);
        System.out.println("Tipo de Conta: " + this.tipoConta);
    }

    // Depositar dinheiro na conta
    public void depositar(double valor) {
        this.saldo += valor;
    }

    // Sacar dinheiro da conta
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Transferir dinheiro para outra conta
    public void transferir(Cliente destinatario, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destinatario.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Verificar se a senha está correta
    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
