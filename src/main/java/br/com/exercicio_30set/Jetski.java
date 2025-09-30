package br.com.exercicio_30set;

// Classe Jetski
public class Jetski extends Veiculo {
    private int capacidadePessoas;
    private boolean ehRacing;

    public Jetski(String marca, String modelo, int ano, int capacidadePessoas, boolean ehRacing) {
        super(marca, modelo, ano);
        this.capacidadePessoas = capacidadePessoas;
        this.ehRacing = ehRacing;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de pessoas: " + capacidadePessoas);
        System.out.println("É racing: " + (ehRacing ? "Sim" : "Não"));
    }

    public void ligarMotor() {
        System.out.println("Motor do Jetski ligado!");
    }
}