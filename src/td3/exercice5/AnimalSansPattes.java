package td3.exercice5;

public class AnimalSansPattes extends Animal{
    private float longueur;

    public AnimalSansPattes(String race, int poids, float longueur) {
        super(race, poids);
        this.longueur = longueur;
    }
}
