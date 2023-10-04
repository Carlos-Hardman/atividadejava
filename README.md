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

}


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

```
