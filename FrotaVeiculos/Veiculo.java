import java.util.Locale;

public class Veiculo {
    /* Atributos da classe */
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    /* Construtor padrão */
    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }

    /* Todos os Geter e Seters */
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

    /* Método calcularAutonomia para uso interno em outros métodos. */
    public double calcularAutonomia() {
        return combustivel * consumoMedio;
    }

    /* Método exibir autonomia para imprima-la somente. */
    public void exibirAutonomia() {
        /* Uso de String.format para setar 2 casas decimais e Locale.US para usar ponto ao invés de vírgula. */
        System.out.println("Autonomia: " + (String.format(Locale.US, "%.2f", calcularAutonomia())) + " km.");
    }

    /* Método precisaAbastecimento com boolean e If ternário direto na mensagem. */
    public void precisaAbastecimento() {
        boolean abastecer = false;
        if (calcularAutonomia() < 30) {
            abastecer = true;
        }
        System.out.println("Precisa de abastecimento: " + (abastecer ? "Sim" : "Não"));
    }

    /*
     * Método realizar Viagem, calcula autonomia e compara com a distancia para
     * exibir o resultado.
     */
    public void realizarViagem(double distancia) {
        System.out.println("Distancia da viagem: " + distancia + " km.");

        if (distancia > calcularAutonomia()) {
            System.out.println("Impossível realizar a viagem!");
        } else {
            double consumido = distancia / consumoMedio;
            combustivel -= consumido;
            System.out.println("Viagem realizada com sucesso!");
            System.out.println("Restaram " + String.format("%.2f", combustivel) + " litros de combustivel no tanque.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println();
        System.out.println("--------------- Informações do veículo: ---------------");
        System.out.println("Veículo: " + getMarca() + ", Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.println();
    }

}
