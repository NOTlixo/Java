import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Escola>listaAlunos = new ArrayList<>();

        System.out.println("quantos alunos vc quer cadastrar?");
        int contadordeAlunos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i< contadordeAlunos; i++){


            System.out.println("digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("digite a idade do aluno:");
            int Idade = scanner.nextInt();

            System.out.println("digite a nota dele:");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            Escola aluno = new Escola(nome, nota, Idade);
            listaAlunos.add(aluno);

        }
        for (Escola aluno: listaAlunos){
            aluno.mostrarDados();
        }

        Escola.mostrarAluno();
    }
}