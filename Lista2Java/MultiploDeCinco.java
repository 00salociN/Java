package Lista2Java;

import java.util.Scanner;

public class MultiploDeCinco {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite o número: ");
        numero = leia.nextInt();

        if (numero % 5 == 0){
            System.out.println("É múltiplo de 5");
        }
        else {
            System.out.println("Não é múltiplo de 5");
        }
    }
}
