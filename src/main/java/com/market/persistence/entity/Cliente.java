package com.market.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;
    private Integer celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

}
