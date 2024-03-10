package Entity_PQRS;

import Entity_PQRS.Pqrs;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-02T16:55:29")
@StaticMetamodel(EstadoPqrs.class)
public class EstadoPqrs_ { 

    public static volatile SingularAttribute<EstadoPqrs, Integer> idEstado;
    public static volatile SingularAttribute<EstadoPqrs, String> estado;
    public static volatile ListAttribute<EstadoPqrs, Pqrs> pqrsList;

}