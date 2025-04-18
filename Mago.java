public class Mago extends Personagem{
    public Mago( String nome){
        super(nome, 1,100);
    }
    @Override
    public void Atacar(){
        System.out.println(getNome()+" Lançou uma magia!");
    }

    @Override
    public void Defender(){
        System.out.println(getNome() + " Conjurou uma barreira protetora!");

    }

    @Override
    public void Curar (){
        if (getVida()<100) {
           System.out.println(getNome() + " Balançou o cajado e se curou");
       }else {
           System.out.println("Vida Cheia!");
       }
    }
}
