package com.alexander.empresaMaritima.dto;

import com.alexander.empresaMaritima.model.Cliente;
import com.alexander.empresaMaritima.model.TipoEmbarcacion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmbarcacionDTO {

    private String IMO;
    private String nombreEmbarcacion;
    private String capacidad;
    private String tamanioLargo;
    private String tamanioAlto;
    private String tamanioAncho;
    private String bandera;
    private Cliente cliente;
    private TipoEmbarcacion tipoEmbarcacion;

}
