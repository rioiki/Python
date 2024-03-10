package Entity_Inventario;

import Entity_Inventario.Carta;
import Entity_Inventario.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(EstadoProducto.class)
public class EstadoProducto_ { 

    public static volatile SingularAttribute<EstadoProducto, String> estadoProducto;
    public static volatile ListAttribute<EstadoProducto, Carta> cartaList;
    public static volatile ListAttribute<EstadoProducto, Productos> productosList;
    public static volatile SingularAttribute<EstadoProducto, Integer> iDEstadoproducto;

}