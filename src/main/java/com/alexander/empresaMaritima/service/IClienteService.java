package com.alexander.empresaMaritima.service;

import com.alexander.empresaMaritima.dto.ClienteDTO;
import com.alexander.empresaMaritima.model.Cliente;

public interface IClienteService {

    ClienteDTO findByRuc (String ruc);
    ClienteDTO save (ClienteDTO cliente);
}
