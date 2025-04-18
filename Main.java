import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem personagem = null;



        System.out.println("Escolha a sua classe:");
        System.out.println("1- Guerreiro");
        System.out.println("2- Mago");
        System.out.println("3- Arqueiro");

        int Classe = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Qual sera o nome do(a) seu(a) personagem?");
        String Nome = scanner.nextLine();

        switch (Classe) {
            case 1:
                personagem = new Guerreiro(Nome);
                break;

            case 2:
                personagem = new Mago(Nome);
                break;

            case 3:
                personagem = new Arqueiro(Nome);
                break;

            default:
                System.out.println("Classe inexistente. Fechando jogo");
                return;
        }
        System.out.println("------------------------------------");
        System.out.println("Classe: " + personagem.getClass().getSimpleName());
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Nivel: " + personagem.getNivel());
        System.out.println("Vida: " + personagem.getVida());
        System.out.println("------------------------------------");

        System.out.println("O que Você quer fazer?");
        System.out.println("1- Atacar");
        System.out.println("2- Defender");
        System.out.println("3- curar");

        int Atacar = scanner.nextInt();
        double danoInimigo = 10;
    switch (Atacar){
        case 1:
            personagem.Atacar();
            break;

        case 2:
            personagem.Defender();
            personagem.levarDano(danoInimigo/2);
            break;

        case 3:
            personagem.Curar();
            break;
        default:
            System.out.println("Ficou moscando");
            personagem.levarDano(danoInimigo);
         }
    }
}