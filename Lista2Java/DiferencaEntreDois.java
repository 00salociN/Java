package Lista2Java;

import java.util.Scanner;

public class DiferencaEntreDois {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, dif;

        System.out.print("Digite o valor do nº1:");
        n1 = leia.nextInt();
        System.out.print("Digite o valor do nº2: ");
        n2 = leia.nextInt();

        dif = n1 - n2;

        System.out.print(dif);
    }
}
