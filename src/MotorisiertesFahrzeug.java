import java.util.Scanner;

public class MotorisiertesFahrzeug extends Fahrzeug {
    private float tankinhalt;

    public MotorisiertesFahrzeug(int kilometerstand, float tankinhalt, int baujahr, String farbe) {
        super(kilometerstand, baujahr, farbe);
        this.tankinhalt = tankinhalt;
    }

    public float getTankinhalt() {
        return tankinhalt;
    }

    public void setTankinhalt(float tankinhalt) {
        this.tankinhalt = tankinhalt;
    }

    public void tanken() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Menge an Treibstoff ein, die Sie tanken möchten (in Litern): ");
        float liter = scanner.nextFloat();
        this.tankinhalt += liter;
        System.out.println("Sie haben " + liter + " Liter getankt. Aktueller Tankinhalt: " + this.tankinhalt + " Liter.");
    }

    public void fahren() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Kilometeranzahl ein, die Sie fahren möchten: ");
        int km = scanner.nextInt();
        this.kilometerstand += km;
        System.out.println("Sie sind " + km + " Kilometer gefahren. Aktueller Kilometerstand: " + this.kilometerstand + " km.");
    }
}
