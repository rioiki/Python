/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Ventas;

import Entity_Login.Usuario;
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
@Table(name = "encabezadofactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encabezadofactura.findAll", query = "SELECT e FROM Encabezadofactura e"),
    @NamedQuery(name = "Encabezadofactura.findByIDEncabezado", query = "SELECT e FROM Encabezadofactura e WHERE e.iDEncabezado = :iDEncabezado"),
    @NamedQuery(name = "Encabezadofactura.findByFechaEmision", query = "SELECT e FROM Encabezadofactura e WHERE e.fechaEmision = :fechaEmision")})
public class Encabezadofactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Encabezado")
    private Integer iDEncabezado;
    @Column(name = "FechaEmision")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEmision;
    @JoinColumn(name = "ID_Clienteid", referencedColumnName = "Id_Usuario")
    @ManyToOne
    private Usuario iDClienteid;
    @JoinColumn(name = "ID_Venta_id", referencedColumnName = "ID_Venta")
    @ManyToOne
    private Venta iDVentaid;
    @OneToMany(mappedBy = "idEncabezadoFactura")
    private List<Detallefactura> detallefacturaList;

    public Encabezadofactura() {
    }

    public Encabezadofactura(Integer iDEncabezado) {
        this.iDEncabezado = iDEncabezado;
    }

    public Integer getIDEncabezado() {
        return iDEncabezado;
    }

    public void setIDEncabezado(Integer iDEncabezado) {
        this.iDEncabezado = iDEncabezado;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Usuario getIDClienteid() {
        return iDClienteid;
    }

    public void setIDClienteid(Usuario iDClienteid) {
        this.iDClienteid = iDClienteid;
    }

    public Venta getIDVentaid() {
        return iDVentaid;
    }

    public void setIDVentaid(Venta iDVentaid) {
        this.iDVentaid = iDVentaid;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEncabezado != null ? iDEncabezado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encabezadofactura)) {
            return false;
        }
        Encabezadofactura other = (Encabezadofactura) object;
        if ((this.iDEncabezado == null && other.iDEncabezado != null) || (this.iDEncabezado != null && !this.iDEncabezado.equals(other.iDEncabezado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Encabezadofactura[ iDEncabezado=" + iDEncabezado + " ]";
    }
    
}
