package td3.exercice5;

public class AnimalAvecPattes extends Animal {
    private int nombrePattes;

    public AnimalAvecPattes(String race, int poids, int nombrePattes) {
        super(race, poids);
        this.nombrePattes = nombrePattes;
    }
}
