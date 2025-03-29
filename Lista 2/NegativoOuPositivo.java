package Lista2Java;

import java.util.Scanner;

public class NegativoOuPositivo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        if (numero > 0){
            System.out.print("Esse número é positivo");
        }
        else {
            System.out.print("Esse número é negativo");
        }
    }
}
