package Lista1Java;
import java.util.Scanner;
public class ConverterTemperatura {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double celsius;
        double fah;

        System.out.print("Digite a temperatura em Celsius (C): ");
        celsius = leia.nextFloat();

        fah = (1.8 * celsius) + 32;

        System.out.print("O valor em Fahrenheit (F) é de " + fah);
    }
}
