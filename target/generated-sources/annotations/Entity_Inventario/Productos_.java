package Entity_Inventario;

import Entity_Inventario.Carta;
import Entity_Inventario.Categoria;
import Entity_Inventario.EstadoProducto;
import Entity_Inventario.Historialinventario;
import Entity_Inventario.Inventario;
import Entity_Inventario.OrdenesCompra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Long> precio;
    public static volatile ListAttribute<Productos, Historialinventario> historialinventarioList;
    public static volatile SingularAttribute<Productos, String> descripcionProducto;
    public static volatile ListAttribute<Productos, OrdenesCompra> ordenesCompraList;
    public static volatile SingularAttribute<Productos, Integer> iDProducto;
    public static volatile SingularAttribute<Productos, Integer> cantidadInventario;
    public static volatile ListAttribute<Productos, Inventario> inventarioList;
    public static volatile SingularAttribute<Productos, Categoria> iDCategoriaid;
    public static volatile SingularAttribute<Productos, Carta> iDcartaid;
    public static volatile SingularAttribute<Productos, String> nombreProducto;
    public static volatile SingularAttribute<Productos, EstadoProducto> iDEstadoproducto;

}