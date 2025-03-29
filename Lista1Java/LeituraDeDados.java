package Lista1Java;
import java.util.Scanner; 

public class LeituraDeDados {
    public static void main (String args[]){ 

        Scanner leia = new Scanner(System.in); 
        int idade = 0;
        String nome = ""; 
    

        System.out.print("Por favor, informe o seu nome: "); 
        nome = leia.nextLine(); 
        System.out.print("Prazer " + nome + "! Qual a sua idade? "); 
        idade = leia.nextInt();


        System.out.print("Seja bem-vindo, " + nome + ". A sua idade é de: " + idade); 
    
    } 
}

