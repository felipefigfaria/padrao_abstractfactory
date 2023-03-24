package abstractfactory;

public class FabricaCompra implements FabricaAbstrata {

    @Override
    public Nota createNota() {
        return new NotaCompra();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoCompra();
    }
}
