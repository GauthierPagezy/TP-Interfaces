public class Agrege extends Titulaire {

    public Agrege(String nom, double salaire, String couleur){
        super(nom, salaire, couleur);
    }
    public Agrege(String nom,  String couleur){
        super(nom, couleur);
    }
    public Agrege(String couleur){
        super(couleur);
    }

    @Override
    public void setCouleurDefaut() {
        this.couleur = "rose";
    }
}
