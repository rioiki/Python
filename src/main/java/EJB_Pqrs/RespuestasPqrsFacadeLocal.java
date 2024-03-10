/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EJB_Pqrs;

import Entity_PQRS.RespuestasPqrs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface RespuestasPqrsFacadeLocal {

    void create(RespuestasPqrs respuestasPqrs);

    void edit(RespuestasPqrs respuestasPqrs);

    void remove(RespuestasPqrs respuestasPqrs);

    RespuestasPqrs find(Object id);

    List<RespuestasPqrs> findAll();

    List<RespuestasPqrs> findRange(int[] range);

    int count();
    
}
