package com.example.productos.Repository;

import com.example.productos.Models.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface name: RepositoryProduct
 * Interface description: Utilizacion de los diferentes Metodos CRUD
 * Interface date: 22-03-2023
 * Developer: David Alvarado
 * Modification:
 *      date + nameDeveloper + change description
 * */

@Repository
public interface RepositoryProduct extends CrudRepository<Products, Integer> {

    /**
     * Description:
     *
     *      Metodo para realizar la busqueda por id
     *
     * Args:
     *
     *      Integer: idProducto
     *
     * Return:
     *
     *      Producto filtrado por su id
     *
     * method date: 22-03-2023
     * Developer: David Alvarado
     * Modification:
     *      date + nameDeveloper + change description
     * */
    Products findByIdProducto(Integer idProducto);



}
