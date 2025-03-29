package Lista2Java;

import java.util.Scanner;

public class TodosNumerosAteChegarNoDesejado {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.print("Digite o número: ");
        numero = leia.nextInt();

        for (int count = numero; count >= 1; count--){
            System.out.println(count);
        }
        leia.close();
    }
}
