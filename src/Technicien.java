public class Technicien {
    private double  FACTEUR_UNITE ;
    private int unites;

    public double getFACTEUR_UNITE() {
        return FACTEUR_UNITE;
    }

    public void setFACTEUR_UNITE(double FACTEUR_UNITE) {
        this.FACTEUR_UNITE = FACTEUR_UNITE;
    }

    public int getUnites() {
        return unites;
    }

    public void setUnites(int unites) {
        this.unites = unites;
    }

    public Technicien()
    {

    }

    public Technicien(double FACTEUR_UNITE,int unites)
    {
        super();
        this.FACTEUR_UNITE = FACTEUR_UNITE;
        this.unites = unites;
    }

    public String getTitre() {
        return "Technicien";
    }

    public   void detailsCalculSal() {

    }

    public   double calculerSalaire() {
        return 0;
    }


}
