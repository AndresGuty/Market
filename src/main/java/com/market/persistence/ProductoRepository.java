package com.market.persistence;

import com.market.persistence.crud.IProductoCrudRepository;
import com.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class ProductoRepository {

    private IProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria(int idCategoria){

        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getProductoEscasos(int cantidadStock, boolean estado){

        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, estado);
    }

    public  Optional<Producto> getProducto(int idProducto){

        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto){

        productoCrudRepository.deleteById(idProducto);
    }

}
