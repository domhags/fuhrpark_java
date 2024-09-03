public class Motorrad extends MotorisiertesFahrzeug {
    private int hubraum;
    private int anzahlHelmhalterungen;

    public Motorrad(int kilometerstand, float tankinhalt, int baujahr, String farbe, int hubraum, int anzahlHelmhalterungen) {
        super(kilometerstand, tankinhalt, baujahr, farbe);
        this.hubraum = hubraum;
        this.anzahlHelmhalterungen = anzahlHelmhalterungen;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public int getAnzahlHelmhalterungen() {
        return anzahlHelmhalterungen;
    }

    public void setAnzahlHelmhalterungen(int anzahlHelmhalterungen) {
        this.anzahlHelmhalterungen = anzahlHelmhalterungen;
    }
}
