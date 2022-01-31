public class Main {
    public static void main(String[] args) {
        Pakunkowy brajan = new Pakunkowy(3, 8);
        Pakunkowy2 wincenty = new Pakunkowy2(3, 8);

        Prezent p = new Walec(1,0.25);
        Prezent p2 = new Prostopadloscian(11,0.2,0.75);
        Prezent p3 = new Tetrahydron(0.5);

        System.out.println(brajan.zapakuj(p));
        System.out.println(brajan.zapakuj(p2));
        System.out.println(brajan.zapakuj(p3));

        double[] dtab = {1};
        double[] dtab2 = {1,2};
        double[] dtab3 = {0.5, 0.1, 1};

        System.out.println(wincenty.zapakuj(new Prezent2(Figura.TETRAHYDRON, dtab)));
        System.out.println(wincenty.zapakuj(new Prezent2(Figura.KULA, dtab)));
        System.out.println(wincenty.zapakuj(new Prezent2(Figura.PROSTOPADLOSCIAN, dtab3)));

        System.out.println(p.pole());
        System.out.println(new Prezent2(Figura.TETRAHYDRON, dtab).pole());



//        double[] rtab = new double[1];
//        Opakowanie2 tektura = new Tektura2(new Prezent2(Figura.KULA, rtab));
//        System.out.println(tektura.toString());
    }
}
