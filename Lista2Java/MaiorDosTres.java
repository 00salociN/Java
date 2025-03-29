package Lista2Java;

import java.util.Scanner;

public class MaiorDosTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o nº1: ");
        n1 = leia.nextInt();
        System.out.print("Digite o nº2: ");
        n2 = leia.nextInt();
        System.out.print("Digite o nº3: ");
        n3 = leia.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("O nº1 é o maior");
        }
        else if (n2 > n1 && n2 > n3){
            System.out.print("O nº2 é o maior");
        }
        else if (n3 > n1 && n3 > n2){
            System.out.println("O nº3 é o maior");
        }
        else if (n1 == n2 && n1 == n3){
            System.out.println("Os três são iguais");
        }
        else {
            System.out.println("Dois deles são iguais, basta ver :)");
        }
    }
}
