package Model;

public class Acessorio implements Vendavel {
    private int codAcessorio;
    private String nome;
    private double valor;

    public Acessorio(int codAcessorio) {
        this.codAcessorio = codAcessorio;

        switch (codAcessorio) {
            case 1:
                nome = "Cadeirinha infantil";
                valor = 100.0;
                break;
            case 2:
                nome = "GPS";
                valor = 70.0;
                break;
            case 3:
                nome = "Capacete";
                valor = 50.0;
                break;
            default:
                nome = "Desconhecido";
                valor = 0.0;
                break;
        }
    }

    @Override
    public double calcularPrecoVenda() {
        return valor * 1.2; //lucro 20
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
