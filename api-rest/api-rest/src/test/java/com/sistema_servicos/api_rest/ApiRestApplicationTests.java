package com.sistema_servicos.api_rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.sistema_servicos.api_rest.Models.Cliente;
import com.sistema_servicos.api_rest.Repositories.ClienteRepository;
import com.sistema_servicos.api_rest.Services.ClienteService;

@SpringBootTest
class ApiRestApplicationTests {

	  @Mock
    private ClienteRepository clienteRepository;

    @InjectMocks
    private ClienteService clienteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }



	    @Test
    void testSalvarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("João");

        when(clienteRepository.save(cliente)).thenReturn(cliente);

        Cliente clienteSalvo = clienteService.salvar(cliente);

        assertNotNull(clienteSalvo);
        assertEquals("João", clienteSalvo.getNome());
    }
}
