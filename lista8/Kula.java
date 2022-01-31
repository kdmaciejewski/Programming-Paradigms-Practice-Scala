public class Kula extends Figura{
    public Kula(double[] tab) {
        super(tab);
    }

    public double liczPole(){
        pole = tab[0] * 4 * 3.14;
        return pole;
    }

}
