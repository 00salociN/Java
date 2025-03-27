package Lista1Java;
import java.util.Scanner;

public class NumeroFatorial {
    public static void main(String[] args) {
        
    Scanner leia = new Scanner(System.in);
    int numero;
    double fat = 1;
    System.out.print("Digite um número: ");
    numero = leia.nextInt();

    for (int i = numero; i > 1; i--) {
        fat *= i;
        System.out.println(fat);
    }

}
}
