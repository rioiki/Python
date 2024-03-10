/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EJB_Pqrs;

import Entity_PQRS.TipoPqrs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface TipoPqrsFacadeLocal {

    void create(TipoPqrs tipoPqrs);

    void edit(TipoPqrs tipoPqrs);

    void remove(TipoPqrs tipoPqrs);

    TipoPqrs find(Object id);

    List<TipoPqrs> findAll();

    List<TipoPqrs> findRange(int[] range);

    int count();
    
}
