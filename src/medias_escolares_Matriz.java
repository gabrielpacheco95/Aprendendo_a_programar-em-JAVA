
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
public class medias_escolares_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos Alunos:");
        int nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas: ");
        int nNotas = (int) leiaFloat();
        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];
//nNotas +1 para ter uma posição para guardar a média
        for (int i = 0; i < nAlunos; i++) { //percorre os alunos
            System.out.print("Nome do Aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("Digitea" + (j + 1) + "ª nota:");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j]));
                    System.out.println("Nota inválida!");
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j]; // acumula as notas
            }// fim do notas
            notas[i][nNotas] = notas[i][nNotas] / nNotas;// calcula média

        }//fim do for alunos
        System.out.println("\n---Resultado---\n");
        for (int i = 0; i < nAlunos; i++) {//impressão no console
            System.out.printf(alunos[i] + ", Sua média doi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(", e você aprovou!");
            } else {
                System.out.println(", e foi reprovado!");
            }
        }
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
