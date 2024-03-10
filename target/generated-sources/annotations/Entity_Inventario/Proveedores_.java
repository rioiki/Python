package Entity_Inventario;

import Entity_Inventario.OrdenesCompra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:28")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, String> nombreProveedor;
    public static volatile SingularAttribute<Proveedores, Integer> contactoproveedor;
    public static volatile SingularAttribute<Proveedores, String> direccionProveedor;
    public static volatile SingularAttribute<Proveedores, Integer> iDProveedor;
    public static volatile ListAttribute<Proveedores, OrdenesCompra> ordenesCompraList;

}