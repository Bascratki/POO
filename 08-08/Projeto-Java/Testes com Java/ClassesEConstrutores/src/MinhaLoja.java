package ClassesEConstrutores.src;

import java.util.Scanner;

public class MinhaLoja {
    public static void main(String[] args) {
        //Criar o objeto no sistema (instanciar)
        //Computador guarda o objeto na memória (alocação na memória)
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da tela: ");
        float p = sc.nextFloat();

        Smartphone celular1 = new Smartphone(p, "Samsung", "Galaxy", "USB-C", "Preto", 2);
        //Inicializando os atributos do objeto
//        celular1.polegadas = 3f;
//        celular1.marca = "Samsung";
//        celular1.modelo = "Galaxy";
//        celular1.entradaCarregador = "UBS-C";
//        celular1.cor = "Branco";
//        celular1.numeroCameras = 3;
        //Chamando os métodos do celular (montando história)
        celular1.ligar();
        celular1.tirarFoto();
        celular1.desligar();
        //Lendo os valores dos atributos e imprimindo
        System.out.println(celular1.marca + " " + celular1.modelo);
        //Criei o segundo objeto no sistema
        Smartphone celular2 = new Smartphone("Motorola", "Moto G");
        System.out.println(celular2);
        celular2.marca = "Apple";
        celular2.modelo = "iPhone";

        celular2.ligar();
        celular2.aumentarVolume();
        celular2.aumentarVolume();
        celular2.diminuirVolume();
        celular2.desligar();
        System.out.println(celular2.marca + " " + celular2.modelo);
    }
}
