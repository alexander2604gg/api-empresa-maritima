package com.alexander.empresaMaritima.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {

    private String ruc;
    private String nombre;
    private String numTelefono;
    private String email;
    private String direccion;

}
