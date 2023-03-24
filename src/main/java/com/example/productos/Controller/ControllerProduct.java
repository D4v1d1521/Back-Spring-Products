package com.example.productos.Controller;

import com.example.productos.Models.Products;
import com.example.productos.Service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Class name: ControllerProduct
 * Class description: Controlador de la clase producto que utiliza
 *                    metodos de la instacia realizada con el service
 *
 * Class date: 22-03-2023
 * Developer: David Alvarado
 * Modification:
 *      date + nameDeveloper + change description
 * */

@RestController
@RequestMapping("/api/product/") // Ruta base, la cual es necesaria para la ejecusion de los metodos
public class ControllerProduct {

    @Autowired
    ServiceProduct service; // Intancia del ServiceProduct


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
    @PostMapping("save")
    public Products saveProducts( @RequestBody Products products){
        return service.saveProduct(products);
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
    @DeleteMapping("delete/{idProducto}")
    public boolean deleteProduct(@PathVariable Integer idProducto){
        return service.deleteProduct(idProducto);
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
    @GetMapping("findAll")
    public Iterable<Products> findAlls(){
        return service.findAll();
    }

    /**
     * Description:
     *
     *      Metodo editar para actualizar los productos que se encuentran almacenados
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
    @PutMapping("update/{idProducto}")
    public void editarProducto(
            @PathVariable Integer idProducto, @RequestBody Products productoAct) {
        Products productos = service.buscarPorId(idProducto);
        if (productos == null) {
            System.out.println("No se encontró el producto");
        } else {
            productos.setNombre(productoAct.getNombre());
            productos.setDescripcion(productoAct.getDescripcion());
            productos.setFecha(productoAct.getFecha());
            service.actualizarProducto(productos);
        }
    }
}
