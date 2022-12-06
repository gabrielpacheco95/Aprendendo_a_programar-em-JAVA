/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import java.util.Scanner;

/**
 *
 * @author 311101245
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float altura, peso, IMC;
        String nome;

        System.out.println("CALCULADORA DE IMC");
        System.out.print("Infome seu nome: ");
        nome = leia.next();
        System.out.print("Infome sua altura: ");
        altura = leia.nextFloat();
        System.out.print("Infome seu peso: ");
        peso = leia.nextFloat();
        IMC = peso / (altura * altura);
        System.out.println("Seu IMC é:  " + IMC);
        if (IMC <= 18.5) {
            System.out.println("Abaixo do Peso");
        } else if (IMC <= 24.9) {;
            System.out.println("Peso Ideal");
        } else if (IMC < +29.9) {
            System.out.println("Levemente Acima do Peso");
        } else if (IMC <= 34.9) {
            System.out.println("Obesidade Grau 1");
        } else if (IMC <= 39.9) {
            System.out.println("Obesidade Grau 2 ");
        } else {
            System.out.println("Obesidade Grau 3");
        }

    }
}
