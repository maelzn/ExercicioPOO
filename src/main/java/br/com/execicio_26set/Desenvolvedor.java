package br.com.execicio_26set;

public class Desenvolvedor extends Funcionario {

    private int horasExtras;
    private Double valorHoraExtra;


    //construtor

    public Desenvolvedor(String nome,
                         String matricula,
                         double salarioBase,
                         int horasExtras,
                         Double valorHoraExtra){
        super(nome,matricula,salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase +(valorHoraExtra * horasExtras);
    }


    public void registrarHoraExtra(int horasExtras){
        this.horasExtras += horasExtras;
    }






}




