public class Main {
    public static void main(String[] args) {
        // PKW-Objekt pkw1 erstellen
        PKW pkw1 = new PKW(10000, 50, 2020, "Rot", 5, 500);
        System.out.println("PKW erstellt");
        System.out.println("Kilometerstand: " + pkw1.getKilometerstand());
        System.out.println("Tankinhalt: " + pkw1.getTankinhalt() + "L");
        System.out.println("Baujahr: " + pkw1.getBaujahr());
        System.out.println("Farbe: " + pkw1.getFarbe());
        System.out.println("Sitze: " + pkw1.getSitze());
        System.out.println("Kofferraumvolumen: " + pkw1.getKofferraumvolumen());

        pkw1.fahren();
        pkw1.tanken();
        System.out.println("PKW nach Fahrt und Tanken: Kilometerstand = " + pkw1.getKilometerstand() + ", Tankinhalt = " + pkw1.getTankinhalt() + "L");

        // LKW-Objekt lkw1 erstellen
        LKW lkw1 = new LKW(50000, 200, 2015, "Blau", 8000, 4);
        System.out.println("LKW erstellt");
        System.out.println("Kilometerstand: " + lkw1.getKilometerstand());
        System.out.println("Tankinhalt: " + lkw1.getTankinhalt() + "L");
        System.out.println("Baujahr: " + lkw1.getBaujahr());
        System.out.println("Farbe: " + lkw1.getFarbe());
        System.out.println("Ladegewicht: " + lkw1.getLadegewicht());
        System.out.println("Achsen: " + lkw1.getAchsen());

        lkw1.fahren();
        lkw1.tanken();
        System.out.println("LKW nach Fahrt und Tanken: Kilometerstand = " + lkw1.getKilometerstand() + ", Tankinhalt = " + lkw1.getTankinhalt() + "L");

        // Motorrad-Objekt motorrad1 erstellen
        Motorrad motorrad1 = new Motorrad(15000, 15, 2018, "Schwarz", 600, 2);
        System.out.println("Motorrad erstellt");
        System.out.println("Kilometerstand: " + motorrad1.getKilometerstand());
        System.out.println("Tankinhalt: " + motorrad1.getTankinhalt() + "L");
        System.out.println("Baujahr: " + motorrad1.getBaujahr());
        System.out.println("Farbe: " + motorrad1.getFarbe());
        System.out.println("Hubraum: " + motorrad1.getHubraum());
        System.out.println("Anzahl Helmhalterungen: " + motorrad1.getAnzahlHelmhalterungen());

        motorrad1.fahren();
        motorrad1.tanken();
        System.out.println("Motorrad nach Fahrt und Tanken: Kilometerstand = " + motorrad1.getKilometerstand() + ", Tankinhalt = " + motorrad1.getTankinhalt() + "L");

        // Fahrrad-Objekt fahrrad1 erstellen
        Fahrrad fahrrad1 = new Fahrrad(500, 2021, "Grün", "Mountainbike", 21);
        System.out.println("Fahrrad erstellt");
        System.out.println("Kilometerstand: " + fahrrad1.getKilometerstand());
        System.out.println("Baujahr: " + fahrrad1.getBaujahr());
        System.out.println("Farbe: " + fahrrad1.getFarbe());
        System.out.println("Art: " + fahrrad1.getArt());
        System.out.println("Anzahl Gänge: " + fahrrad1.getAnzahlGaenge());

        fahrrad1.fahren(20);
        System.out.println("Fahrrad nach Fahrt: Kilometerstand = " + fahrrad1.getKilometerstand());
    }
}
