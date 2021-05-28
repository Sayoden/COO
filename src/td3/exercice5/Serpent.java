package td3.exercice5;

public class Serpent extends AnimalSansPattes{
    private boolean venin;

    public Serpent(String race, int poids, float longueur, boolean venin) {
        super(race, poids, longueur);
        this.venin = venin;
    }
}
