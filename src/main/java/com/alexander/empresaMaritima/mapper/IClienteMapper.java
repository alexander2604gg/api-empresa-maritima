package com.alexander.empresaMaritima.mapper;
import com.alexander.empresaMaritima.dto.ClienteDTO;
import com.alexander.empresaMaritima.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IClienteMapper {

    ClienteDTO toDTO (Cliente cliente);
    Cliente toModel (ClienteDTO clienteDTO);

}
