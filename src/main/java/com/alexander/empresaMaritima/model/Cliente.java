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
@Table(name = "Cliente")
public class Cliente {

    @Id
    private String ruc;
    private String nombre;
    private String numTelefono;
    private String email;
    private String direccion;

}
