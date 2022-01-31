public class Prostopadloscian extends Prezent{
    private double a;
    private double b;
    private double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double pole() {
        return 2*a*b + 2*a*c + 2*b*c;
    }

    @Override
    public String toString() {
        return "Prostopadłościan o wymiarach a= " + a +
                ", b= " + b +
                ", c= " + c;
    }
}
