package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> mapCliente;

    public ClienteMapDAO() {
        this.mapCliente = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.mapCliente.containsKey(cliente.getCpf())) {
            return false;
        }
        this.mapCliente.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(long cpf) {
        Cliente clienteCastrado = this.mapCliente.get(cpf);

        if (clienteCastrado != null) {
            this.mapCliente.remove(clienteCastrado.getCpf(), clienteCastrado);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCastrado = this.mapCliente.get(cliente.getCpf());

        if (clienteCastrado != null) {
            clienteCastrado.setNome(cliente.getNome());
            clienteCastrado.setTel(cliente.getTel());
            clienteCastrado.setNumero(cliente.getNumero());
            clienteCastrado.setEnd(cliente.getEnd());
            clienteCastrado.setCidade(cliente.getCidade());
            clienteCastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.mapCliente.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.mapCliente.values();
    }
}
