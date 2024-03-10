package Entity_Login;

import Entity_Login.Usuario;
import Entity_Ventas.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, Usuario> idUsuario;
    public static volatile SingularAttribute<Cliente, Pedido> iDpedidoid;
    public static volatile SingularAttribute<Cliente, Integer> edad;

}