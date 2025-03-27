package Lista1Java;
import java.util.Scanner;

public class MenorEMaiorValor {
    public static void main(String[] args) {
        
    
    Scanner leia = new Scanner(System.in); 
    double num, ndois, ntres;

    System.out.print("Digite o primeiro número: ");
    num = leia.nextFloat();

    System.out.print("Digite o segundo número: ");
    ndois = leia.nextFloat();

    System.out.print("Digite o terceiro número: ");
    ntres = leia.nextFloat();


    if (num > ndois && num > ntres && ndois > ntres){
        System.out.println("O nº1 é o maior número");
        System.out.println("O nº3 três é o menor número");
    } 
    else if (ndois > num && ndois > ntres && num > ntres){
        System.out.print("O nº2 é o maior número");
        System.out.print("O nº3 será o menor");
    }
    else if (ntres > num && ntres > ndois && ntres > num){
        System.out.print("O nº3 é o maior");
        System.out.print("O nº1 é o menor");
    }
    else if ()
    }
}