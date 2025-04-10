public class Personagem {
    private String Classe;
    private String Nome;
    private int Nivel;
    private double Vida;


    public void Atacar(){
        if(Classe.equals("Guerreiro")){
            System.out.println(Nome + " Atacou com sua enorme espada!");
        }else if (Classe.equals("Mago")){
            System.out.println(Nome+ " Lançou uma magia!");
        }else if (Classe.equals("Arqueiro")) {
            System.out.println(Nome+ " Disparou uma flecha!");
        } else {
            System.out.println(Nome+ " Só ficou olhando o baiano");
        }
    }

    public void Defender() {
        if (Classe.equals("Guerreiro")) {
            System.out.println(Nome + " Levantou o seu escudo para se defender!");
        } else if (Classe.equals("Mago")) {
            System.out.println(Nome+" Conjurou uma barreira de proteção!");
        } else if (Classe.equals("Arqueiro")) {
            System.out.println(Nome+" Levantou sua guarda!");
        }else {
            System.out.println("ficou moscando");
        }
    }

    public void levarDano(double dano){
        Vida -= dano;
        System.out.println(Nome+" levou "+dano+" de dano!");
        System.out.println("Vida: " +Vida);
    }

    public void Curar(){
        int cura = 10;
        if (Vida >=100){
            System.out.println("vida cheia");
        }else {
            Vida += cura;
            if (Vida > 100){
                Vida = 100;
            }
            System.out.println(Nome+" curou " +cura+ " de vida");
            System.out.println("Vida: " +Vida);
        }
    }

    public void setClasse(String Classe){
        this.Classe = Classe;

    }

    public void setNome(String Nome){

        this.Nome = Nome;
    }

    public void setNivel(int Nivel){

        this.Nivel = Nivel;
    }

    public void setVida(double Vida){

        this.Vida = Vida;
    }

    public String getClasse(){
        return Classe;
    }

    public String getNome(){
        return Nome;
    }

    public int getNivel(){
        return Nivel;
    }

    public  double getVida(){
        return Vida;
    }
}
