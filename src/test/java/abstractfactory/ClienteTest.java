package abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirHistoricoCompra() {
        FabricaAbstrata fabrica = new FabricaCompra();
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Histórico de Compras", aluno.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoVenda() {
        FabricaAbstrata fabrica = new FabricaVenda();
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Histórico de Vendas", aluno.emitirHistorico());
    }

    @Test
    void deveEmitirNotaCompra() {
        FabricaAbstrata fabrica = new FabricaCompra();
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Nota de compra", aluno.emitirNota());
    }

    @Test
    void deveEmitirNotaVenda() {
        FabricaAbstrata fabrica = new FabricaVenda();
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Nota de venda", aluno.emitirNota());
    }

}