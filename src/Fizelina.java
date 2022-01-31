public class Fizelina extends Opakowanie{

    public Fizelina(Prezent prezent) {
        super(prezent);
    }
    public String toString() {
        return "Opakowanie prezentu: Fizelina, Kształt: " + getPrezent().toString();
    }
}
