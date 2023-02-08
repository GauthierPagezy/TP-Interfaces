public class Etudiant extends Humain {

    private double note;

    public Etudiant(String nom, double note) {
        super(nom);
        this.note = note;
    }

    public double getNote() {return this.note;}
    public void setNote(double note) {this.note = note;}


}
