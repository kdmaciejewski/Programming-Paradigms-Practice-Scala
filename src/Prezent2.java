import java.util.Arrays;

public class Prezent2 {
    private Figura figura;
    private double[] wymiary;

    public Prezent2(Figura figura, double[] wymiary) {
        this.figura = figura;
        this.wymiary = wymiary;
    }

    public double pole(){
        switch (figura){
            case KULA: return 4 * 3.14 * wymiary[0] * wymiary[0];

            case WALEC: return 2 * 3.14 * wymiary[0] * wymiary[0] + 2 * 3.14 * wymiary[0] * wymiary[1];

            case PROSTOPADLOSCIAN: return 2 * (wymiary[0] * wymiary[1] + wymiary[0] * wymiary[2] + wymiary[1] * wymiary[2]);

            case TETRAHYDRON: return wymiary[0] * wymiary[0] * Math.sqrt(3);
        }
        return 0;
    }

    @Override
    public String toString() {
        return figura+ " o wymiarach: " + Arrays.toString(wymiary);
    }
}
