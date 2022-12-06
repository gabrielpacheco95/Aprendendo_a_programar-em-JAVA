/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diasvida;

import java.util.Scanner;

/**
 *
 * @author 311101245
 */
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);
        float idade, Vida;
        String nome;
        
        System.out.println("Dias de Vida");
        System.out.print("Informe Seu Nome: ");
        nome = leia.next();
        System.out.print("Informe sua Idade: ");
        idade = leia.nextFloat();
        Vida = (idade) * 365;
        System.out.println("Seu tempo de vida é de " +Vida+ " dias");
    }
    
}
