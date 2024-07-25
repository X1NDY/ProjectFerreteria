package com.ingenieria.infrastructure.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tienda")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TiendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_direccion")
    private DireccionEntity direccion;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_usuario")
    private UsuarioEntity usuario;


}
