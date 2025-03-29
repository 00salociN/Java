package Lista1Java;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ano;

        System.out.print("Digite o ano que deseja saber se é bissexto ou não: ");
        ano = leia.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.print("É um ano bissexto");
        }
        else {
            System.out.print("Não é um ano bissexto");
        }
    }
}
