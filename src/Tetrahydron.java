public class Tetrahydron extends Prezent{
    private double a;

    public Tetrahydron(double a) {
        this.a = a;
    }

    @Override
    double pole() {
        return 0;
    }

    @Override
    public String toString() {
        return "Tetrahydron o wymiarach: " + a;
    }
}
