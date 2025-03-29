package Lista1Java;
import java.util.Scanner;

public class NotaParaIRBMB {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota;

        System.out.print("Digite a sua nota: ");
        nota = leia.nextFloat();

        if (nota >= 0 && nota <= 4){
            System.out.print("I");
        }        
        if (nota >= 5 && nota <= 6){
            System.out.print("R");
        }        
        if (nota >= 7 && nota <= 8){
            System.out.print("B");
        }        
        if (nota >= 9 && nota <= 10){
            System.out.print("MB");
        }

    }
}
