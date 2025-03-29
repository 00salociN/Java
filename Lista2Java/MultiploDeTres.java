package Lista2Java;

import java.util.Scanner;

public class MultiploDeTres {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("Digite o número: ");
        numero = leia.nextInt();

        if (numero % 3 == 0){
            System.out.println("É múltiplo de 3");
        }
        else {
            System.out.println("Não é múltiplo de 3");
        }
    }
}
