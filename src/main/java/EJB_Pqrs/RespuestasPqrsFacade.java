/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJB_Pqrs;

import EJB_Login.AbstractFacade;
import Entity_PQRS.RespuestasPqrs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class RespuestasPqrsFacade extends AbstractFacade<RespuestasPqrs> implements RespuestasPqrsFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_CRUDinventario_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespuestasPqrsFacade() {
        super(RespuestasPqrs.class);
    }
    
}
