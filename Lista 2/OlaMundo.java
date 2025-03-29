package Lista2Java;
import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = leia.nextInt();

        System.out.print("Olá mundo " + num);
    
}
}

