package com.alexander.empresaMaritima.service.Impl;

import com.alexander.empresaMaritima.dto.ClienteDTO;
import com.alexander.empresaMaritima.mapper.IClienteMapper;
import com.alexander.empresaMaritima.model.Cliente;
import com.alexander.empresaMaritima.repository.ClienteRepository;
import com.alexander.empresaMaritima.service.IClienteService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private IClienteMapper clienteMapper;

    @Override
    public ClienteDTO findByRuc(String ruc) {
        return clienteRepository.findById(ruc)
                .map(clienteMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Cliente no encontrado con RUC: " + ruc));
    }

    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente newCliente = clienteRepository.save(clienteMapper.toModel(clienteDTO));
        return clienteMapper.toDTO(newCliente);
    }

}
