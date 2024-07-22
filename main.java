import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean weiter = true;

        while (weiter) {
            System.out.println("Willkommen zur Berechnung der Flächen!");
            System.out.println("Was wollen Sie berechnen?");
            System.out.println("1. Rechteck");
            System.out.println("2. gleichseitiges Dreieck");
            System.out.println("3. Kreis");
            System.out.println("4. Quader");
            System.out.println("5. dreiseitiges Prisma");
            System.out.println("6. Zylinder");
            System.out.println("7. Beenden");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    rechteck();
                    break;
                case 2:
                    gleichseitigesDreieck();
                    break;
                case 3:
                    kreis();
                    break;
                case 4:
                    quader();
                    break;
                case 5:
                    dreiseitigesPrisma();
                    break;
                case 6:
                    zylinder();
                    break;
                case 7:
                    weiter = false;
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Auswahl. Bitte versuchen Sie es erneut.");
            }
        }
        scanner.close();
    }

    public static void rechteck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Länge des Rechtecks ein:");
        double laenge = scanner.nextDouble();
        System.out.println("Geben Sie die Breite des Rechtecks ein:");
        double breite = scanner.nextDouble();
        double umfang = 2 * (laenge + breite);
        double flaeche = laenge * breite;
        System.out.println("Der Umfang des Rechtecks beträgt: " + String.format("%.2f", umfang));
        System.out.println("Die Fläche des Rechtecks beträgt: " + String.format("%.2f", flaeche));
    }

    public static void gleichseitigesDreieck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Seitenlänge des gleichseitigen Dreiecks ein:");
        double seitenlaenge = scanner.nextDouble();
        double umfang = 3 * seitenlaenge;
        double flaeche = (Math.sqrt(3) / 4) * Math.pow(seitenlaenge, 2);  //sqrt = Wurzel, pow=Potenz
        System.out.println("Der Umfang des gleichseitigen Dreiecks beträgt: " + String.format("%.2f", umfang));
        System.out.println("Die Fläche des gleichseitigen Dreiecks beträgt: " + String.format("%.2f", flaeche));
    }

    public static void kreis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Radius des Kreises ein:");
        double radius = scanner.nextDouble();
        double umfang = 2 * Math.PI * radius;  //Math.PI = pi = 3,14159..
        double flaeche = Math.PI * Math.pow(radius, 2);
        System.out.println("Der Umfang des Kreises beträgt: " + String.format("%.2f", umfang));
        System.out.println("Die Fläche des Kreises beträgt: " + String.format("%.2f", flaeche));
    }

    public static void quader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Länge des Quaders ein:");
        double laenge = scanner.nextDouble();
        System.out.println("Geben Sie die Breite des Quaders ein:");
        double breite = scanner.nextDouble();
        System.out.println("Geben Sie die Höhe des Quaders ein:");
        double hoehe = scanner.nextDouble();
        double gesamtlaenge = 4 * (laenge + breite + hoehe);
        double oberflaeche = 2 * ((laenge * breite) + (laenge * hoehe) + (breite * hoehe));
        double volumen = laenge * breite * hoehe;
        System.out.println("Die Gesamtlänge des Quaders beträgt: " + String.format("%.2f", gesamtlaenge));
        System.out.println("Die Fläche des Quaders beträgt: " + String.format("%.2f", oberflaeche));
        System.out.println("Das Volumen des Kreises beträgt: " + String.format("%.2f", volumen));
    }

    public static void dreiseitigesPrisma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Seitenlänge des dreiseitigen Prismas ein:");
        double seitenlaenge = scanner.nextDouble();
        System.out.println("Geben Sie die Höhe des Prismas ein:");
        double hoehe = scanner.nextDouble();
        double gesamtlaenge = (6 * seitenlaenge) + (3 * hoehe);
        double oberflaeche = 2 * (Math.sqrt(3) / 4) * Math.pow(seitenlaenge, 2) + 3 * (seitenlaenge * hoehe);
        double volumen = (Math.sqrt(3) / 4) * Math.pow(seitenlaenge, 2) * hoehe;
        System.out.println("Der Kantenumfang des dreiseitigen Prismas beträgt: " + String.format("%.2f", gesamtlaenge));
        System.out.println("Die Oberfläche des dreiseitigen Prismas beträgt: " + String.format("%.2f", oberflaeche));
        System.out.println("Das Volumen des dreiseitigen Prismas beträgt: " + String.format("%.2f", volumen));
    }

    public static void zylinder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Radius des Zylinders ein:");
        double radius = scanner.nextDouble();
        System.out.println("Geben Sie die Höhe des Zylinders ein:");
        double hoehe = scanner.nextDouble();
        double umfang = 2 * Math.PI * radius;
        double oberflaeche = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * hoehe;
        double volumen = Math.PI * Math.pow(radius, 2) * hoehe;
        System.out.println("Der Umfang des Zylinders beträgt: " + String.format("%.2f", umfang));
        System.out.println("Die Oberfläche des Zylinders beträgt: " + String.format("%.2f", oberflaeche));
        System.out.println("Das Volumen des Zylinders beträgt: " + String.format("%.2f", volumen));
    }
}
