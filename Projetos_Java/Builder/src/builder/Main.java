package builder;



import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        try {
            String cpu = JOptionPane.showInputDialog("Qual o processador? (Ex: i5, i9, Ryzen 7)");
            String ram = JOptionPane.showInputDialog("Quanto de memória RAM? (Ex: 8GB, 16GB)");


            if (cpu.isEmpty() || ram.isEmpty()) throw new Exception("Dados obrigatórios faltando!");

            Computador.Builder tecnico = new Computador.Builder(cpu, ram);

            int querGpu = JOptionPane.showConfirmDialog(null, "Deseja Placa de Vídeo dedicada?", "Opcional", JOptionPane.YES_NO_OPTION);
            tecnico.adicionarGpu(querGpu == JOptionPane.YES_OPTION);

            int querSsd = JOptionPane.showConfirmDialog(null, "Deseja instalar um SSD?", "Opcional", JOptionPane.YES_NO_OPTION);
            tecnico.adicionarSsd(querSsd == JOptionPane.YES_OPTION);

            Computador meuPc = tecnico.build();

            JOptionPane.showMessageDialog(null, meuPc.toString(), "PC Montado", JOptionPane.INFORMATION_MESSAGE);

            
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Cancelou a montagem ");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage(), "Falha no Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
}