package Entity_Inventario;

import Entity_Inventario.Productos;
import Entity_Inventario.Proveedores;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:28")
@StaticMetamodel(OrdenesCompra.class)
public class OrdenesCompra_ { 

    public static volatile SingularAttribute<OrdenesCompra, Long> totalCompra;
    public static volatile SingularAttribute<OrdenesCompra, String> estadoOrden;
    public static volatile SingularAttribute<OrdenesCompra, String> descripcionCompra;
    public static volatile ListAttribute<OrdenesCompra, Productos> productosList;
    public static volatile SingularAttribute<OrdenesCompra, Proveedores> iDProveedorid;
    public static volatile SingularAttribute<OrdenesCompra, Integer> iDOrdencompra;
    public static volatile SingularAttribute<OrdenesCompra, Date> fechaOrden;
    public static volatile SingularAttribute<OrdenesCompra, Long> valorUnitario;

}