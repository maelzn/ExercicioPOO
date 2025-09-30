package br.com.exercicio_30set;

public class Frota {
    public static void main(String[] args) {
        // Criando a frota com diferentes tipos de veículos
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Jetski("Yamaha", "WaveRunner", 2023, 2, true),
                new Onibus("Volvo", "7700", 2020, 50, true)
        };

        // Percorrendo a frota e exibindo informações
        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();

            // Ação específica dependendo do tipo
            if (veiculo instanceof Carro carro) {
                carro.abrirPortaMalas();
            } else if (veiculo instanceof Moto moto) {
                moto.empinar();
            } else if (veiculo instanceof Jetski jetski) {
                jetski.ligarMotor();
            } else if (veiculo instanceof Onibus onibus) {
                onibus.abrirPorta();
            }

            // Exemplo genérico de acelerar
            veiculo.acelerar(60);
            System.out.println("---");
        }
    }
}