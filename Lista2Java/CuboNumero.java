package Lista2Java;
import java.util.Scanner;

public class CuboNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int numero, cub;

        System.out.print("Digite o nº: ");
        numero = leia.nextInt();

        cub = numero * numero * numero;

        System.out.print(cub);

    }
    
}
