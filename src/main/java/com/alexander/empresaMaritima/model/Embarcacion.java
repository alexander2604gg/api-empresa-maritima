package com.alexander.empresaMaritima.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Embarcacion")
public class Embarcacion {

    @Id
    private String IMO;
    private String nombreEmbarcacion;
    private String capacidad;
    private String tamanioLargo;
    private String tamanioAlto;
    private String tamanioAncho;
    private String bandera;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tipoEmbarcacionId")
    private TipoEmbarcacion tipoEmbarcacion;

}
