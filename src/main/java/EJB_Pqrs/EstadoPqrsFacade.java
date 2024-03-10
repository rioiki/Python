/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJB_Pqrs;

import EJB_Login.AbstractFacade;
import Entity_PQRS.EstadoPqrs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class EstadoPqrsFacade extends AbstractFacade<EstadoPqrs> implements EstadoPqrsFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_CRUDinventario_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoPqrsFacade() {
        super(EstadoPqrs.class);
    }
    
}
