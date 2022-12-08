
import java.util.ArrayList;
import java.util.Collections;
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
public class ArrayList_Inicio {

    public static void main(String[] args) {//INICIO DO MAIN
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Tamanho do array: " + nomes.size());
        nomes.add("gabriel");
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println("digite um Nome: ");
        nomes.add(leia.next());
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        nomes.add(0, "jubileu");
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        nomes.add(3, "joel");
        System.out.println("Tamanho do array: " + nomes.size());
        System.out.println(nomes.toString());
        System.out.println("Impressão do Array");
        for (String nome : nomes) {
            System.out.println("Nome:" + nome);
            System.out.println("ArrayList vazio?");
            System.out.println(nome.isEmpty());
            System.out.println("Index do jubileu é" + nomes.indexOf("jubileu"));            
        }
        System.out.println("Ordenação de Array");
            nomes.add("pastel");
            nomes.add("coxinha");
            nomes.add("empada");
            nomes.add("pizza");
            System.out.println("sem ordenação: " + nomes.toString());
            //ordenação
            Collections.sort(nomes);
            System.out.println("Ordenado: " + nomes.toString());

            nomes.remove("pastel");
            Collections.sort(nomes);
            System.out.println("nomes sem o pastel: " +nomes.toString());
    }//FIM DO MAIN

}