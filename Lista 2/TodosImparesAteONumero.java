package Lista2Java;

import java.util.Scanner;

public class TodosImparesAteONumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero");
        numero = leia.nextInt();

        for(int i = 1; i <= numero; i++){
            if(i % 2 != 0){
                System.out.println(i + " <--- Ímpar");
            }
            leia.close();
        }
    }
}
