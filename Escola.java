public class Escola{
   private String nome;
   private int Idade;
   private double nota;
   private static int contador = 0;

    public Escola (String nome,double nota, int Idade) {
        this.nome = nome;
        this.nota = nota;
        this.Idade = Idade;
        contador++;
    }
        public void mostrarDados(){
        System.out.println("------------------------------");
        System.out.println("Nome: " +nome);
        System.out.println("idade: "+Idade);
        System.out.println("Nota: " +nota);
        if (nota > 6 ) {
            System.out.println("Situação: Aprovado ✅");
        }else{
            System.out.println("Situação: Reprovado ❌");
        }
        System.out.println("-------------------------------------");
        System.out.println();
    }
    public static void mostrarAluno(){
        System.out.println( "Total de Alunos:" +contador);
    }
}

