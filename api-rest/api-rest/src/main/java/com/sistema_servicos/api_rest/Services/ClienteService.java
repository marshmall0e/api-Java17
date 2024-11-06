package com.sistema_servicos.api_rest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema_servicos.api_rest.Models.Cliente;
import com.sistema_servicos.api_rest.Repositories.ClienteRepository;

@Service
public class ClienteService {
        @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }
}
