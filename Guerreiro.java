public class Guerreiro extends  Personagem{
    public Guerreiro (String nome){
        super(nome, 1, 100);
    }

    @Override
    public void Atacar(){
        System.out.println(getNome()+ " Atacou com sua espada!");
    }

    @Override
    public void Defender() {
        System.out.println(getNome() + " Levantou seu escudo e defendeu!");

    }

    @Override
    public void Curar (){
        if (getVida()<100) {
            System.out.println(getNome() + " Bebeu uma poção amarela");
        }else {
            System.out.println("Vida Cheia!");
        }
    }
}
