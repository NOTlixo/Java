public class Triangulo extends Forma{
    private double base, altura;
    private double area;
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return area = (base* altura) / 2;
    }
}
