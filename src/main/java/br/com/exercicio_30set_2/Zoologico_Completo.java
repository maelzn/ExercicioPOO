package br.com.exercicio_30set_2;

public class Zoologico_Completo {
    public static void main(String[] args) {
        Animal[] animais = {
                new Cachorro("Rex", 3, "Labrador"),
                new Gato("Mimi", 2, true),
                new Passaro("Piu", 1, 15.5),
                new Coelho("Bunny", 1, "Branco"),
                new Cavalo("Relâmpago", 5, "Quarto de Milha")
        };

        System.out.println("=== SOM DOS ANIMAIS ===");
        for (Animal animal : animais) {
            animal.emitirSom();
        }

        System.out.println("\n=== MOVIMENTO ===");
        for (Animal animal : animais) {
            animal.mover();
        }

        System.out.println("\n=== INFORMAÇÕES DETALHADAS ===");
        for (Animal animal : animais) {
            animal.exibirInfo();


            if (animal instanceof Cachorro cachorro) {
                cachorro.abanarRabo();
            } else if (animal instanceof Coelho coelho) {
                coelho.pular();
            } else if (animal instanceof Cavalo cavalo) {
                cavalo.correr();
            }

            System.out.println("---");
        }
    }
}
