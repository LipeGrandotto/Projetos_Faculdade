package builder;


public class Computador {
    private final String cpu;
    private final String ram;
    private final boolean temGpu;
    private final boolean temSsd;

    private Computador(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.temGpu = builder.temGpu;
        this.temSsd = builder.temSsd;
    }

    @Override
    public String toString() {
        return "CONFIGURAÇÃO FINAL:\n" +
               "Processador: " + cpu + "\n" +
               "Memória RAM: " + ram + "\n" +
               "Placa de Vídeo: " + (temGpu ? "Sim (Gamer)" : "Não (Office)") + "\n" +
               "Armazenamento SSD: " + (temSsd ? "Sim (Rápido)" : "Não (Lento)");
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private boolean temGpu;
        private boolean temSsd;

        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder adicionarGpu(boolean sim) {
            this.temGpu = sim;
            return this;
        }

        public Builder adicionarSsd(boolean sim) {
            this.temSsd = sim;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }
}