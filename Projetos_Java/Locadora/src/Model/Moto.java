package Model;



public class Moto extends Veiculo {
    private int cilindradas;
    private boolean partidaEletrica;

    public Moto(String placa, String marca, String modelo, int ano, double valorDiaria, int cilindradas, boolean partidaEletrica) {
        super(placa, marca, modelo, ano, valorDiaria);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public double calcularValor(int dias) {
        return super.calcularValor(dias) + 40; 
    }
}
