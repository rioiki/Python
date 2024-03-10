/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EJB_Ventas;

import Entity_Ventas.Encabezadofactura;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author PC
 */
@Local
public interface EncabezadofacturaFacadeLocal {

    void create(Encabezadofactura encabezadofactura);

    void edit(Encabezadofactura encabezadofactura);

    void remove(Encabezadofactura encabezadofactura);

    Encabezadofactura find(Object id);

    List<Encabezadofactura> findAll();

    List<Encabezadofactura> findRange(int[] range);

    int count();
    
}
