package abstractfactory;

public class FabricaVenda implements FabricaAbstrata {

    @Override
    public Nota createNota() {
        return new NotaVenda();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoVenda();
    }
}