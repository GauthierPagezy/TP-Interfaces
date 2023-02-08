public abstract class Titulaire extends Professeur {

    public Titulaire(String nom, double salaire, String couleur) {
        super(nom, salaire);
        this.couleur = couleur;
    }

    public Titulaire(String nom, String couleur) {
        super(nom);
        this.couleur = couleur;
    }

    public Titulaire(String couleur){
        super();
        this.couleur = couleur;
    }
    protected String couleur;

    public String getCouleur(){return this.couleur;}

    public void setCouleur(String couleur){this.couleur = couleur;}

    public abstract void setCouleurDefaut();
}
