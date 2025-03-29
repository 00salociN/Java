package Lista2Java;
import java.util.Scanner;

public class DoisNumerosSoma {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, soma;

        System.out.print("Digite o nº1: ");
        n1 = leia.nextInt();
        System.out.print("Digite o nº2: ");
        n2 = leia.nextInt();

        soma = n1 + n2;

        System.out.print(soma);

    }
}
