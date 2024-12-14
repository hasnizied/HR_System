public abstract class Employee {
    private String nom ;
    private String prenom ;
    private int age;

    Employee(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }
Employee() {

}


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public abstract void detailsCalculSal();

    public abstract double calculerSalaire();

    public abstract String  getTitre();


}


