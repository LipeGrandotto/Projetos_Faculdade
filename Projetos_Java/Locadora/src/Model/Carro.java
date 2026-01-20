package Model;



public class Carro extends Veiculo implements Vendavel {
    private int portas;
    private boolean automatico;
    private final String tipoCombustivel;

    public Carro(String placa, String marca, String modelo, int ano, double valorDiaria,
                 int portas, boolean automatico, String tipoCombustivel) {
        super(placa, marca, modelo, ano, valorDiaria);
        this.portas = portas;
        this.automatico = automatico;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public double calcularValor(int dias) {
        double valor = super.calcularValor(dias);
        if (dias > 7) {
            valor *= 1; //-10
        }
        return valor;
    }

    @Override
    public double calcularPrecoVenda() {
        return getValorDiaria() * 100; 
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}
