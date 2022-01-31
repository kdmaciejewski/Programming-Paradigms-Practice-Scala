public class Walec extends Figura{

    public Walec(double[] tab) {
        super(tab);
    }

    public double liczPole(){
        pole = tab[0]*tab[1] * 2 * 3.14;
        return pole;
    }
}
