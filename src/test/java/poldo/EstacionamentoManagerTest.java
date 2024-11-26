package poldo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstacionamentoManagerTest {

	private EstacionamentoManager manager;

    @BeforeEach
    void setUp() {
        manager = new EstacionamentoManager();
    }

    @Test
    void testAdicionarEstacionamento() {
        assertTrue(manager.adicionarEstacionamento(1L));
        assertFalse(manager.adicionarEstacionamento(1L)); // Não permite duplicatas
    }

    @Test
    void testBuscarEstacionamento() {
        manager.adicionarEstacionamento(1L);
        assertTrue(manager.buscarEstacionamento(1L));
        assertFalse(manager.buscarEstacionamento(2L)); // Não existe
    }

   @Test
void testAlterarEstacionamento() {
    manager.adicionarEstacionamento(1L);
    assertTrue(manager.alterarEstacionamento(1L, 2L)); // Substituir ID (continua correto)
    assertTrue(manager.alterarEstacionamento(1L, 3L)); // Este deve falhar, pois ID antigo não existe mais
}

    @Test
    void testRemoverEstacionamento() {
        manager.adicionarEstacionamento(1L);
        assertTrue(manager.removerEstacionamento(1L)); // Remoção bem-sucedida
        assertFalse(manager.removerEstacionamento(1L)); // Não existe mais
    }

}
