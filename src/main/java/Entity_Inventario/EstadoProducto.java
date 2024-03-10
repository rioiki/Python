/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Inventario;

import Entity_Inventario.Carta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "estado_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoProducto.findAll", query = "SELECT e FROM EstadoProducto e"),
    @NamedQuery(name = "EstadoProducto.findByIDEstadoproducto", query = "SELECT e FROM EstadoProducto e WHERE e.iDEstadoproducto = :iDEstadoproducto"),
    @NamedQuery(name = "EstadoProducto.findByEstadoProducto", query = "SELECT e FROM EstadoProducto e WHERE e.estadoProducto = :estadoProducto")})
public class EstadoProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Estado_producto")
    private Integer iDEstadoproducto;
    @Size(max = 45)
    @Column(name = "estado_producto")
    private String estadoProducto;
    @OneToMany(mappedBy = "iDEstadoProductos")
    private List<Carta> cartaList;
    @OneToMany(mappedBy = "iDEstadoproducto")
    private List<Productos> productosList;

    public EstadoProducto() {
    }

    public EstadoProducto(Integer iDEstadoproducto) {
        this.iDEstadoproducto = iDEstadoproducto;
    }

    public Integer getIDEstadoproducto() {
        return iDEstadoproducto;
    }

    public void setIDEstadoproducto(Integer iDEstadoproducto) {
        this.iDEstadoproducto = iDEstadoproducto;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    @XmlTransient
    public List<Carta> getCartaList() {
        return cartaList;
    }

    public void setCartaList(List<Carta> cartaList) {
        this.cartaList = cartaList;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEstadoproducto != null ? iDEstadoproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoProducto)) {
            return false;
        }
        EstadoProducto other = (EstadoProducto) object;
        if ((this.iDEstadoproducto == null && other.iDEstadoproducto != null) || (this.iDEstadoproducto != null && !this.iDEstadoproducto.equals(other.iDEstadoproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EstadoProducto[ iDEstadoproducto=" + iDEstadoproducto + " ]";
    }
    
}
