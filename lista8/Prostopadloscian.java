public class Prostopadloscian extends Figura{
    public Prostopadloscian(double[] tab) {
        super(tab);

    }

    public double liczPole(){
        pole = tab[0]*tab[1]*tab[2];
        return pole;
    }
}
