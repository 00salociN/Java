package Lista1Java;
import java.util.Scanner;

public class DescobrirTriangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double l1, l2, l3;

        System.out.print("Digite o valor de um lado do triangulo: ");
        l1 = leia.nextFloat();
        System.out.print("Digite o valor de outro lado: ");
        l2 = leia.nextFloat();
        System.out.print("Digite o valor do lado restante: ");
        l3 = leia.nextFloat();

        if (l1 == l2 && l1 ==l3){
            System.out.println("É um triangulo equilátero");
        }
        else if (l1 != l2 && l1 != l3 && l2 != l3){
            System.out.print("É um triangulo escaleno");
        }
        else {
            System.out.print("É um triangulo isóceles");
        }

    }
}
