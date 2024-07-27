package loja.santanderpoints.servico;

import loja.santanderpoints.clientes.Cliente;

public interface ClienteServico {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void alterar(Long id, Cliente cliente);
    void apagar(Long id);

}
