package Olimpiadas.src;

public class Atletas {
    //Características do objeto - Sempre vem por primeiro
    public String nome;
    public int idade;
    public String modalidade;
    public String pais;
    public boolean ouro = false;
    public boolean prata = false;
    public boolean bronze = false;

    //Construtor da classe (objeto)
    public Atletas() {
        nome = null;
        idade = 0;
        modalidade = null;
        pais = null;
    }

    public Atletas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.modalidade = null;
        this.pais = null;
    }

    public Atletas(String nome, int idade, String modalidade, String pais) {
        this.nome = nome;
        this.idade = idade;
        this.modalidade = modalidade;
        this.pais = pais;
    }

    //Comportamentos do objeto - Sempre vem depois dos atributos
    public void ganharOuro() {
        ouro = true;
        System.out.println("Parabéns " + nome + " pela medalha de ouro!");
    }

    public void ganharPrata() {
        prata = true;
        System.out.println("Parabéns " + nome + " pela medalha de prata!");
    }

    public void ganharBronze() {
        bronze = true;
        System.out.println("Parabéns " + nome + " pela medalha de bronze!");
    }

    public void competir() {
        System.out.println(nome + " está competindo na modalidade de " + modalidade);
    }

    public void exibirMedalhas() {
        if(ouro) {
            System.out.println("Ouro");
        }
        if(prata) {
            System.out.println("Prata");
        }
        if(bronze) {
            System.out.println("Bronze");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("País: " + pais);
    }

    public void exibirTudo() {
        exibirInformacoes();
        exibirMedalhas();
    }
}