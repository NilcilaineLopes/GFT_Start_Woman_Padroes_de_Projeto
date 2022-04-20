package one.digitalinnovation.gft.service.impl;

import one.digitalinnovation.gft.model.Cliente;
import one.digitalinnovation.gft.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos(){
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
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
