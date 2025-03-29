package Lista2Java;

import java.util.Scanner;

public class PrimeiroMaiorQueSegundo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o nº1: ");
        n1 = leia.nextInt();
        System.out.print("Digite o nº2: ");
        n2 = leia.nextInt();

        if (n1 > n2){
            System.out.print("O nº1 é maior");
        }
        else {
            System.out.print("O primeiro não é maior que o segundo");
        }
    }
}
