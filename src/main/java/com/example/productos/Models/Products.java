package com.example.productos.Models;

// se im
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


/**
 * class name: Products
 * class description: Creacion de los campos necesarios en la aplicacion
 * class date: 22-03-2023
 * Developer: David Alvarado
 * Modification:
 *      date + nameDeveloper + change description
 * */


@AllArgsConstructor // Crea automaticamente contructor con argumentos
@NoArgsConstructor // Crea automaticamente contructor sin argumentos
@Getter // Genera automaticamente los Getters
@Setter // Genera automaticamente los Setters
@Entity // Indica que esta clase es una Entidad de la base de datos.
@Table(name = "products")
public class Products implements Serializable {



    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private Integer idProducto;

    private String nombre;

    private  String descripcion;

    private String fecha;
}
