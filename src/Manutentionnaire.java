public class Manutentionnaire extends  Employee {
    private double SALAIRE_HORAIRE;
    private int heure ;

    Manutentionnaire () {

    }


    Manutentionnaire (double SALAIRE_HORAIRE,int heure) {
        super();
        this.SALAIRE_HORAIRE =SALAIRE_HORAIRE;
        this.heure = heure;
    }



    public String getTitre() {
        return "Manutentionnaire";
    }

    public   void detailsCalculSal() {

    }

    public   double calculerSalaire() {
        return 0;
    }



    public double getSALAIRE_HORAIRE() {
        return SALAIRE_HORAIRE;
    }

    public void setSALAIRE_HORAIRE(double SALAIRE_HORAIRE) {
        this.SALAIRE_HORAIRE = SALAIRE_HORAIRE;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }
}
