public class Fahrzeug {
    private int kilometerstand;
    private int baujahr;
    private String farbe;

    // Konstruktor
    public Fahrzeug(int kilometerstand, int baujahr, String farbe) {
        setKilometerstand(kilometerstand);
        setBaujahr(baujahr);
        setFarbe(farbe);
    }

    // Getter für Kilometerstand
    public int getKilometerstand() {
        return kilometerstand;
    }

    // Setter für Kilometerstand
    public void setKilometerstand(int kilometerstand) {
        if (kilometerstand >= 0) {
            this.kilometerstand = kilometerstand;
        } else {
            System.out.println("Kilometerstand darf nicht negativ sein.");
        }
    }

    // Getter für Baujahr
    public int getBaujahr() {
        return baujahr;
    }

    // Setter für Baujahr
    public void setBaujahr(int baujahr) {
        if (baujahr > 1885) {
            this.baujahr = baujahr;
        } else {
            System.out.println("Baujahr muss nach 1885 liegen.");
        }
    }

    // Getter für Farbe
    public String getFarbe() {
        return farbe;
    }

    // Setter für Farbe
    public void setFarbe(String farbe) {
        if (farbe != null && !farbe.trim().isEmpty()) {
            this.farbe = farbe;
        } else {
            System.out.println("Farbe darf nicht null oder leer sein.");
        }
    }

    // Methode zum Fahren
    public void fahren(int km) {
        if (km > 0) {
            setKilometerstand(getKilometerstand() + km);
            System.out.println("Sie sind " + km + " Kilometer gefahren. Aktueller Kilometerstand: " + getKilometerstand() + " km.");
        } else {
            System.out.println("Die gefahrenen Kilometer müssen positiv sein.");
        }
    }

    // Ausgabe der Fahrzeugdetails
    @Override
    public String toString() {
        return "Fahrzeug [Kilometerstand=" + getKilometerstand() + ", Baujahr=" + getBaujahr() + ", Farbe=" + getFarbe() + "]";
    }
}
