public class Tektura extends Opakowanie{
    public Tektura(Prezent prezent) {
        super(prezent);
    }

    @Override
    public String toString() {
        return "Opakowanie prezentu: Tektura, Ksztalt: "
                + getPrezent().toString();
    }
}
