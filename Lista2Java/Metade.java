package Lista2Java;

import java.util.Scanner;

public class Metade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, div;

        System.out.print("Digite o número: ");
        numero = leia.nextInt();

        div = numero / 2;

        System.out.print(div);
    }
}
