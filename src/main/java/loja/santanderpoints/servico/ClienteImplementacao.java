package loja.santanderpoints.servico;

import loja.santanderpoints.clientes.Cliente;
import org.springframework.stereotype.Service;



@Service
public class ClienteImplementacao implements ClienteServico {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void alterar(Long id, Cliente cliente) {

    }

    @Override
    public void apagar(Long id) {

    }


}
