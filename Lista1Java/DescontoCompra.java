package Lista1Java;
import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor, desconto, fina;

        System.out.print("Digite o valor da compra: ");
        valor = leia.nextFloat();

        desconto = valor * 0.1;
        fina = valor - desconto;
        

        System.out.print("O valor com desconto é de R$" + fina);
    }
    
}
