# atividadejava
```Java
public class Pessoa {
   private String Nome;
     private int Idade;

    public int setIdade(int Idade) {
       return  this.Idade = Idade;
    }
    
      public String setNome(String Nome) {
       return  this.Nome = Nome;
    }
   
    String getNome(){    
            return Nome;
        }
    
    int getIdade(){      
            return Idade;
        }
}

public class Principal {
    public static void main(String[] args) {
        Pessoa dados = new Pessoa();
              
        dados.setNome("Carlos");
        dados.setIdade(20);

        System.out.println(dados.getNome());
         System.out.println(dados.getIdade());

        
    }
}
```
