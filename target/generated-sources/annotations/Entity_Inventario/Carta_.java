package Entity_Inventario;

import Entity_Inventario.EstadoProducto;
import Entity_Inventario.Productos;
import Entity_Login.Usuario;
import Entity_Ventas.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:28")
@StaticMetamodel(Carta.class)
public class Carta_ { 

    public static volatile SingularAttribute<Carta, String> ingredientes;
    public static volatile SingularAttribute<Carta, Integer> iDCarta;
    public static volatile SingularAttribute<Carta, Integer> tiempoPreparacion;
    public static volatile ListAttribute<Carta, Usuario> usuarioList;
    public static volatile ListAttribute<Carta, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Carta, Integer> iDProductos;
    public static volatile SingularAttribute<Carta, String> imagen;
    public static volatile ListAttribute<Carta, Productos> productosList;
    public static volatile SingularAttribute<Carta, EstadoProducto> iDEstadoProductos;

}