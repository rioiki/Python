/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EJB_Pqrs;

import Entity_PQRS.EstadoPqrs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface EstadoPqrsFacadeLocal {

    void create(EstadoPqrs estadoPqrs);

    void edit(EstadoPqrs estadoPqrs);

    void remove(EstadoPqrs estadoPqrs);

    EstadoPqrs find(Object id);

    List<EstadoPqrs> findAll();

    List<EstadoPqrs> findRange(int[] range);

    int count();
    
}
