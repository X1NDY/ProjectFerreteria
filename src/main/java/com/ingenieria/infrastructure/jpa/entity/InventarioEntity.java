package com.ingenieria.infrastructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "inventario")
public class InventarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;
    @JoinColumn(name = "fecha_entrada")
    private LocalDateTime fechaEntrada;
    @JoinColumn(name = "fecha_salida")
    private LocalDateTime fechaSalida;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_tienda")
    private TiendaEntity tienda;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_producto")
    private ProductoEntity producto;

}
