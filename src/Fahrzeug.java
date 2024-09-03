import java.util.Scanner;

public class Fahrzeug {
    public int kilometerstand;
    private int baujahr;
    private String farbe;

    public Fahrzeug(int kilometerstand, int baujahr, String farbe) {
        this.kilometerstand = kilometerstand;
        this.baujahr = baujahr;
        this.farbe = farbe;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void fahren() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie die Kilometeranzahl ein, die Sie fahren möchten: ");
        int km = scanner.nextInt();
        this.kilometerstand += km;
        System.out.println("Sie sind " + km + " Kilometer gefahren. Aktueller Kilometerstand: " + this.kilometerstand + " km.");
    }
}
