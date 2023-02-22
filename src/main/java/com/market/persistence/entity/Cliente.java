package com.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Integer id;

    private String nombre;
    private String apellido;
    private Integer celular;
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    List<Compra> compras;

}
