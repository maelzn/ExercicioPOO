package br.com.execicio_26set;

public abstract class Funcionario {
    protected  String nome;
    protected String matricula;
    protected Double salarioBase;


    //construtor


    public Funcionario(String nome,String matricula, Double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getnome(){return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    //metodo abstrato para ser implementado nas subclasses
    public abstract double calcularSalario();



    //metodo abstrato deve ser implantado pelas subclasses
    public void exibirDados(){

        System.out.println("Nome:" + nome);
        System.out.println("Matricula:" + matricula);
        System.out.println("Salario Final R$"+ calcularSalario());
    }























}







