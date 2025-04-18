public class Arqueiro extends Personagem{
    public Arqueiro (String nome){
        super( nome,1,100);
    }

    @Override
    public void Atacar(){
        System.out.println(getNome()+ " Esticou seu arco com destreza e atacou o inimigo!");
    }

    @Override
    public void Defender() {
        System.out.println(getNome() + " Elevou sua postura e defendeu o ataque");

    }

    @Override
    public void Curar () {
        if (getVida()<100) {
            System.out.println(getNome() + " Bebeu uma poção amarela");
        }else {
            System.out.println("Vida Cheia!");
        }
    }
}
