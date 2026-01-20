package Model;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int dias;
        String placa = JOptionPane.showInputDialog("Digite a placa: ");
        String marca = JOptionPane.showInputDialog("Digite a marca: ");
        String modelo = JOptionPane.showInputDialog("Digite o modelo: ");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        double valorDiaria = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diária: "));
        int portas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas: "));
        String tipoCombustivel = JOptionPane.showInputDialog("Digite o tipo de combustível: ");


        int fautomatico = JOptionPane.showConfirmDialog(null, "O carro é automático?", "Tipo de Transmissão", JOptionPane.YES_NO_OPTION);
        boolean automatico = (fautomatico == JOptionPane.YES_OPTION);

        Carro C = new Carro(placa, marca, modelo, ano, valorDiaria, portas, automatico, tipoCombustivel);


        String splaca = JOptionPane.showInputDialog("Digite a placa da moto: ");
        String smarca = JOptionPane.showInputDialog("Digite a marca da moto: ");
        String smodelo = JOptionPane.showInputDialog("Digite o modelo da moto: ");
        int sano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da moto: "));
        double svalordiaria = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da diária da moto: "));
        int scilindradas = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas cilindradas tem a moto: "));
        int fpartidaEletrica = JOptionPane.showConfirmDialog(null, "A moto possui partida elétrica?", "Tipo de partida", JOptionPane.YES_NO_OPTION);
        boolean partidaEletrica = (fpartidaEletrica == JOptionPane.YES_OPTION);

        Moto moto = new Moto(splaca, smarca, smodelo, sano, svalordiaria, scilindradas, partidaEletrica);

        int codAcessorio = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Digite o código do acessório que deseja: \n1 - Cadeirinha infantil     R$ 100,00\n2 - GPS                     R$ 70,00\n3 - Capacete                R$ 50,00\n 0 -        Nenhum")
        );
        Acessorio acessorio = new Acessorio(codAcessorio);

        dias = 10;

        JOptionPane.showMessageDialog(null,
                "Valor do aluguel do carro por " + dias + " dias: R$ " + C.calcularValor(dias) +
                "\nValor do aluguel da moto por " + dias + " dias: R$ " + moto.calcularValor(dias) +
                "\n\nPreço de venda do carro: R$ " + C.calcularPrecoVenda() +
                "\nPreço de venda do acessório (" + acessorio.getNome() + "): R$ " + acessorio.calcularPrecoVenda() +
                "\n\nTipo de combustível do carro: " + C.getTipoCombustivel() +
                "\n\nTotal de veículos criados: " + Veiculo.contadorVeiculos);
    }
}
