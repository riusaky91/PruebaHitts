package com.persistencia.entidades;

import com.persistencia.entidades.Cliente;
import com.persistencia.entidades.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-13T10:47:32")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Date> fecha;
    public static volatile SingularAttribute<Venta, Cliente> cedula;
    public static volatile SingularAttribute<Venta, Producto> idProducto;
    public static volatile SingularAttribute<Venta, Long> idVenta;

}