// program pro sežazení čísel v poli pomocí BubbleSort

package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        // uvodní hodnoty pro testování
        int[] pole = {5, 4, 3, 2, 1};

        int n = pole.length;
        // BubbleSort algoritmus
        for (int j = 1; j <= n - 1; j++) {
            for (int i = 0; i <= n - j - 1; i++) {
                // porovnání aktuální a následující položky v poli
                if (pole[i] > pole[i + 1]) {
                    // prohození aktuální a následující položky
                    int pom = pole[i];
                    pole[i] = pole[i + 1];
                    pole[i+1] = pom;
                }
            }
        }
        // výpis seřazeného pole
        for (int i=0; i<pole.length; i++) {
            System.out.print(pole[i]+" ");
        }
        System.out.println();
    }
}
