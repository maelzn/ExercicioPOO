package br.com.exercicio_30set_2;

// Classe Coelho
public class Coelho extends Animal {
    private String corPelo;

    public Coelho(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: cenoura!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do pelo: " + corPelo);
    }

    public void pular() {
        System.out.println(nome + " está pulando!");
    }
}