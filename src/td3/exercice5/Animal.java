package td3.exercice5;

public class Animal {

    private String race;
    private int poids;

    public Animal(String race, int poids) {
        this.race = race;
        this.poids = poids;
    }

    public String getRace() {
        return race;
    }

    public int getPoids() {
        return poids;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "race='" + race + '\'' +
                ", poids=" + poids +
                '}';
    }
}
