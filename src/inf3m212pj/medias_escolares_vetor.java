/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 *
 */
public class medias_escolares_vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5]; //Vetor de 5 posições
        System.out.println("Notas Escolares");
        for (int i = 0; i < 4; i++) {
            do {

                System.out.println("Informe a" + (i + 1) + "ª nota: ");
                notas[i] = leia.nextFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida");
                }
            } while (validaNota(notas[i]));// O || significa OU
            notas[4] += notas[i]; //Acumula notas
        }// fim do for
        notas[4] = notas[4] / 4; //Faz a média
        System.out.print("Sua média foi de" + notas[4]);
        if (notas[4] >= 7) {
            System.out.println("e foi aprovado.");
        } else {
            System.out.println("e foi reprovado.");
        }//fim do if
    }//fim do main

    /**
     * Função validaNota serve para validar as notas que estejam fora do
     * intervalo de 0-10
     *
     * @param nota
     * @return
     */
    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;

    }

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try{
            return leia.nextFloat();
        }catch(Exception e){
            System.out.println("Valor não é um número, Tente novamente");
            return leiaFloat();
        }
    }//fim do leia Float
}
