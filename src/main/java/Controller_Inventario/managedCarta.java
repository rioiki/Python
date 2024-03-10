/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller_Inventario;

import EJB_Inventario.CartaFacadeLocal;
import Entity_Inventario.Carta;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class managedCarta implements Serializable{
    
    @EJB
    private CartaFacadeLocal cartaFacade;
    private List<Carta> listaCarta;
    private Carta carta;

    public List<Carta> getListaCarta() {
        this.listaCarta = this.cartaFacade.findAll();
        return listaCarta;
    }

    public void setListaCarta(List<Carta> listaCarta) {
        this.listaCarta = listaCarta;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }
    
    @PostConstruct
    public void init(){
        this.carta = new Carta();
        
    }
    
}

