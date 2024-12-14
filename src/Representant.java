public class Representant {
    private double PERCENT_REPRESENTANT;
    private int BONUS_REPRESENTANT;
    public Representant(double PERCENT_REPRESENTANT, int BONUS_REPRESENTANT) {
        super();
        this.PERCENT_REPRESENTANT = PERCENT_REPRESENTANT;
        this.BONUS_REPRESENTANT = BONUS_REPRESENTANT;
    }


    public Representant( ) {

    }

    public double getPERCENT_REPRESENTANT() {
        return PERCENT_REPRESENTANT;
    }

    public void setPERCENT_REPRESENTANT(double PERCENT_REPRESENTANT) {
        this.PERCENT_REPRESENTANT = PERCENT_REPRESENTANT;
    }

    public int getBONUS_REPRESENTANT() {
        return BONUS_REPRESENTANT;
    }

    public void setBONUS_REPRESENTANT(int BONUS_REPRESENTANT) {
        this.BONUS_REPRESENTANT = BONUS_REPRESENTANT;
    }
}
