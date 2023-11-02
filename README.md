# atividadejava
```Java
//class Dados

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carli
 */
public class Dados {
    private String Nome;
    private int Idade;

    String getNome(){
    return Nome;
    }
    
    int getIdade(){
        return Idade;
    }
    
    public String setNome(String Nome){
        return this.Nome = Nome;
    }
    
    public int setIdade(int Idade){
    return this.Idade =Idade;
    }
    
    }
    

//class agenda

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


//estudante

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carli
 */
public class estudante extends pessoa{
    private String Curso;
    private int ano;
    private int  Matricula;
    
    public estudante(String Nome, String Curso, int ano, int Matricula){
        super(Nome);
        this.Curso = Curso;
        this.ano = ano;
        this.Matricula = Matricula;
    }
    
    @Override
public String toString() {
    
   
return "funcionarios [nome=" + this.getNome() + ", Curso=" + Curso + ", Ano=" + ano + ", Matricula=" + Matricula + "]";
}
    
    String getCurso(){
    return Curso;
    }
    int getano(){
    return ano;
    }
    int getMatricula(){
    return Matricula;
    }
    
   public String setcurso(String Curso){
   return this.Curso = Curso;
   }
   
   public int setano(int ano){
   return this.ano = ano;
   }
   
   public int setMatricula(int Matricula){
   return this.Matricula = Matricula;
   }
   
}
//funcionario

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carli
 */
public class funcionarios extends pessoa{
    private String cargo;
    private String departamento;
    private  int Salario;
     
    public funcionarios(String Nome, String cargo, String departamento, int Salario) {
        super(Nome); // Chama o construtor da classe Pessoa com o nome
        this.cargo = cargo;
        this.departamento = departamento;
        this.Salario = Salario;
    }
    
 @Override
public String toString() {
    
   
return "funcionarios [nome=" + this.getNome() + ", cargo=" + cargo + ", departamento=" + departamento + ", Salario=" + Salario + "]";
}

    


    
    String getcargo(){
    return cargo;
    }
    
    public String setcargo(String cargo){
    return this.cargo = cargo;
    }
    
    String getdepartamento(){
    return departamento;
    }
    
    public String setdepartamento(String departamento){
    return this.departamento = departamento;
    }
    
    int getSalario(){
    return Salario;
    }
    
    public int setSalario(int Salario){
    return this.Salario = Salario;
    }
   
//class pessoa

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carli
 */
public class pessoa{
    private String Nome;
    
  public pessoa(String Nome){
  this.Nome = Nome;
  }
    String getNome(){
    return Nome;
    }
    
    public String setNome(String Nome){
    return this.Nome = Nome;
    }
}
//principal

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carli
 */
public class Principal {
    public static void main(String[] args) {
        Dados meusdados = new Dados();
        agenda telefone = new agenda();
        estudante estudantes = new estudante("Carlos Hardman", "TI", 20, 2023);
        funcionarios funcionario = new funcionarios("Carlos Hardman","Ajudante","sala A",1000);
        

        
        meusdados.setNome("Carlos Hardman");
        meusdados.setIdade(20);
        telefone.setAgenda("996156506");
        
        System.out.println("Nome: " + meusdados.getNome());
        System.out.println("Idade: " + meusdados.getIdade());
        System .out.println("Telefone" + telefone.getAgenda());
         System.out.println("Nome: " + estudantes.getNome());
        System.out.println("curso: " + estudantes.getCurso());
        System.out.println("Matricula: " + estudantes.getMatricula());


    }
}


    
    

   
}


```
