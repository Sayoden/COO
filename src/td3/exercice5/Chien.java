package td3.exercice5;

public class Chien extends AnimalAvecPattes{
    private String categorie;

    public Chien(String race, int poids, int nombrePattes, String categorie) {
        super(race, poids, nombrePattes);
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.categorie;
    }
}
