package Lista1Java;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        double bruto, liquido, desconto;

        System.out.print("Digite o seu salário bruto: ");
        bruto = leia.nextFloat();
        System.out.println("Digite o valor dos descontos: ");
        desconto = leia.nextFloat();

        liquido = bruto - desconto;

        System.out.print("O seu salário liquido é de R$" + liquido);
        
    }
}
