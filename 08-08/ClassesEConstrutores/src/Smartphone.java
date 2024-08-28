public class Smartphone {
    //Características do objeto - Sempre vem por primeiro
    public float polegadas;
    public String marca;
    public String modelo;
    public String entradaCarregador;
    public String cor;
    public int numeroCameras;
    public boolean ligado = false;
    public int volume = 5;

    //Construtor da classe (objeto)
    public Smartphone() {
        polegadas = 0f;
        marca = null;
        modelo = null;
        entradaCarregador = null;
        cor = null;
        numeroCameras = 0;
    }

    public Smartphone(String marca, String modelo) {
        this.polegadas = 0f;
        this.marca = marca;
        this.modelo = modelo;
        this.entradaCarregador = null;
        this.cor = null;
        this.numeroCameras = 0;
    }

    public Smartphone(float polegadas, String marca, String modelo,
                      String entradaCarregador, String cor, int numeroCameras) {
        //atributo = parâmetro de entrada
        //this faz referência para a própria classe (Smartphone)
        this.polegadas = polegadas;
        this.marca = marca;
        this.modelo = modelo;
        this.entradaCarregador = entradaCarregador;
        this.cor = cor;
        this.numeroCameras = numeroCameras;
    }

    //Comportamentos do objeto - Sempre vem depois dos atributos
    public void ligar() {
        ligado = true;
        System.out.println(marca + " " + modelo + ": " + "Bem vindo!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Até Logo!");
    }

    public void tirarFoto() {
        if(ligado) {
            System.out.println("XIIIS! Click!");
        }
    }

    public void aumentarVolume() {
        if(ligado) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if(ligado) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }
}
