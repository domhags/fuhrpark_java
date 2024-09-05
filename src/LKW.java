public class LKW extends MotorisiertesFahrzeug {
    private float ladegewicht;
    private int achsen;

    // Konstruktor für LKW
    public LKW(int kilometerstand, float tankinhalt, float maxTankkapazitaet, int baujahr, String farbe, float ladegewicht, int achsen) {
        super(kilometerstand, tankinhalt, maxTankkapazitaet, baujahr, farbe);
        setLadegewicht(ladegewicht); // Ladegewicht setzen
        setAchsen(achsen); // Achsen setzen
    }

    // Getter für Ladegewicht
    public float getLadegewicht() {
        return ladegewicht;
    }

    // Setter für Ladegewicht
    public void setLadegewicht(float ladegewicht) {
        if (ladegewicht >= 0) {
            this.ladegewicht = ladegewicht;
        } else {
            System.out.println("Fehler: Das Ladegewicht kann nicht negativ sein.");
        }
    }

    // Getter für Achsen
    public int getAchsen() {
        return achsen;
    }

    // Setter für Achsen
    public void setAchsen(int achsen) {
        if (achsen >= 2) {
            this.achsen = achsen;
        } else {
            System.out.println("Fehler: Ein LKW muss mindestens zwei Achsen haben.");
        }
    }

    // Überschreibung der toString-Methode zur Ausgabe von LKW-Daten
    @Override
    public String toString() {
        return "LKW [Kilometerstand=" + getKilometerstand() + ", Baujahr=" + getBaujahr() + ", Farbe=" + getFarbe() +
                ", Tankinhalt=" + getTankinhalt() + ", Ladegewicht=" + getLadegewicht() + ", Achsen=" + getAchsen() + "]";
    }
}
