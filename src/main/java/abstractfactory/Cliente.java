package abstractfactory;

public class Cliente {

    private Nota nota;
    private Historico historico;

    public Cliente (FabricaAbstrata fabrica) {
        this.nota = fabrica.createNota();
        this.historico = fabrica.createHistorico();
    }

    public String emitirNota() {
        return this.nota.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
