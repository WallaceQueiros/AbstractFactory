package abstractfactory;

public class Empresa {

    private final Empresa empresaFabricada;
    private Historico historicoFabricado;

    public Empresa() {
        this.empresaFabricada = fabrica.createEmpresa();
        this.historicoFabricado = fabrica.createHistorico();
    }

    public String emitirEmpresa() {
        return this.empresaFabricada.emitir();
    }

    public String emitirHistorico() {
        return this.historicoFabricado.emitir();
    }
}