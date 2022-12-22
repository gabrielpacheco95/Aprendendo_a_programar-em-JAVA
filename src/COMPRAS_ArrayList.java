
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
public class COMPRAS_ArrayList {

    static ArrayList<String> listaCompras = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {//INICIO DO MAIN

        System.out.println(" Lista de Compras ");
        int opM;
        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 0:
                    System.out.println("Aplicação encerrada");
                    break;
                default:
                     System.out.println("Opção Inválida, tente novamente");
                    break;
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    imprimirLista();
                    break;

            }
        } while (opM != 0);
    }//FIM DO MAIN

    public static void menu() {
        System.out.println("0 - sair");
        System.out.println("Lista de Compras");
        System.out.println("1 - adicionar");
        System.out.println("2 - Remover Itens");
        System.out.println("3 Lista em orem");
        System.out.print("Digite aqui: ");
    }// Fim do Menu

    public static void addItem() {
        String add;
        do {
            System.out.print("Digite o item aqui:");
            listaCompras.add(leia.next());
            System.out.println("Deseja adicionar mais itens? S/N");
            add = leia.next();
        } while (add.equalsIgnoreCase("s"));
    }//Fim do add item

    public static void removeItem() {
        String add;
        do {
            System.out.print("Digite o item a ser removido:");
            listaCompras.remove(leia.next());
            System.out.println("Deseja remover mais itens? S/N");
            add = leia.next();
        } while (add.equalsIgnoreCase("s"));

    }//fim do Remover Itens

    public static void imprimirLista() {
        System.out.println("Itens da Lista:.");
        Collections.sort(listaCompras);
        for (String listaCompra : listaCompras) {
            System.out.println(" " + listaCompra);
        }

    }//fim do imprimir lista
}
