package Entity_Login;

import Entity_Inventario.Inventario;
import Entity_Login.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Admin.class)
public class Admin_ { 

    public static volatile SingularAttribute<Admin, Integer> idAdmin;
    public static volatile SingularAttribute<Admin, Usuario> idUsuario;
    public static volatile SingularAttribute<Admin, String> cargo;
    public static volatile SingularAttribute<Admin, Inventario> inventarioIDinventario;

}