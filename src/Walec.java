public class Walec extends Prezent{
    private double r;
    private double h;

    public Walec(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    double pole() {
        return 3.14*r*r*2 + 2*3.14*r*h;
    }

    @Override
    public String toString() {
        return "Walec o wymiarach: r= "+ r + ", h= " + h;
    }
}
