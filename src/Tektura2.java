public class Tektura2 extends Opakowanie2{

    public Tektura2(Prezent2 prezent2) {
        super(prezent2);
    }

    @Override
    public String toString() {
        return "Opakowanie prezentu: Tektura, Kształt: " + getPrezent2().toString();
    }
}
