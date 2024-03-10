package Entity_PQRS;

import Entity_Login.Usuario;
import Entity_PQRS.EstadoPqrs;
import Entity_PQRS.RespuestasPqrs;
import Entity_PQRS.TipoPqrs;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(Pqrs.class)
public class Pqrs_ { 

    public static volatile SingularAttribute<Pqrs, String> descripcion;
    public static volatile SingularAttribute<Pqrs, EstadoPqrs> idEstado;
    public static volatile SingularAttribute<Pqrs, Integer> idPqrs;
    public static volatile SingularAttribute<Pqrs, Date> fechaCreacion;
    public static volatile SingularAttribute<Pqrs, TipoPqrs> idTipo;
    public static volatile SingularAttribute<Pqrs, Usuario> usuario;
    public static volatile ListAttribute<Pqrs, RespuestasPqrs> respuestasPqrsList;

}