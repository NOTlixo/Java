public class Quadrado extends Forma{
    private double lado, area;

  public Quadrado(double lado){
      this.lado = lado;
  }

  @Override
    public double calcularArea(){
      return area = lado*lado;
  }
}
