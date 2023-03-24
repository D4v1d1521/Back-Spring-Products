package com.example.productos.Service;

import com.example.productos.Models.Products;
import com.example.productos.Repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Class name: ServiceProduct
 * Class description: Service de la clase producto que utiliza
 *                    metodos de la instacia realizada con la interface
 *
 * Class date: 22-03-2023
 * Developer: David Alvarado
 * Modification:
 *      date + nameDeveloper + change description
 * */


@Service
public class ServiceProduct {

    @Autowired
    RepositoryProduct repository; // Instancia de la interface RepositoryProduct


    /**
     * Description:
     *
     *      Metodo Utilizado para guardar un objeto de Produsts
     *
     * Args:
     *
     *      Products products
     *
     * Return:
     *
     *      Objeto de Products
     *
     * method date: 22-03-2023
     * Developer: David Alvarado
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public Products saveProduct(Products products){
        return repository.save(products);
    }

    /**
     * Description:
     *
     *      Metodo Utilizado para eliminar un objeto de Products por si id
     *
     * Args:
     *
     *      Integer idProducto
     *
     * Return:
     *
     *      boolean
     *
     * method date: 22-03-2023
     * Developer: David Alvarado
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public boolean deleteProduct(Integer idProducto){
        try{
            repository.deleteById(idProducto);
            return true;

        }catch (Exception e){
            return false;
        }

    }

    /**
     * Description:
     *
     *      Metodo Utilizado para buscar todos los elementos de Products
     *
     * Args:
     *
     *      No aplica
     *
     * Return:
     *
     *      Un Iterable de Products
     *
     * method date: 22-03-2023
     * Developer: David Alvarado
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public Iterable<Products> findAll(){
        return repository.findAll();
    }

    /**
     * Description:
     *
     *      Metodo Utilizado para buscar un producto por su ID
     *
     * Args:
     *
     *      Integer idProducto
     *
     * Return:
     *
     *      Objeto correspondiente al ID
     *
     * method date: 22-03-2023
     * Developer: David Alvarado
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public Products buscarPorId(Integer idProducto){
        return repository.findByIdProducto(idProducto);
    }

    /**
     * Description:
     *
     *      Metodo Utilizado para actualizar los productos que se encuentran almacenados.
     *
     * Args:
     *
     *      Products productoAct
     *
     * Return:
     *
     *      Objeto con el cambio correspondiente
     *
     * method date: 22-03-2023
     * Developer: David Alvarado
     * Modification:
     *      date + nameDeveloper + change description
     * */
    public Products actualizarProducto(Products productoAct){
        return repository.save(productoAct);
    }



}
