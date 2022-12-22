
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
public class TRIANGULOS {

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        int opM;
        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    VerificaTriangulo();
                    break;
                case 0:
                    System.out.println("Aplicaçõ encerrada:");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opM != 0);

    }//fim da main

    public static void menu() {
        System.out.println("Verifica Trângulo");
        System.out.println("1 - verificar");
        System.out.println("0 - sair");
        System.out.print("Digite aqui: ");
    }//fim do menu

    public static void VerificaTriangulo() {
        int A, B, C;

        //Capturando os dados do teclado		
        System.out.println("Digite um lado do triângulo:");
        A = leia.nextInt();
        System.out.println("Digite o segundo lado do triângulo: ");
        B = leia.nextInt();
        System.out.println("Digite uo terceiro lado do triângulo: ");
        C = leia.nextInt(); //Processamento e saída de dados

        //Processamento e saí­da de dados
        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if ((A == B) && (B == C)) {
                System.out.println("Os valores formam um triângulo: Equilátero!");
            }//fim se de todos lados iguais
            else {
                if ((A == B) && (A == C) || (B == C)) {
                    System.out.println("Os valores formam um triângulo: Isósceles!");
                }//fim se para dois lados iguais
                else {
                    System.out.println("Os valores formam um triângulo: Escaleno!");
                }//fim se não para dois lados iguais		  	  	  
            }//fim se não de todos lados iguais

        } else {
            System.out.println("Estes valores não formam um triângulo");
        }//fim senÃ£o se Ã© triÃ¢ngulo
    }
}
