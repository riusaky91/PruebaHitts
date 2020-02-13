package com.persistencia.entidades;

import com.persistencia.entidades.Venta;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-13T10:47:32")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Long> precio;
    public static volatile ListAttribute<Producto, Venta> ventaList;
    public static volatile SingularAttribute<Producto, Long> idProducto;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, BigInteger> sector;

}