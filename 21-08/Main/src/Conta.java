import java.util.ArrayList;

public class Conta {
    private ArrayList<Cliente> clientes;

    public Conta() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getCpf()) == null) {  // Correção na verificação do CPF
            clientes.add(cliente);
            System.out.println("Cliente adicionado ao banco com sucesso!");
        } else {
            System.out.println("Cliente com CPF " + cliente.getCpf() + " já existe.");
        }
    }

    public Cliente buscarCliente(String cpf) {  // Alteração do tipo do parâmetro para String
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {  // Comparação de Strings usando equals
                return cliente;
            }
        }

        return null;
    }
}
