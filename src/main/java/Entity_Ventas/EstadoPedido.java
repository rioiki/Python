/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Ventas;

import Entity_Ventas.Pedido;
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
@Table(name = "estado_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoPedido.findAll", query = "SELECT e FROM EstadoPedido e"),
    @NamedQuery(name = "EstadoPedido.findByIDestadopedido", query = "SELECT e FROM EstadoPedido e WHERE e.iDestadopedido = :iDestadopedido"),
    @NamedQuery(name = "EstadoPedido.findByEstadopedido", query = "SELECT e FROM EstadoPedido e WHERE e.estadopedido = :estadopedido")})
public class EstadoPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_estado_pedido")
    private Integer iDestadopedido;
    @Size(max = 45)
    @Column(name = "Estado_pedido")
    private String estadopedido;
    @OneToMany(mappedBy = "iDEstadoPedidoID")
    private List<Pedido> pedidoList;

    public EstadoPedido() {
    }

    public EstadoPedido(Integer iDestadopedido) {
        this.iDestadopedido = iDestadopedido;
    }

    public Integer getIDestadopedido() {
        return iDestadopedido;
    }

    public void setIDestadopedido(Integer iDestadopedido) {
        this.iDestadopedido = iDestadopedido;
    }

    public String getEstadopedido() {
        return estadopedido;
    }

    public void setEstadopedido(String estadopedido) {
        this.estadopedido = estadopedido;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDestadopedido != null ? iDestadopedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPedido)) {
            return false;
        }
        EstadoPedido other = (EstadoPedido) object;
        if ((this.iDestadopedido == null && other.iDestadopedido != null) || (this.iDestadopedido != null && !this.iDestadopedido.equals(other.iDestadopedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EstadoPedido[ iDestadopedido=" + iDestadopedido + " ]";
    }
    
}
