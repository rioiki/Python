package Entity_Login;

import Entity_Inventario.Carta;
import Entity_Login.Admin;
import Entity_Login.Cliente;
import Entity_Login.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Cliente> clienteList;
    public static volatile SingularAttribute<Usuario, Rol> idrol;
    public static volatile SingularAttribute<Usuario, Carta> idcartaid;
    public static volatile ListAttribute<Usuario, Admin> adminList;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, String> numerodeTelefono;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}