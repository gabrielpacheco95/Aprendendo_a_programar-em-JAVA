
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
public class Medias_com_menu {
//Declaração global

    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        System.out.println("Notas Escolares Matriz");
        System.out.print("Quantos Alunos:");
        nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas: ");
        nNotas = (int) leiaFloat();
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1]; //static float
//nNotas +1 para ter uma posição para guardar a média

        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }// fim do switch

        } while (opM != 0);
    }

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

    public static void menu() {
        System.out.println("1- Inserir nota do Aluno");
        System.out.println("2- imprimir notas");
        System.out.println("0- Sair");
        System.out.println("Digite aqui: ");
    }//fim do menu

    public static void inserirAlunoNotas() {
        Scanner leia = new Scanner(System.in);
        if (contAlunos < nAlunos) { //percorre os alunos
            System.out.print("Nome do Aluno: ");
            alunos[contAlunos] = leia.next();
            for (int j = 0; j < nNotas; j++) {//percorre as notas
                do {
                    System.out.print("Digitea" + (j + 1) + "ª nota:");
                    notas[contAlunos][j] = leiaFloat();
                    if (validaNota(notas[contAlunos][j])) {
                        System.out.println("Nota inválida!");
                    }
                } while (validaNota(notas[contAlunos][j]));
                notas[contAlunos][nNotas] += notas[contAlunos][j]; // acumula as notas
            }// fim do notas
            notas[contAlunos][nNotas] = notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
            //calcula a média

        } else { //1ª chave é o fim do if (Se)
            System.out.println("Não é mais possível lançar notas"
                    + "\nTodas as posições estão ocupadas");
        } //fim do else(Senão)
    }// fim do inserir notas

    public static void imprimirAlunosNotas() {
        System.out.println("\n---Resultado---\n");
        for (int i = 0; i < contAlunos; i++) {//impressão no console
            System.out.printf(alunos[i] + "sua média foi de %.2f", notas[i][nNotas]);
            if (notas[i][nNotas] >= 7) {
                System.out.println(" e você aprovou.");
            } else {
                System.out.println(" e inflezmente você reprovou.");
            }
        }//fim do for
    }

}
