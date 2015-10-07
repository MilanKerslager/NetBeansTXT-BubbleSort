// program pro sežazení čísel v poli pomocí BubbleSort

package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        // uvodní hodnoty pro testování
        // int[] pole = {5, 4, 3, 2, 1};

        // vstup čísel zakončený nulou
        final int MAXITEM = 100;
        int[] pole = new int[MAXITEM];
        Scanner vstup = new Scanner(System.in);
        System.out.print("Vlož číslo: ");
        int cislo = vstup.nextInt();
        int pocet = 0;
        while (cislo != 0) {
            pole[pocet] = cislo;
            pocet++;
            System.out.print("Vlož číslo: ");
            cislo = vstup.nextInt();
        }

        // BubbleSort algoritmus
        for (int j = 1; j <= pocet - 1; j++) {
            for (int i = 0; i <= pocet - j - 1; i++) {
                // porovnání aktuální a následující položky v poli
                if (pole[i] > pole[i + 1]) {
                    // prohození aktuální a následující položky
                    int pom = pole[i];
                    pole[i] = pole[i + 1];
                    pole[i+1] = pom;
                }
            }
        }
        
        System.out.println("Seřazené hodnoty:");
        for (int i=0; i<pocet; i++) {
            System.out.print(pole[i]+" ");
        }
        System.out.println();
    }
}
