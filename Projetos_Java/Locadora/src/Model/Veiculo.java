package Model;



public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valorDiaria;

    public static int contadorVeiculos = 0;

    public Veiculo(String placa, String marca, String modelo, int ano, double valorDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        contadorVeiculos++;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static int getContadorVeiculos() {
        return contadorVeiculos;
    }

    public static void setContadorVeiculos(int contadorVeiculos) {
        Veiculo.contadorVeiculos = contadorVeiculos;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) { this.valorDiaria = valorDiaria; }

    public double calcularValor(int dias) {
        return valorDiaria * dias;
    }
}
