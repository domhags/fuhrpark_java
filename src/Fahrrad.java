public class Fahrrad extends Fahrzeug {
    private String art;
    private int anzahlGaenge;

    public Fahrrad(int kilometerstand, int baujahr, String farbe, String art, int anzahlGaenge) {
        super(kilometerstand, baujahr, farbe);
        this.art = art;
        this.anzahlGaenge = anzahlGaenge;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getAnzahlGaenge() {
        return anzahlGaenge;
    }

    public void setAnzahlGaenge(int anzahlGaenge) {
        this.anzahlGaenge = anzahlGaenge;
    }
}
