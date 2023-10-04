/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos.ahjunior
 */
public class Pessoa{
    private String Nome;
    private String EstadoCivil;
    private String Data;
    private String CPF;
    private String RG;
    private int Idade;

    String getNome(){
        return Nome;
    }

    int getIdade(){
        return Idade;
    }

    String getEstadoCivil(){
        return EstadoCivil;
    }

    String getData(){
        return Data;
    }

    String getCPF(){
        return CPF;
    }

    String getRG(){
        return RG;
    }

    public String setNome(String Nome){
        return this.Nome = Nome;
    }

    public int setIdade(int Idade){
        return this.Idade = Idade;
    }

    public String setEstadoCivil(String EstadoCivil){
        return this.EstadoCivil = EstadoCivil;
    }

    public String setData(String Data){
        return this.Data = Data;
    }
    public String setCPF(String CPF){
        return this.CPF = CPF;
    }

    public String setRG(String RG){
        return this.RG = RG;
    }

}

