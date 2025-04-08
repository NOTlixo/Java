public class Escola{
   private String nome;
   private double nota;
   private static int contador = 0;

    public Escola (String n,double Nota){
        nome = n;
        nota = Nota;
        contador++;

    }



    public void mostrarDados(){
        System.out.println("Nome: " +nome);
        System.out.println("Nota: " +nota);
        if (nota > 6 ) {
            System.out.println("Situação: Aprovado ✅");
        }else{
            System.out.println("Situação: Reprovado ❌");
        }
        System.out.println();
    }
    public static void mostrarAluno(){
        System.out.println( "Total de Alunos:" +contador);
    }
}

