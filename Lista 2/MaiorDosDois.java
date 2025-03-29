package Lista2Java;

import java.util.Scanner;

public class MaiorDosDois {
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
        else if (n2 > n1){
            System.out.print("O nº2 é maior");
        }
        else {
            System.out.print("Os dois números possuem o mesmo valor");
        }
    }
}
