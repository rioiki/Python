/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Ventas;

import Entity_Ventas.Encabezadofactura;
import Entity_Ventas.Pedido;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByIDVenta", query = "SELECT v FROM Venta v WHERE v.iDVenta = :iDVenta"),
    @NamedQuery(name = "Venta.findByFechaVenta", query = "SELECT v FROM Venta v WHERE v.fechaVenta = :fechaVenta"),
    @NamedQuery(name = "Venta.findByTotalVenta", query = "SELECT v FROM Venta v WHERE v.totalVenta = :totalVenta"),
    @NamedQuery(name = "Venta.findByMetododePago", query = "SELECT v FROM Venta v WHERE v.metododePago = :metododePago")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Venta")
    private Integer iDVenta;
    @Column(name = "Fecha_Venta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TotalVenta")
    private BigDecimal totalVenta;
    @Size(max = 50)
    @Column(name = "Metodo_de_Pago")
    private String metododePago;
    @OneToMany(mappedBy = "iDVentaid")
    private List<Encabezadofactura> encabezadofacturaList;
    @OneToMany(mappedBy = "iDVentaid")
    private List<Pedido> pedidoList;

    public Venta() {
    }

    public Venta(Integer iDVenta) {
        this.iDVenta = iDVenta;
    }

    public Integer getIDVenta() {
        return iDVenta;
    }

    public void setIDVenta(Integer iDVenta) {
        this.iDVenta = iDVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public BigDecimal getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(BigDecimal totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getMetododePago() {
        return metododePago;
    }

    public void setMetododePago(String metododePago) {
        this.metododePago = metododePago;
    }

    @XmlTransient
    public List<Encabezadofactura> getEncabezadofacturaList() {
        return encabezadofacturaList;
    }

    public void setEncabezadofacturaList(List<Encabezadofactura> encabezadofacturaList) {
        this.encabezadofacturaList = encabezadofacturaList;
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
        hash += (iDVenta != null ? iDVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.iDVenta == null && other.iDVenta != null) || (this.iDVenta != null && !this.iDVenta.equals(other.iDVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Venta[ iDVenta=" + iDVenta + " ]";
    }
    
}
