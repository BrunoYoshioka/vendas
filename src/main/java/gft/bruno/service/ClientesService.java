package gft.bruno.service;

import gft.bruno.model.Cliente;
import gft.bruno.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica as validações
    }
}
