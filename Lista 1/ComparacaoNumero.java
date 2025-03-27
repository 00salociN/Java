package Lista1Java;
import java.util.Scanner;

public class ComparacaoNumero {
    public static void main (String args[]){ 

        Scanner leia = new Scanner(System.in); 
        int num = 0; 
        int ndois = 0; 


        System.out.print("Escreva o primeiro número: "); 
        num = leia.nextInt(); 
        System.out.print("Escreva o segundo número: "); 
        ndois = leia.nextInt(); 
 

        if (num > ndois) { 
            System.out.print("O número um é maior do que o número dois."); 
        } 
        else if (num == ndois) { 
            System.out.println("Eles são iguais"); 
        } 
        else { 
            System.out.print("O número dois é maior do que o número um"); 
        } 

 

    } 

}     
