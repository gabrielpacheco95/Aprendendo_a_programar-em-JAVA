/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import model.Carro;

/**
 *
 * @author 311101245
 */
public class POO { //Programação orientada a Objeto (parte do projeto do carro)

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ctr + espaço mostra as pções
        Carro car1 = new Carro("abc1234", 321, "fiat", "palio", 2008, 2009, 1.0f, "manual", "hidráulica");
//o tipo do motor é um float, por isso fica 1.0f
        System.out.println("carro 1:" + car1.toString());
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Placa: " + car1.getPlaca());

        System.out.println("------------------");
        Scanner leia = new Scanner(System.in);

        String placa;
        int renavam;
        String marca;
        String modelo;
        int anoFabricacao;
        int anoModelo;
        float motorizacao;
        String tpcambio;
        String tpDirecao;

        System.out.print("Informe a placa: ");
        placa = leia.next();
        System.out.print("Informe o renavan em números: ");
        renavam = leia.nextInt();
        System.out.print("Informe a marca: ");
        marca = leia.nextLine();
        System.out.print("Informe o modelo: ");
        modelo = leia.next();
        System.out.print("Informe o ano de Fabricação: ");
        anoFabricacao = leia.nextInt();
        System.out.print("Informe ano Modelo: ");
        anoModelo = leia.nextInt();
        System.out.print("Informe a motorização do carro: ");
        motorizacao = leia.nextFloat();
        System.out.print("Informe o tipo de Câmbio: ");
        tpcambio = leia.next();
        System.out.print("Informe o tipo de direção: ");
        tpDirecao = leia.next();

        Carro Car2 = new Carro(placa, renavam, marca, modelo, anoFabricacao, anoModelo, motorizacao, tpcambio, tpDirecao);
        System.out.println("Carro 2:" + Car2.toString());

        Carro car3 = new Carro(); //Construtor vazio
        car3.setPlaca("ior7157");
        car3.setRenavam(321);
        car3.setMarca("fiat");
        car3.setModelo("uno");
        car3.setAnoFabricacao(2014);
        car3.setAnoModelo(2014);
        car3.setMotorizacao(1.0f);
        car3.setTpDirecao("Hidraulica");
        car3.setTpcambio("Automático");
        System.out.println("Carro 3:"
                + car3.getMarca()
                + "|" + car3.getModelo());

        ArrayList<Carro> listaCarros = new ArrayList();
        listaCarros.add(car1);
        listaCarros.add(Car2);
        listaCarros.add(car3);

        for (Carro car : listaCarros) {
            System.out.println("Placa: " + car.getPlaca()
                    + "\nModelo" + car.getModelo());
        }

        System.out.println("LISTA SEM O CAR 2");
        listaCarros.remove(Car2);
        for (Carro car : listaCarros) {
            System.out.println("Placa: " + car.getPlaca()
                    + "\nModelo" + car.getModelo());

        }

    }//fim da main

}
