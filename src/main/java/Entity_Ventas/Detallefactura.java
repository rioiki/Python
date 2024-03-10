/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Ventas;

import Entity_Ventas.Encabezadofactura;
import Entity_Inventario.Carta;
import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d"),
    @NamedQuery(name = "Detallefactura.findByIDdetalleFactura", query = "SELECT d FROM Detallefactura d WHERE d.iDdetalleFactura = :iDdetalleFactura"),
    @NamedQuery(name = "Detallefactura.findByCantidad", query = "SELECT d FROM Detallefactura d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detallefactura.findByPrecioUnitario", query = "SELECT d FROM Detallefactura d WHERE d.precioUnitario = :precioUnitario"),
    @NamedQuery(name = "Detallefactura.findBySubtotal", query = "SELECT d FROM Detallefactura d WHERE d.subtotal = :subtotal")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_detalleFactura")
    private Integer iDdetalleFactura;
    @Column(name = "Cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Precio_Unitario")
    private BigDecimal precioUnitario;
    @Column(name = "Subtotal")
    private BigDecimal subtotal;
    @JoinColumn(name = "ID_Cartaid", referencedColumnName = "ID_Carta")
    @ManyToOne
    private Carta iDCartaid;
    @JoinColumn(name = "Id_EncabezadoFactura", referencedColumnName = "ID_Encabezado")
    @ManyToOne
    private Encabezadofactura idEncabezadoFactura;

    public Detallefactura() {
    }

    public Detallefactura(Integer iDdetalleFactura) {
        this.iDdetalleFactura = iDdetalleFactura;
    }

    public Integer getIDdetalleFactura() {
        return iDdetalleFactura;
    }

    public void setIDdetalleFactura(Integer iDdetalleFactura) {
        this.iDdetalleFactura = iDdetalleFactura;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Carta getIDCartaid() {
        return iDCartaid;
    }

    public void setIDCartaid(Carta iDCartaid) {
        this.iDCartaid = iDCartaid;
    }

    public Encabezadofactura getIdEncabezadoFactura() {
        return idEncabezadoFactura;
    }

    public void setIdEncabezadoFactura(Encabezadofactura idEncabezadoFactura) {
        this.idEncabezadoFactura = idEncabezadoFactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDdetalleFactura != null ? iDdetalleFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.iDdetalleFactura == null && other.iDdetalleFactura != null) || (this.iDdetalleFactura != null && !this.iDdetalleFactura.equals(other.iDdetalleFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Detallefactura[ iDdetalleFactura=" + iDdetalleFactura + " ]";
    }
    
}
