/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author 311101245
 */
public class MEDIA_ESCOLAR { // EQUIVALE AO PROGRAMA DO PORTUGOL

    /**
     * Nesta área posso definir as variáveis globais
     *
     * @param args
     */
    public static void main(String[] args) {
//TODO code application ligic here
// Nesta área posso definir as variáveis locais
        float nota1, nota2, nota3, nota4, media;
        Scanner leia = new Scanner(System.in);
        System.out.println("NOTAS ESCOLHARES");
        System.out.print("Infome a 1ª nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Infome a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Infome a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Infome a 4ª nota: ");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média foi de " + media);
        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Infelizmente você reprovou!");
        }
    }
}
