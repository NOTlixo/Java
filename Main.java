public class Main {
    public static void main (String[] args){

        Forma quadrado = new Quadrado(5);
        Forma triangulo = new Triangulo(4,3);
        Forma circulo = new Circulo(4);

        System.out.println("Área do quadrado:" + quadrado.calcularArea());
        System.out.println("Área do triangulo:" + triangulo.calcularArea());
        System.out.println("Área do circulo:" + circulo.calcularArea());


    }
}