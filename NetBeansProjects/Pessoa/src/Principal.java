/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlos.ahjunior
 */
public class Principal {
  public static void main(String[] args) {
    Pessoa meusDados = new Pessoa();

    meusDados.setNome("Carlos");
    meusDados.setIdade(20);
    meusDados.setEstadoCivil("Solteiro");
    meusDados.setData("19/02/2003");
    meusDados.setCPF("871.969.680-93");
    meusDados.setRG("121908288/99");
    

    System.out.println("Nome: " + meusDados.getNome());
    System.out.println("Idade: " + meusDados.getIdade() + " Anos ");
    System.out.println("Estados " + meusDados.getEstadoCivil());
    System.out.println("Data de Nascimento: " + meusDados.getData());
    System.out.println("CPF: " + meusDados.getCPF());
    System.out.println("RG: " + meusDados.getRG());
  }  
}
