package br.com.exercicio_30set_2;

public class Cavalo extends Animal {
    private String tipo; // por exemplo: "Puro-sangue", "Quarto de Milha"

    public Cavalo(String nome, int idade, String tipo) {
        super(nome, idade);
        this.tipo = tipo;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Katiaaaaallll!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: " + tipo);
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }
}
