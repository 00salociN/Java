package Lista1Java;
import java.util.Scanner;
public class VerificaIdade {
    public static void main (String args[]){ 
        Scanner leia = new Scanner(System.in); 
        int idade = 0; 
        String nome = ""; 
 

        System.out.print("Por favor, informe o seu nome: "); 
        nome = leia.nextLine(); 
        System.out.print("Prazer " + nome + "! Qual a sua idade: "); 
        idade = leia.nextInt(); 
 

        if (idade >= 16){ 
            System.out.println("Você já pode votar"); 
        } 
        else { 
            System.out.println("Você não pode votar"); 
        } 
    } 
} 

