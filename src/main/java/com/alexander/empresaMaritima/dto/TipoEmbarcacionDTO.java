package com.alexander.empresaMaritima.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoEmbarcacionDTO {
    private long id;
    private String nombre;
    private String descripcion;
}
