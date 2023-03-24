package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    @Test
    void testDeveEmitirHistoricoProduto() {
        FabricaAbstrata fabrica = new FabricaProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Produto", empresa.emitirHistorico());
    }

    @Test
    void testDeveEmitirHistoricoEstoqueProduto() {
        FabricaAbstrata fabrica = new FabricaEstoqueProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Estoque de Produto", empresa.emitirHistorico());
    }

    @Test
    void testDeveEmitirDiplomaProduto() {
        FabricaAbstrata fabrica = new FabricaProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Produto", empresa.emitirHistoricoProduto());
    }

    @Test
    void testDeveEmitirDiplomaPosGraduacao() {
        FabricaAbstrata fabrica = new FabricaEstoqueProduto();
        Empresa empresa = new Empresa(fabrica);
        assertEquals("Histórico de Estoque de Produto", empresa.emitirHistoricoProduto());
    }

}