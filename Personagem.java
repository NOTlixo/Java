public abstract class Personagem {
    private String Classe;
    private String Nome;
    private int Nivel;
    private double Vida;

    public Personagem( String nome, int nivel, double vida){
        this.Nome = nome;
        this.Nivel = nivel;
        this.Vida = vida;
    }


    protected abstract void Atacar();

    protected abstract void Defender();

    protected abstract void Curar();

    protected void levarDano(double dano){
        Vida -= dano;
        System.out.println(Nome+" levou "+dano+" de dano!");
        System.out.println("Vida: " +Vida);
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
