package br.com.exercicio_30set;

public class Onibus extends Veiculo {
    private int numeroAssentos;
    private boolean possuiBanheiro;

    public Onibus(String marca, String modelo, int ano, int numeroAssentos, boolean possuiBanheiro) {
        super(marca, modelo, ano);
        this.numeroAssentos = numeroAssentos;
        this.possuiBanheiro = possuiBanheiro;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de assentos: " + numeroAssentos);
        System.out.println("Possui banheiro: " + (possuiBanheiro ? "Sim" : "Não"));
    }

    public void abrirPorta() {
        System.out.println("Portas do ônibus abertas!");
    }
}