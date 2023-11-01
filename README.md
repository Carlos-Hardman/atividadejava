# atividadejava
```Java
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String departamento;

    public Funcionario(String nome, int idade, double salario, String cargo, String departamento) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Cargo: " + cargo + ", Departamento: " + departamento;
    }
}

class Estudante extends Pessoa {
    private String curso;
    private int matricula;
    private int ano;

    public Estudante(String nome, int idade, String curso, int matricula, int ano) {
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.ano = ano;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso + ", Matrícula: " + matricula + ", Ano: " + ano;
    }
}

class Agenda {
    private ArrayList<Pessoa> contatos = new ArrayList<>();

    public void adicionarContato(Pessoa pessoa) {
        contatos.add(pessoa);
    }

    public void buscarFuncionariosPorDepartamento(String departamento) {
        for (Pessoa contato : contatos) {
            if (contato instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) contato;
                if (funcionario.getDepartamento().equals(departamento)) {
                    System.out.println(funcionario);
                }
            }
        }
    }

    public double calcularSalarioMedioFuncionarios() {
        double somaSalarios = 0;
        int contadorFuncionarios = 0;
        for (Pessoa contato : contatos) {
            if (contato instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) contato;
                somaSalarios += funcionario.getSalario();
                contadorFuncionarios++;
            }
        }
        return contadorFuncionarios > 0 ? somaSalarios / contadorFuncionarios : 0;
    }
}

public class Principal {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Pessoa pessoa = new Pessoa("João", 30);
        Funcionario funcionario = new Funcionario("Maria", 35, 5000, "Gerente", "RH");
        Estudante estudante = new Estudante("Lucas", 20, "Engenharia", 12345, 2023);

        agenda.adicionarContato(pessoa);
        agenda.adicionarContato(funcionario);
        agenda.adicionarContato(estudante);

        System.out.println("Contatos na Agenda:");
        for (Pessoa contato : agenda.getContatos()) {
            System.out.println(contato);
        }

        System.out.println("\nFuncionários do Departamento 'RH':");
        agenda.buscarFuncionariosPorDepartamento("RH");

        double salarioMedio = agenda.calcularSalarioMedioFuncionarios();
        System.out.println("\nSalário Médio dos Funcionários: " + salarioMedio);
    }
}


```
