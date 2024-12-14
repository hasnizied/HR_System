public class Vendeur {
  private int BONUS_VENDEUR ;
  private double PERCENT_VENDEUR ;
  public Vendeur() {}
    public Vendeur(int BONUS_VENDEUR, double PERCENT_VENDEUR) {
      super();
      this.BONUS_VENDEUR = BONUS_VENDEUR;
      this.PERCENT_VENDEUR = PERCENT_VENDEUR;
    }

    public int getBONUS_VENDEUR() {
        return BONUS_VENDEUR;
    }

    public void setBONUS_VENDEUR(int BONUS_VENDEUR) {
        this.BONUS_VENDEUR = BONUS_VENDEUR;
    }

    public double getPERCENT_VENDEUR() {
        return PERCENT_VENDEUR;
    }

    public void setPERCENT_VENDEUR(double PERCENT_VENDEUR) {
        this.PERCENT_VENDEUR = PERCENT_VENDEUR;
    }

    public String getTitre() {
        return "Vendeur";
    }

    public   void detailsCalculSal() {

    }

    public   double calculerSalaire() {
        return 0;
    }
}
