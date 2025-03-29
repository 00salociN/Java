package Lista2Java;

import java.util.Scanner;

public class TabuadaDeTalNumero {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, mult;

        System.out.println("Digite o numero");
        numero = leia.nextInt();

        for(int i = 1; i <= 10; i++){
            mult = i * numero;
            System.out.println(i + " x " + numero + " = " + mult);
        }
        leia.close();
    }
}
