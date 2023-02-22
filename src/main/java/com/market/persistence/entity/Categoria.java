package com.market.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @Column(name = "id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    private String descripcion;
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;


}
