public class Fahrrad extends Fahrzeug {
    private String art;
    private int anzahlGaenge;

    // Konstruktor für Fahrrad
    public Fahrrad(int kilometerstand, int baujahr, String farbe, String art, int anzahlGaenge) {
        super(kilometerstand, baujahr, farbe);
        setArt(art);
        setAnzahlGaenge(anzahlGaenge); // Verwende den Setter für Validierung
    }

    // Getter für Art des Fahrrads
    public String getArt() {
        return art;
    }

    // Setter für Art des Fahrrads
    public void setArt(String art) {
        this.art = art;
    }

    // Getter für Anzahl der Gänge
    public int getAnzahlGaenge() {
        return anzahlGaenge;
    }

    // Setter für Anzahl der Gänge
    public void setAnzahlGaenge(int anzahlGaenge) {
        if (anzahlGaenge > 0) {
            this.anzahlGaenge = anzahlGaenge;
        } else {
            System.out.println("Fehler: Die Anzahl der Gänge muss positiv sein.");
        }
    }

    // Überschreibung der toString-Methode zur Ausgabe von Fahrrad-Daten
    @Override
    public String toString() {
        return "Fahrrad [Kilometerstand=" + getKilometerstand() + ", Baujahr=" + getBaujahr() + ", Farbe=" + getFarbe() +
                ", Art=" + getArt() + ", Anzahl der Gänge=" + getAnzahlGaenge() + "]";
    }
}
