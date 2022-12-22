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
public class Aluno {
   private String  nome;
   private int RG;
   private int CPF;
   private String Sexo;
   private String Pele;
   private int idade;
   
 public Aluno(){
         
    }

    public Aluno(String nome, int RG, int CPF, String Sexo, String Pele, int idade) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.Sexo = Sexo;
        this.Pele = Pele;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getPele() {
        return Pele;
    }

    public void setPele(String Pele) {
        this.Pele = Pele;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Classe_Aluno{" + "nome=" + nome + ", RG=" + RG + ", CPF=" + CPF + ", Sexo=" + Sexo + ", Pele=" + Pele + ", idade=" + idade + '}';
    }
 
                
    
}
