package adapter;

public class AdapterCPF implements ValidaDoc{
    private SistemaCPF sistemaCPF; // Composição

    public AdapterCPF(SistemaCPF sistemaCPF) {
        this.sistemaCPF = sistemaCPF;
    }

    @Override
    public void validar(String numero) {
        this.sistemaCPF.validarCPF(numero);
    }
}
