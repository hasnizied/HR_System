public class Commercial extends  Employee {

    private double chiffreAffaire;


    public String getTitre() {
        return "Commercial";
    }


    public   void detailsCalculSal() {

    }

    public   double calculerSalaire() {
        return 0;
    }


    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    Commercial () {

    }



    Commercial (int chiffreAffaire) {
        super();
        this.chiffreAffaire = 0;
    }
}
