public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }

    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    public void freiar() {
        System.out.println("Moto freiando...");
    }

}
