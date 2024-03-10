/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Ventas;

import Entity_Login.Cliente;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p"),
    @NamedQuery(name = "Pedido.findByIDPedido", query = "SELECT p FROM Pedido p WHERE p.iDPedido = :iDPedido"),
    @NamedQuery(name = "Pedido.findByFechaPedido", query = "SELECT p FROM Pedido p WHERE p.fechaPedido = :fechaPedido")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Pedido")
    private Integer iDPedido;
    @Column(name = "Fecha_Pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaPedido;
    @OneToMany(mappedBy = "iDpedidoid")
    private List<Cliente> clienteList;
    @JoinColumn(name = "ID_Estado_Pedido_ID", referencedColumnName = "ID_estado_pedido")
    @ManyToOne
    private EstadoPedido iDEstadoPedidoID;
    @JoinColumn(name = "ID_Ventaid", referencedColumnName = "ID_Venta")
    @ManyToOne
    private Venta iDVentaid;

    public Pedido() {
    }

    public Pedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public Integer getIDPedido() {
        return iDPedido;
    }

    public void setIDPedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public EstadoPedido getIDEstadoPedidoID() {
        return iDEstadoPedidoID;
    }

    public void setIDEstadoPedidoID(EstadoPedido iDEstadoPedidoID) {
        this.iDEstadoPedidoID = iDEstadoPedidoID;
    }

    public Venta getIDVentaid() {
        return iDVentaid;
    }

    public void setIDVentaid(Venta iDVentaid) {
        this.iDVentaid = iDVentaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPedido != null ? iDPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.iDPedido == null && other.iDPedido != null) || (this.iDPedido != null && !this.iDPedido.equals(other.iDPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Pedido[ iDPedido=" + iDPedido + " ]";
    }
    
}
