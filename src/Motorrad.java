public class Motorrad extends MotorisiertesFahrzeug {
    private int hubraum;
    private int anzahlHelmhalterungen;

    // Konstruktor für Motorrad
    public Motorrad(int kilometerstand, float tankinhalt, float maxTankkapazitaet, int baujahr, String farbe, int hubraum, int anzahlHelmhalterungen) {
        super(kilometerstand, tankinhalt, maxTankkapazitaet, baujahr, farbe);
        setHubraum(hubraum);
        setAnzahlHelmhalterungen(anzahlHelmhalterungen);
    }

    // Getter für Hubraum
    public int getHubraum() {
        return hubraum;
    }

    // Setter für Hubraum
    public void setHubraum(int hubraum) {
        if (hubraum > 0) {
            this.hubraum = hubraum;
        } else {
            System.out.println("Fehler: Der Hubraum muss positiv sein.");
        }
    }

    // Getter für Anzahl der Helmhalterungen
    public int getAnzahlHelmhalterungen() {
        return anzahlHelmhalterungen;
    }

    // Setter für Anzahl der Helmhalterungen
    public void setAnzahlHelmhalterungen(int anzahlHelmhalterungen) {
        if (anzahlHelmhalterungen >= 0) {
            this.anzahlHelmhalterungen = anzahlHelmhalterungen;
        } else {
            System.out.println("Fehler: Die Anzahl der Helmhalterungen kann nicht negativ sein.");
        }
    }

    // Überschreibung der toString-Methode zur Ausgabe von Motorrad-Daten
    @Override
    public String toString() {
        return "Motorrad [Kilometerstand=" + getKilometerstand() + ", Baujahr=" + getBaujahr() + ", Farbe=" + getFarbe() +
                ", Tankinhalt=" + getTankinhalt() + ", Hubraum=" + getHubraum() + ", Anzahl der Helmhalterungen=" + getAnzahlHelmhalterungen() + "]";
    }
}
