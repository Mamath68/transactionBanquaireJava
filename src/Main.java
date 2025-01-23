public class Main {
    public static void main(String[] args) {
        int[] tableau = {6, 5, 3, 8, 1, 4, 9, 7, 11 , 2, 10};

        trieABulle(tableau);

        System.out.println("Tableau trié : ");
        for (int i : tableau) {
            if (i == tableau.length) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void trieABulle(int[] tableau) {
        for (int i = tableau.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tableau[j + 1] < tableau[j]) {
                    int array = tableau[j + 1];
                    tableau[j + 1] = tableau[j];
                    tableau[j] = array;
                }
            }
        }
    }
}
