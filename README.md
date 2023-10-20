# atividadejava
```Java
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carli
 */
public class agenda {
    private String Agenda;
 
    
    String getAgenda(){
    return Agenda;
    }
    
    public String setAgenda(String Agenda){
    return this.Agenda = Agenda;
    }
}






}


public class Principal {
  public static void main(String[] args) {
    Pessoa meusDados = new Pessoa();
    agenda telefone = new agenda();

    meusDados.setNome("Carlos");
    meusDados.setIdade(20);
    meusDados.setEstadoCivil("Solteiro");
    meusDados.setData("19/02/2003");
    meusDados.setCPF("871.969.680-93");
    meusDados.setRG("121908288/99");
    telefone.setAgenda("996156506");
    

    System.out.println("Nome: " + meusDados.getNome());
    System.out.println("Idade: " + meusDados.getIdade() + " Anos ");
    System.out.println("Estados " + meusDados.getEstadoCivil());
    System.out.println("Data de Nascimento: " + meusDados.getData());
    System .out.println("Telefone" + telefone.getAgenda());
    System.out.println("CPF: " + meusDados.getCPF());
    System.out.println("RG: " + meusDados.getRG());
  }  
}

```
