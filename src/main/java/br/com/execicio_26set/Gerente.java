package br.com.execicio_26set;

public class Gerente extends Funcionario{
   private double bonusPerformace;
   private double comissao;

   public Gerente(String nome, String matricula, Double salarioBase ){
       super(nome,matricula,salarioBase);
       this.bonusPerformace = 0.0;
       this.comissao = 0.0;

   }

    public double getBonusPerformace() {
        return bonusPerformace;
    }

    public void setBonusPerformace(double bonusPerformace) {
        this.bonusPerformace = bonusPerformace;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }





    @Override
    public double calcularSalario() {
        return salarioBase + bonusPerformace * comissao;
    }
}
