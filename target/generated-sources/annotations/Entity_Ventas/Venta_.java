package Entity_Ventas;

import Entity_Ventas.Encabezadofactura;
import Entity_Ventas.Pedido;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> iDVenta;
    public static volatile ListAttribute<Venta, Encabezadofactura> encabezadofacturaList;
    public static volatile SingularAttribute<Venta, BigDecimal> totalVenta;
    public static volatile ListAttribute<Venta, Pedido> pedidoList;
    public static volatile SingularAttribute<Venta, String> metododePago;
    public static volatile SingularAttribute<Venta, Date> fechaVenta;

}