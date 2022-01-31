public class Pakunkowy {
    double min;
    double max;
    Prezent p;
    Papier papier;

    public Pakunkowy(double min, double max, Prezent p) {
        this.min = min;
        this.max = max;
        this.p = p;
        this.papier = null;
    }

    public void setPapier(Papier papier) {
        this.papier = papier;
    }
}
