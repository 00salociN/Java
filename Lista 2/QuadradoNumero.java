package Lista2Java;
import java.util.Scanner;

public class QuadradoNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int numero, quad;

        System.out.print("Digite o nº: ");
        numero = leia.nextInt();

        quad = numero * numero;

        System.out.print(quad);

    }
    
}
