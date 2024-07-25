package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);

    //Se obtiene una producto por medio de su id
    public Producto getProducto(Producto producto);

//Metodo de guardar
    public void save(Producto producto);

//Metodo de eliminar
    public void delete(Producto producto);
}
