import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        /* Instanciando novo Carro e nova Moto. */
        Carro c1 = new Carro("Vw", "gol", 2020, 20, 13.3);
        Moto m1 = new Moto("Honda", "CG", 2021, 50, 32);

        /* Adicionando veiculos a Lista <Frota> */
        ArrayList<Veiculo> Frota = new ArrayList<>();

        Frota.add(c1);
        Frota.add(m1);

        /* Teste com carro. */
        System.out.println("Teste com carro: \n");
        c1.mostrarDetalhes();
        c1.acelerar();
        c1.acelerar();
        c1.calcularAutonomia();
        c1.realizarViagem(2000);
        c1.calcularAutonomia();
        System.out.println();

        /* Teste com moto. */
        System.out.println("Teste com moto: \n");
        m1.mostrarDetalhes();
        m1.acelerar();
        m1.freiar();
        m1.acelerar();
        m1.calcularAutonomia();
        m1.realizarViagem(600);

        System.out.println();

        for (Veiculo v : Frota) {
            System.out.println(v.getModelo());
        }

    }

}
