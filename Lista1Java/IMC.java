package Lista1Java;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double peso;
        double altura;
        double IMC;

        System.out.print("Digite a sua altuta em metros (M): ");
        altura = leia.nextFloat();
        System.out.print("Digite o seu peso em quilogramas (Kg): ");
        peso = leia.nextFloat();

        IMC = peso / (altura * altura);
        System.out.println("O seu IMC é de " + IMC);

        if (IMC < 18.5){
            System.out.println("Está classificado(a) com Magreza");
        }
        else if (IMC >= 18.5 || IMC <= 24.9){
            System.out.print("Está classificado(a) como Normal");
        }
        else if (IMC >= 25 || IMC <= 29.9 ){
            System.out.print("Está classificado(a) com Sobre Peso (Grau I)");
        }
        else if (IMC >= 30 || IMC <= 39.9){
            System.out.print("Está classificado(a) com Obsidade (Grau II)");
        }
        else if (IMC >= 40){
            System.out.print("Está classificado(a) com Obsidade Grave (Grau III)");
        }

    }
    
}
