
package dz.univ.calculatrice;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int choix;

        do {
            System.out.println("\n=== CALCULATRICE ===");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            if (choix == 1 || choix == 2) {

                System.out.print("Premier nombre : ");
                double a = scanner.nextDouble();

                System.out.print("Deuxième nombre : ");
                double b = scanner.nextDouble();

                Operation operation;

                if (choix == 1) {
                    operation = new AddOperation();
                } else {
                    operation = new SubtractOperation();
                }

                double resultat = operation.execute(a, b);

                System.out.println("Résultat : " + resultat);

            } else if (choix != 0) {
                System.out.println("Choix invalide !");
            }

        } while (choix != 0);

        System.out.println("Au revoir !");
        scanner.close();
    }
}
