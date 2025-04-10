import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha a sua classe:");
        System.out.println("1- Guerreiro");
        System.out.println("2- Mago");
        System.out.println("3- Arqueiro");
        int Classe = scanner.nextInt();
        switch (Classe) {
            case 1:
                guerreiro.setClasse("Guerreiro");
                System.out.println("Você escolheu Guerreiro");
                break;

            case 2:
                guerreiro.setClasse("Mago");
                System.out.println("Você escolheu Mago");
                break;

            case 3:
                guerreiro.setClasse("Arqueiro");
                System.out.println("Você escolheu Arqueiro");
                break;

            default:
                guerreiro.setClasse("Aventureiro");
                System.out.println("Sua classe é: Aventureiro. Boa sorte");
        }

        scanner.nextLine();
        System.out.println("Qual sera o nome do(a) seu(a) personagem?");
        String Nome = scanner.nextLine();
        guerreiro.setNome(Nome);

        System.out.println("E qual será o nivel dele(a)?");
        int Nivel = scanner.nextInt();
        scanner.nextLine();
        guerreiro.setNivel(Nivel);

        System.out.println("E quanto de vida ele(a) tera?");
        double Vida = scanner.nextDouble();
        scanner.nextLine();
        guerreiro.setVida(Vida);

        System.out.println("------------------------------------");
        System.out.println("Classe: " + guerreiro.getClasse());
        System.out.println("Nome: " + guerreiro.getNome());
        System.out.println("Nivel: " + guerreiro.getNivel());
        System.out.println("Vida: " + guerreiro.getVida());
        System.out.println("------------------------------------");

        System.out.println("O que Você quer fazer?");
        System.out.println("1- Atacar");
        System.out.println("2- Defender");
        System.out.println("3- curar");
        int Atacar = scanner.nextInt();
        double danoInimigo = 10;
        int cura = 10;
    switch (Atacar){
        case 1:
            guerreiro.Atacar();
            break;

        case 2:
            guerreiro.Defender();
            guerreiro.levarDano(danoInimigo/2);
            break;

        case 3:
            guerreiro.Curar();
            break;
        default:
            System.out.println("Ficou moscando");
            guerreiro.levarDano(danoInimigo);
    }
    }
}