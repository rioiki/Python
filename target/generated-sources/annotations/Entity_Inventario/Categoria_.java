package Entity_Inventario;

import Entity_Inventario.Inventario;
import Entity_Inventario.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile ListAttribute<Categoria, Inventario> inventarioList;
    public static volatile ListAttribute<Categoria, Productos> productosList;
    public static volatile SingularAttribute<Categoria, Integer> iDCategoria;
    public static volatile SingularAttribute<Categoria, String> nombreCategoria;

}