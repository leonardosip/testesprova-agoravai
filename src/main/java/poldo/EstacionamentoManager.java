package poldo;

import java.util.ArrayList;
import java.util.List;

public class EstacionamentoManager {

	 private final List<Long> estacionamentos = new ArrayList<>();

	    // Adicionar estacionamento (ID único)
	    public boolean adicionarEstacionamento(Long id) {
	        if (!estacionamentos.contains(id)) {
	            estacionamentos.add(id);
	            return true;
	        }
	        return false; // Não permite duplicatas
	    }

	    // Buscar estacionamento pelo ID
	    public boolean buscarEstacionamento(Long id) {
	        return estacionamentos.contains(id);
	    }

	    // Alterar estacionamento (substituir ID antigo pelo novo)
	    public boolean alterarEstacionamento(Long idAntigo, Long idNovo) {
	        int index = estacionamentos.indexOf(idAntigo);
	        if (index != -1 && !estacionamentos.contains(idNovo)) {
	            estacionamentos.set(index, idNovo);
	            return true;
	        }
	        return false; // Falha se ID antigo não existe ou ID novo já existe
	    }

	    // Remover estacionamento
	    public boolean removerEstacionamento(Long id) {
	        return estacionamentos.remove(id);
	    }
	
}
