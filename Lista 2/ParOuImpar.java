package Lista2Java;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Digite o número no qual quer saber se é Par ou Ímpar: ");
        numero = leia.nextInt();

        if (numero % 2 == 0){
            System.out.print("Esse número é par");
        }
        else {
            System.out.print("Esse número é Ímpar");
        }
        
    }
}
