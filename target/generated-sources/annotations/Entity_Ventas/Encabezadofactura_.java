package Entity_Ventas;

import Entity_Login.Usuario;
import Entity_Ventas.Detallefactura;
import Entity_Ventas.Venta;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Encabezadofactura.class)
public class Encabezadofactura_ { 

    public static volatile SingularAttribute<Encabezadofactura, Integer> iDEncabezado;
    public static volatile ListAttribute<Encabezadofactura, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Encabezadofactura, Usuario> iDClienteid;
    public static volatile SingularAttribute<Encabezadofactura, Date> fechaEmision;
    public static volatile SingularAttribute<Encabezadofactura, Venta> iDVentaid;

}