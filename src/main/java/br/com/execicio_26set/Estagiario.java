package br.com.execicio_26set;

public class



Estagiario extends Funcionario {

    private int horasTrabalhadas;
    private Double valorHoraTrabalhada;


    public Estagiario(String nome, String matricula, Double valorHoraTrabalhada){
        super(nome, matricula, 0.0);
        this.horasTrabalhadas = 0;
        this.valorHoraTrabalhada = valorHoraTrabalhada;}


    public void registrarHoras(int horasTrabalhadas){
        this.horasTrabalhadas += horasTrabalhadas;
    }




    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHoraTrabalhada;
    }
}
