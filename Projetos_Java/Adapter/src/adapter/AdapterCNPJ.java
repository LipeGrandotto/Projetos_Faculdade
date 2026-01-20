package adapter;


public class AdapterCNPJ implements ValidaDoc{
    private SistemaCNPJ sistemaCNPJ; // Composição

    public AdapterCNPJ(SistemaCNPJ sistemaCNPJ) {
        this.sistemaCNPJ = sistemaCNPJ;
    }

    @Override
    public void validar(String numero) {
        this.sistemaCNPJ.checarCNPJ(numero);
    }
}

