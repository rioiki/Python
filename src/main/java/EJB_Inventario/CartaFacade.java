/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJB_Inventario;

import EJB_Login.AbstractFacade;
import Entity_Inventario.Carta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class CartaFacade extends AbstractFacade<Carta> implements CartaFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_CRUDinventario_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CartaFacade() {
        super(Carta.class);
    }
    
}
