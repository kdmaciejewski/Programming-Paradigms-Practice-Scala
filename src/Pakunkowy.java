public class Pakunkowy {
    private double min;
    private double max;

    public Pakunkowy(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public Opakowanie zapakuj(Prezent p){
        double poleZMarginesem = p.pole()*1.05;

        if (poleZMarginesem<min) return new Tektura(p);
        else if (poleZMarginesem<max) return new Fizelina(p);
        else return new PlytaOSB(p);

    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
