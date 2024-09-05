public class PKW extends MotorisiertesFahrzeug {
    private int sitze;
    private int kofferraumvolumen;

    // Konstruktor für PKW
    public PKW(int kilometerstand, float tankinhalt, float maxTankkapazitaet, int baujahr, String farbe, int sitze, int kofferraumvolumen) {
        super(kilometerstand, tankinhalt, maxTankkapazitaet, baujahr, farbe);
        setSitze(sitze);
        setKofferraumvolumen(kofferraumvolumen);
    }

    // Getter für Sitze
    public int getSitze() {
        return sitze;
    }

    // Setter für Sitze
    public void setSitze(int sitze) {
        if (sitze > 0) {
            this.sitze = sitze;
        } else {
            System.out.println("Fehler: Die Anzahl der Sitze muss positiv sein.");
            this.sitze = 1; // Setze auf einen Default-Wert
        }
    }

    // Getter für Kofferraumvolumen
    public int getKofferraumvolumen() {
        return kofferraumvolumen;
    }

    // Setter für Kofferraumvolumen
    public void setKofferraumvolumen(int kofferraumvolumen) {
        if (kofferraumvolumen >= 0) {
            this.kofferraumvolumen = kofferraumvolumen;
        } else {
            System.out.println("Fehler: Das Kofferraumvolumen kann nicht negativ sein.");
            this.kofferraumvolumen = 0; // Setze auf einen Default-Wert
        }
    }

    // Überschreibung der toString-Methode zur Ausgabe von PKW-Daten
    @Override
    public String toString() {
        return "PKW [Kilometerstand=" + getKilometerstand() + ", Baujahr=" + getBaujahr() + ", Farbe=" + getFarbe() +
                ", Sitze=" + getSitze() + ", Kofferraumvolumen=" + getKofferraumvolumen() + "]";
    }
}
