import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {

        /* Instanciando novo Carro e nova Moto. */
        Carro c1 = new Carro("Volkswagen", "gol", 2020, 20, 13.3);
        Moto m1 = new Moto("Honda", "CG", 2021, 50, 32);

        /* Adicionando veiculos a Lista <Frota> */
        ArrayList<Veiculo> Frota = new ArrayList<>();

        Frota.add(c1);
        Frota.add(m1);

        /* Teste com carro. */
        c1.mostrarDetalhes();
        c1.exibirAutonomia();
        c1.frear();
        c1.acelerar();
        c1.realizarViagem(250);
        c1.precisaAbastecimento();
        System.out.println();

        /* Teste com moto. */
        m1.mostrarDetalhes();
        m1.exibirAutonomia();
        m1.acelerar();
        m1.frear();
        m1.acelerar();
        m1.realizarViagem(600);
        m1.precisaAbastecimento();

        System.out.println();

        /* Mostrar todos os veiculos da Lista-Frota */
        System.out.println("Veículos da frota: ");
        for (Veiculo v : Frota) {
            System.out.println("Marca: " + v.getMarca() + ", Modelo: " + v.getModelo());
        }

        /* Remove carro C1 da frota. */
        Frota.remove(c1);
        System.out.println();

        System.out.println("Veiculos da Frota(atualizada): ");
        for (Veiculo v : Frota) {
            System.out.println("Marca: " + v.getMarca() + ", Modelo: " + v.getModelo());
        }
    }

}
