import java.util.ArrayList;
import java.util.List;

public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    List<Veiculo> Frota = new ArrayList<>();

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public void calcularAutonomia() {
        double autonomia = combustivel * consumoMedio;
        System.out.println("Autonomia: " + autonomia);
    }

    public void realizarViagem(double distancia) {
        double autonomia = combustivel * consumoMedio;
        if (distancia > autonomia) {
            System.out.println("Impossível realizar a viagem!");
        } else {
            double consumido = distancia / consumoMedio;
            combustivel -= consumido;
            System.out.println("Viagem realizada com sucesso!");
            System.out.println("Restaram " + String.format("%.2f", combustivel) + " litros de gasolina no tanque.");
        }
    }

    public void mostrarDetalhes() {
        System.out
                .println("Marca = " + getMarca() + ", modelo = " + getModelo() + ", anoFabricacao = "
                        + getAnoFabricacao()
                        + ", combustivel = " + getCombustivel() + ", consumoMedio = " + getConsumoMedio());
    }

    public List<Veiculo> getFrota() {
        return Frota;

    }

    

}
