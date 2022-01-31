public class Kula extends Prezent
{
    private double r;
    public Kula(double r){
        this.r = r;

    }

    @Override
    public double pole()
    {
        return 4*3.14*r*r;
    }

    @Override
    public String toString() {
        return "Kula o promieniu: " + r;
    }
}
