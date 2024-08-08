package com.alexander.empresaMaritima.mapper;

import com.alexander.empresaMaritima.dto.ClienteDTO;
import com.alexander.empresaMaritima.model.Cliente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-08T01:41:20-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.11 (Oracle Corporation)"
)
@Component
public class IClienteMapperImpl implements IClienteMapper {

    @Override
    public ClienteDTO toDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO.ClienteDTOBuilder clienteDTO = ClienteDTO.builder();

        clienteDTO.ruc( cliente.getRuc() );
        clienteDTO.nombre( cliente.getNombre() );
        clienteDTO.numTelefono( cliente.getNumTelefono() );
        clienteDTO.email( cliente.getEmail() );
        clienteDTO.direccion( cliente.getDireccion() );

        return clienteDTO.build();
    }

    @Override
    public Cliente toModel(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.ruc( clienteDTO.getRuc() );
        cliente.nombre( clienteDTO.getNombre() );
        cliente.numTelefono( clienteDTO.getNumTelefono() );
        cliente.email( clienteDTO.getEmail() );
        cliente.direccion( clienteDTO.getDireccion() );

        return cliente.build();
    }
}
