package Entity_PQRS;

import Entity_PQRS.Pqrs;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(RespuestasPqrs.class)
public class RespuestasPqrs_ { 

    public static volatile SingularAttribute<RespuestasPqrs, Integer> iDAtenciónCliente;
    public static volatile SingularAttribute<RespuestasPqrs, Integer> iDRespuesta;
    public static volatile SingularAttribute<RespuestasPqrs, Pqrs> idPqrs;
    public static volatile SingularAttribute<RespuestasPqrs, String> respuesta;
    public static volatile SingularAttribute<RespuestasPqrs, Date> fechaRespuesta;

}