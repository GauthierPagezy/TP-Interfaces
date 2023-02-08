

public abstract class Professeur extends Humain {
    private double salaire;

    public Professeur(){
        super("Indéfini");
        this.salaire = 0;
    }
    public Professeur(String nom){super(nom);}
    public Professeur(String nom, double salaire) {
        super(nom);
        this.salaire = salaire;
    }
    public double getSalaire(){return this.salaire;}
    public void setSalaire(double salaire){this.salaire=salaire;}
    @Override
    public void setNom(String nom){this.nom = nom;}

}
