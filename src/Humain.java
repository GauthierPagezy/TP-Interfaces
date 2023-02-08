abstract class Humain implements Mortel {

    protected String nom;

    public Humain(String nom){this.nom = nom;}

    public void setNom(String nom){}

    public String getNom(){return this.nom;}

    @Override
    public void meurt() {
    System.out.println("L'objet meurt");
    }


}
