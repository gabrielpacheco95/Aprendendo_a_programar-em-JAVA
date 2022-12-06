
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 311101245
 */
public class Medias_Escolares_vetor_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Notas Escolares");
        System.out.println("Quantidade de notas a inserir: ");
        int nNotas = (int) leiaFloat();
        float notas[] = new float[nNotas + 1];
        for (int i = 0; i < nNotas; i++) {
            do {

                System.out.println("Informe a" + (i + 1) + "ª nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota inválida");
                }
            } while (validaNota(notas[i]));
            notas[nNotas] += notas[i]; //Acumula notas
        }// fim do for
        notas[nNotas] = notas[nNotas] /nNotas; //Faz a média
        System.out.print("Sua média foi de" + notas[nNotas]);
        if (notas[nNotas] >= 7) {
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
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("Valor não é um número, Tente novamente");
            return leiaFloat();
        }
    }//fim do leia Float
}
