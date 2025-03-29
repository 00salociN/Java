package Lista2Java;

import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero, dobro;

        System.out.print("Digite o número: ");
        numero = leia.nextInt();

        dobro = numero * 2;

        System.out.print(dobro);
    }
}
