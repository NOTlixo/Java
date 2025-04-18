public class Circulo extends Forma{
    private double raio,area;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return area = Math.PI *raio * raio;
    }
}
