package abstractfactory;

public class FabricaEmpresa implements FabricaAbstrata {

    @Override
    public Empresa criarEmpresa() {
        return new Empresa();
    }

    @Override
    public Historico criarHistorico() {
        return new HistoricoProduto();
    }
}
