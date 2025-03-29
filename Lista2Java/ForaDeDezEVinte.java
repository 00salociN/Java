package Lista2Java;

import java.util.Scanner;

public class ForaDeDezEVinte {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite o número: ");
        numero = leia.nextInt();

        if (numero >= 10 && numero <= 20){
            System.out.print("O número está entre 10 e 20");
        }
        else {
            System.out.print("O número está fora do intervalo de 10 e 20");
        }
    }
    
}