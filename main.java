 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;


/**
 *
 * @author Etec
 */
public class media {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        double media;
        
        System.out.print("Digite a sua nota: ");
        if (leia.hasNextDouble()){
            nota1 = leia.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.print("A nota deve ser entre 0 e 10: ");
                nota1 = leia.nextDouble();
            }
        }        
        System.out.print("Digite a sua nota: ");
        if (leia.hasNextDouble()){
            nota2 = leia.nextDouble();       
            while (nota2 < 0 || nota2 > 10) {
                System.out.print("A nota deve ser entre 0 e 10: ");
                nota2 = leia.nextDouble();
            }
        }
        
        media = (nota1 + nota2) / 2;
                
        if (media <= 3) {
            System.out.print("Reprovado");
        }
        else if (media <= 6){
            System.out.print("Recuperação");
        }
        else {
            System.out.print("Aprovado");
        }
        leia.close();
    }
}
