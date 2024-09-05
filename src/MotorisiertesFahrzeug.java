public class MotorisiertesFahrzeug extends Fahrzeug {
    private float tankinhalt;
    private final float maxTankkapazitaet;

    // Konstruktor
    public MotorisiertesFahrzeug(int kilometerstand, float tankinhalt, float maxTankkapazitaet, int baujahr, String farbe) {
        super(kilometerstand, baujahr, farbe);
        if (tankinhalt < 0) {
            System.out.println("Fehler: Der Tankinhalt darf nicht negativ sein.");
            this.tankinhalt = 0; // Setze auf 0 als Default-Wert
        } else {
            this.tankinhalt = Math.min(tankinhalt, maxTankkapazitaet);
        }
        this.maxTankkapazitaet = maxTankkapazitaet;
    }

    // Getter für Tankinhalt
    public float getTankinhalt() {
        return tankinhalt;
    }

    // Setter für Tankinhalt
    public void setTankinhalt(float tankinhalt) {
        if (tankinhalt < 0) {
            System.out.println("Fehler: Der Tankinhalt darf nicht negativ sein.");
            return;
        }
        this.tankinhalt = Math.min(tankinhalt, maxTankkapazitaet);
    }

    // Methode zum Tanken
    public void tanken(float liter) {
        if (liter < 0) {
            System.out.println("Fehler: Die Menge an Treibstoff darf nicht negativ sein.");
            return;
        }
        if (tankinhalt + liter > maxTankkapazitaet) {
            tankinhalt = maxTankkapazitaet;
            System.out.println("Tank ist voll. Aktueller Tankinhalt: " + this.tankinhalt + " Liter.");
        } else {
            setTankinhalt(tankinhalt + liter);
            System.out.println("Sie haben " + liter + " Liter getankt. Aktueller Tankinhalt: " + this.tankinhalt + " Liter.");
        }
    }

    // Methode zum Fahren
    @Override
    public void fahren(int km) {
        if (km < 0) {
            System.out.println("Fehler: Die gefahrenen Kilometer dürfen nicht negativ sein.");
            return;
        }

        float verbrauchProKilometer = 0.1f; // z.B. 0,1 Liter pro Kilometer
        float benoetigterTreibstoff = km * verbrauchProKilometer;

        if (benoetigterTreibstoff <= tankinhalt) {
            super.fahren(km); // Ruft die Methode der Basisklasse auf
            setTankinhalt(tankinhalt - benoetigterTreibstoff);
            System.out.println("Sie sind " + km + " Kilometer gefahren. Verbleibender Tankinhalt: " + this.tankinhalt + " Liter.");
        } else {
            System.out.println("Fehler: Nicht genug Treibstoff, um " + km + " Kilometer zu fahren.");
        }
    }
}
