package Lista2Java;

import java.util.Scanner;

public class SomaDeDoisMaiorQueCem {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, soma;

        System.out.print("Digite o valor do nº1: ");
        n1 = leia.nextInt();
        System.out.print("Digite o valor do nº2: ");
        n2 = leia.nextInt();

        soma = n1 + n2;

        if (soma > 100){
            System.out.println("A soma é maior do que 100");
        }
        else {
            System.out.println("A soma não é maior que 100");
        }
        leia.close();
    }
}
