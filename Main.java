public class Main {
    public static void main(String[] args) {
        Escola a1 = new Escola("felipe",8.8);
        Escola a2 = new Escola("Ana",5);
        Escola a3 = new Escola("Nina",10);

        a1.mostrarDados();
        a2.mostrarDados();
        a3.mostrarDados();

        Escola.mostrarAluno();
    }
}