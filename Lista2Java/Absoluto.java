package Lista2Java;

import java.util.Scanner;

public class Absoluto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.println("Digite o valor: ");
        numero = leia.nextInt();

        System.out.println("O número Absoluto é = " + Math.abs(numero));

    }
    
}
