/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Inventario;

import Entity_Login.Admin;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i"),
    @NamedQuery(name = "Inventario.findByIDInventario", query = "SELECT i FROM Inventario i WHERE i.iDInventario = :iDInventario"),
    @NamedQuery(name = "Inventario.findByUbicacionProducto", query = "SELECT i FROM Inventario i WHERE i.ubicacionProducto = :ubicacionProducto"),
    @NamedQuery(name = "Inventario.findByPrecio", query = "SELECT i FROM Inventario i WHERE i.precio = :precio"),
    @NamedQuery(name = "Inventario.findByFechaIngreso", query = "SELECT i FROM Inventario i WHERE i.fechaIngreso = :fechaIngreso"),
    @NamedQuery(name = "Inventario.findByFechaSalida", query = "SELECT i FROM Inventario i WHERE i.fechaSalida = :fechaSalida"),
    @NamedQuery(name = "Inventario.findByFechaCaducidad", query = "SELECT i FROM Inventario i WHERE i.fechaCaducidad = :fechaCaducidad"),
    @NamedQuery(name = "Inventario.findByFechaUltimaActualizacion", query = "SELECT i FROM Inventario i WHERE i.fechaUltimaActualizacion = :fechaUltimaActualizacion")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Inventario")
    private Integer iDInventario;
    @Size(max = 50)
    @Column(name = "ubicacion_producto")
    private String ubicacionProducto;
    @Column(name = "precio")
    private Long precio;
    @Column(name = "fecha_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "fecha_salida")
    @Temporal(TemporalType.DATE)
    private Date fechaSalida;
    @Column(name = "fecha_caducidad")
    @Temporal(TemporalType.DATE)
    private Date fechaCaducidad;
    @Column(name = "fecha_ultima_actualizacion")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaActualizacion;
    @OneToMany(mappedBy = "inventarioIDinventario")
    private List<Admin> adminList;
    @OneToMany(mappedBy = "iDInventarioid")
    private List<Historialinventario> historialinventarioList;
    @JoinColumn(name = "ID_Categoriaid", referencedColumnName = "ID_Categoria")
    @ManyToOne
    private Categoria iDCategoriaid;
    @JoinColumn(name = "ID_Productoid", referencedColumnName = "ID_Producto")
    @ManyToOne
    private Productos iDProductoid;

    public Inventario() {
    }

    public Inventario(Integer iDInventario) {
        this.iDInventario = iDInventario;
    }

    public Integer getIDInventario() {
        return iDInventario;
    }

    public void setIDInventario(Integer iDInventario) {
        this.iDInventario = iDInventario;
    }

    public String getUbicacionProducto() {
        return ubicacionProducto;
    }

    public void setUbicacionProducto(String ubicacionProducto) {
        this.ubicacionProducto = ubicacionProducto;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Date getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    @XmlTransient
    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }

    @XmlTransient
    public List<Historialinventario> getHistorialinventarioList() {
        return historialinventarioList;
    }

    public void setHistorialinventarioList(List<Historialinventario> historialinventarioList) {
        this.historialinventarioList = historialinventarioList;
    }

    public Categoria getIDCategoriaid() {
        return iDCategoriaid;
    }

    public void setIDCategoriaid(Categoria iDCategoriaid) {
        this.iDCategoriaid = iDCategoriaid;
    }

    public Productos getIDProductoid() {
        return iDProductoid;
    }

    public void setIDProductoid(Productos iDProductoid) {
        this.iDProductoid = iDProductoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDInventario != null ? iDInventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.iDInventario == null && other.iDInventario != null) || (this.iDInventario != null && !this.iDInventario.equals(other.iDInventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Inventario[ iDInventario=" + iDInventario + " ]";
    }
    
}
