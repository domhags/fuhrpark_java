import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        List<Fahrzeug> fahrzeuge = new ArrayList<>();

        while (!exit) {
            int menuAuswahl = zeigeHauptMenu(scanner);

            switch (menuAuswahl) {
                case 1:
                    fahrzeuge.add(erstellePKW(scanner));
                    break;
                case 2:
                    fahrzeuge.add(erstelleLKW(scanner));
                    break;
                case 3:
                    fahrzeuge.add(erstelleMotorrad(scanner));
                    break;
                case 4:
                    fahrzeuge.add(erstelleFahrrad(scanner));
                    break;
                case 5:
                    if (fahrzeuge.isEmpty()) {
                        System.out.println("Es sind keine Fahrzeuge vorhanden.");
                    } else {
                        verwalteFahrzeugMenu(scanner, fahrzeuge);
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Programm wird beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
            }
        }
        scanner.close();
    }

    // Zeigt das Hauptmenü an und gibt die Auswahl zurück
    private static int zeigeHauptMenu(Scanner scanner) {
        System.out.println("\n--- Fahrzeugverwaltung ---");
        System.out.println("1. PKW anlegen");
        System.out.println("2. LKW anlegen");
        System.out.println("3. Motorrad anlegen");
        System.out.println("4. Fahrrad anlegen");
        System.out.println("5. Fahrzeug verwalten");
        System.out.println("6. Programm beenden");
        System.out.print("Bitte wählen Sie eine Option: ");
        return getIntValue(scanner);
    }

    // Erstellt ein PKW-Objekt basierend auf Benutzereingaben
    private static PKW erstellePKW(Scanner scanner) {
        System.out.println("\n--- PKW anlegen ---");
        return new PKW(
                getIntInput("Kilometerstand: ", scanner),
                getFloatInput("Tankinhalt (in Litern): ", scanner),
                getFloatInput("Maximale Tankkapazität (in Litern): ", scanner),
                getIntInput("Baujahr: ", scanner),
                getStringInput("Farbe: ", scanner),
                getIntInput("Anzahl der Sitze: ", scanner),
                getIntInput("Kofferraumvolumen (in Litern): ", scanner)
        );
    }

    // Erstellt ein LKW-Objekt basierend auf Benutzereingaben
    private static LKW erstelleLKW(Scanner scanner) {
        System.out.println("\n--- LKW anlegen ---");
        return new LKW(
                getIntInput("Kilometerstand: ", scanner),
                getFloatInput("Tankinhalt (in Litern): ", scanner),
                getFloatInput("Maximale Tankkapazität (in Litern): ", scanner),
                getIntInput("Baujahr: ", scanner),
                getStringInput("Farbe: ", scanner),
                getFloatInput("Ladegewicht (in kg): ", scanner),
                getIntInput("Anzahl der Achsen: ", scanner)
        );
    }

    // Erstellt ein Motorrad-Objekt basierend auf Benutzereingaben
    private static Motorrad erstelleMotorrad(Scanner scanner) {
        System.out.println("\n--- Motorrad anlegen ---");
        return new Motorrad(
                getIntInput("Kilometerstand: ", scanner),
                getFloatInput("Tankinhalt (in Litern): ", scanner),
                getFloatInput("Maximale Tankkapazität (in Litern): ", scanner),
                getIntInput("Baujahr: ", scanner),
                getStringInput("Farbe: ", scanner),
                getIntInput("Hubraum (in ccm): ", scanner),
                getIntInput("Anzahl der Helmhalterungen: ", scanner)
        );
    }

    // Erstellt ein Fahrrad-Objekt basierend auf Benutzereingaben
    private static Fahrrad erstelleFahrrad(Scanner scanner) {
        System.out.println("\n--- Fahrrad anlegen ---");
        return new Fahrrad(
                getIntInput("Kilometerstand: ", scanner),
                getIntInput("Baujahr: ", scanner),
                getStringInput("Farbe: ", scanner),
                getStringInput("Art des Fahrrads: ", scanner),
                getIntInput("Anzahl der Gänge: ", scanner)
        );
    }

    // Zeigt das Menü zur Verwaltung von Fahrzeugen an
    private static void verwalteFahrzeugMenu(Scanner scanner, List<Fahrzeug> fahrzeuge) {
        System.out.println("\n--- Fahrzeug auswählen ---");
        for (int i = 0; i < fahrzeuge.size(); i++) {
            System.out.println((i + 1) + ". " + fahrzeuge.get(i).toString());
        }
        System.out.print("Bitte wählen Sie ein Fahrzeug zum Verwalten: ");
        int auswahl = getIntValue(scanner) - 1;

        if (auswahl >= 0 && auswahl < fahrzeuge.size()) {
            verwalteFahrzeug(scanner, fahrzeuge.get(auswahl));
        } else {
            System.out.println("Ungültige Auswahl. Bitte erneut versuchen.");
        }
    }

    // Verwaltung eines spezifischen Fahrzeugs
    private static void verwalteFahrzeug(Scanner scanner, Fahrzeug fahrzeug) {
        boolean zurueck = false;

        while (!zurueck) {
            System.out.println("\n--- " + fahrzeug.getClass().getSimpleName() + " Verwaltung ---");
            System.out.println("1. Kilometerstand anzeigen");
            System.out.println("2. Fahren");
            if (fahrzeug instanceof MotorisiertesFahrzeug) {
                System.out.println("3. Tankinhalt anzeigen");
                System.out.println("4. Tanken");
            }
            System.out.println("0. Zurück zum Hauptmenü");
            System.out.print("Bitte wählen Sie eine Option: ");

            int auswahl = getIntValue(scanner);

            switch (auswahl) {
                case 1:
                    System.out.println("Kilometerstand: " + fahrzeug.getKilometerstand() + " km");
                    break;
                case 2:
                    System.out.print("Wie viele Kilometer möchten Sie fahren? ");
                    int km = getIntValue(scanner);
                    fahrzeug.fahren(km);
                    break;
                case 3:
                    if (fahrzeug instanceof MotorisiertesFahrzeug) {
                        MotorisiertesFahrzeug motorisiertesFahrzeug = (MotorisiertesFahrzeug) fahrzeug;
                        System.out.println("Tankinhalt: " + motorisiertesFahrzeug.getTankinhalt() + " Liter");
                    } else {
                        System.out.println("Diese Option ist für dieses Fahrzeug nicht verfügbar.");
                    }
                    break;
                case 4:
                    if (fahrzeug instanceof MotorisiertesFahrzeug) {
                        MotorisiertesFahrzeug motorisiertesFahrzeug = (MotorisiertesFahrzeug) fahrzeug;
                        System.out.print("Wie viele Liter möchten Sie tanken? ");
                        float liter = getFloatValue(scanner);
                        motorisiertesFahrzeug.tanken(liter);
                    } else {
                        System.out.println("Diese Option ist für dieses Fahrzeug nicht verfügbar.");
                    }
                    break;
                case 0:
                    zurueck = true;
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
            }
        }
    }

    // Eingabehilfsmethoden zum Überprüfen der Eingaben
    private static int getIntInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return getIntValue(scanner);
    }

    private static float getFloatInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return getFloatValue(scanner);
    }

    private static String getStringInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.next();
    }

    // Liest eine ganze Zahl ein und behandelt ungültige Eingaben
    private static int getIntValue(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte eine ganze Zahl eingeben.");
                scanner.next(); // Ungültige Eingabe löschen
            }
        }
    }

    // Liest eine Fließkommazahl ein und behandelt ungültige Eingaben
    private static float getFloatValue(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe. Bitte eine Dezimalzahl eingeben.");
                scanner.next(); // Ungültige Eingabe löschen
            }
        }
    }
}
