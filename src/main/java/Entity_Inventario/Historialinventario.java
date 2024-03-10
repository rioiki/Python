/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Inventario;

import Entity_Inventario.Inventario;
import Entity_Inventario.Productos;
import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "historialinventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historialinventario.findAll", query = "SELECT h FROM Historialinventario h"),
    @NamedQuery(name = "Historialinventario.findByRegistroInventarioID", query = "SELECT h FROM Historialinventario h WHERE h.registroInventarioID = :registroInventarioID"),
    @NamedQuery(name = "Historialinventario.findByFechaRegistro", query = "SELECT h FROM Historialinventario h WHERE h.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Historialinventario.findByTipoTransaccion", query = "SELECT h FROM Historialinventario h WHERE h.tipoTransaccion = :tipoTransaccion"),
    @NamedQuery(name = "Historialinventario.findByCantidadModificada", query = "SELECT h FROM Historialinventario h WHERE h.cantidadModificada = :cantidadModificada"),
    @NamedQuery(name = "Historialinventario.findByCantidadActual", query = "SELECT h FROM Historialinventario h WHERE h.cantidadActual = :cantidadActual")})
public class Historialinventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Registro_Inventario_ID")
    private Integer registroInventarioID;
    @Column(name = "fecha_registro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Size(max = 7)
    @Column(name = "Tipo_Transaccion")
    private String tipoTransaccion;
    @Column(name = "Cantidad_Modificada")
    private Integer cantidadModificada;
    @Column(name = "Cantidad_Actual")
    private Integer cantidadActual;
    @JoinColumn(name = "ID_Inventario_id", referencedColumnName = "ID_Inventario")
    @ManyToOne
    private Inventario iDInventarioid;
    @JoinColumn(name = "ID_Producto_id", referencedColumnName = "ID_Producto")
    @ManyToOne
    private Productos iDProductoid;

    public Historialinventario() {
    }

    public Historialinventario(Integer registroInventarioID) {
        this.registroInventarioID = registroInventarioID;
    }

    public Integer getRegistroInventarioID() {
        return registroInventarioID;
    }

    public void setRegistroInventarioID(Integer registroInventarioID) {
        this.registroInventarioID = registroInventarioID;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Integer getCantidadModificada() {
        return cantidadModificada;
    }

    public void setCantidadModificada(Integer cantidadModificada) {
        this.cantidadModificada = cantidadModificada;
    }

    public Integer getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Integer cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Inventario getIDInventarioid() {
        return iDInventarioid;
    }

    public void setIDInventarioid(Inventario iDInventarioid) {
        this.iDInventarioid = iDInventarioid;
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
        hash += (registroInventarioID != null ? registroInventarioID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historialinventario)) {
            return false;
        }
        Historialinventario other = (Historialinventario) object;
        if ((this.registroInventarioID == null && other.registroInventarioID != null) || (this.registroInventarioID != null && !this.registroInventarioID.equals(other.registroInventarioID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Historialinventario[ registroInventarioID=" + registroInventarioID + " ]";
    }
    
}
