/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 311101245
 */
public class Carro { //atributos do Carro
private String placa;
private int renavam;
private String marca;
private String modelo;
private int anoFabricacao;
private int anoModelo;
private float motorizacao;
private String tpcambio;
private String tpDirecao;
/**
 * Construtor Vazio
 */
    public Carro() {//construtor vazio
    }
//inicializando os atributos (alt+Insert)
    public Carro(String placa, int renavam, String marca, String modelo, int anoFabricacao, int anoModelo, float motorizacao, String tpcambio, String tpDirecao) {
        this.placa = placa;
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.motorizacao = motorizacao;
        this.tpcambio = tpcambio;
        this.tpDirecao = tpDirecao;
    }

    public String getPlaca() { //O get recupera a informação (busca ela)
        return placa;
    }

    public void setPlaca(String placa) { // set= define as informações
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public float getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(float motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getTpcambio() {
        return tpcambio;
    }

    public void setTpcambio(String tpcambio) {
        this.tpcambio = tpcambio;
    }

    public String getTpDirecao() {
        return tpDirecao;
    }

    public void setTpDirecao(String tpDirecao) {
        this.tpDirecao = tpDirecao;
    }

    @Override //subescreve
    public String toString() {
        return "Carro{" + "placa=" + placa + ", renavam=" + renavam + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", motorizacao=" + motorizacao + ", tpcambio=" + tpcambio + ", tpDirecao=" + tpDirecao + '}';
    }



}
