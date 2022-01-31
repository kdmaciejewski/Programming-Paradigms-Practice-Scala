public class Pakunkowy2 {
    private double min;
    private double max;

    public Pakunkowy2(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public Opakowanie2 zapakuj(Prezent2 p){
        double poleZMarginesem = p.pole()*1.05;

        if (poleZMarginesem<min) return new Tektura2(p);
        else if (poleZMarginesem<max) return new Fizelina2(p);
        else return new PlytaOSB2(p);

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
