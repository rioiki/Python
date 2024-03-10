/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_PQRS;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "respuestas_pqrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RespuestasPqrs.findAll", query = "SELECT r FROM RespuestasPqrs r"),
    @NamedQuery(name = "RespuestasPqrs.findByIDRespuesta", query = "SELECT r FROM RespuestasPqrs r WHERE r.iDRespuesta = :iDRespuesta"),
    @NamedQuery(name = "RespuestasPqrs.findByIDAtenci\u00f3nCliente", query = "SELECT r FROM RespuestasPqrs r WHERE r.iDAtenci\u00f3nCliente = :iDAtenci\u00f3nCliente"),
    @NamedQuery(name = "RespuestasPqrs.findByFechaRespuesta", query = "SELECT r FROM RespuestasPqrs r WHERE r.fechaRespuesta = :fechaRespuesta")})
public class RespuestasPqrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Respuesta")
    private Integer iDRespuesta;
    @Column(name = "ID_Atenci\u00f3nCliente")
    private Integer iDAtenciónCliente;
    @Column(name = "FechaRespuesta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRespuesta;
    @Lob
    @Size(max = 65535)
    @Column(name = "Respuesta")
    private String respuesta;
    @JoinColumn(name = "ID_PQRS", referencedColumnName = "ID_PQRS")
    @ManyToOne
    private Pqrs idPqrs;

    public RespuestasPqrs() {
    }

    public RespuestasPqrs(Integer iDRespuesta) {
        this.iDRespuesta = iDRespuesta;
    }

    public Integer getIDRespuesta() {
        return iDRespuesta;
    }

    public void setIDRespuesta(Integer iDRespuesta) {
        this.iDRespuesta = iDRespuesta;
    }

    public Integer getIDAtenciónCliente() {
        return iDAtenciónCliente;
    }

    public void setIDAtenciónCliente(Integer iDAtenciónCliente) {
        this.iDAtenciónCliente = iDAtenciónCliente;
    }

    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }

    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Pqrs getIdPqrs() {
        return idPqrs;
    }

    public void setIdPqrs(Pqrs idPqrs) {
        this.idPqrs = idPqrs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRespuesta != null ? iDRespuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RespuestasPqrs)) {
            return false;
        }
        RespuestasPqrs other = (RespuestasPqrs) object;
        if ((this.iDRespuesta == null && other.iDRespuesta != null) || (this.iDRespuesta != null && !this.iDRespuesta.equals(other.iDRespuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.RespuestasPqrs[ iDRespuesta=" + iDRespuesta + " ]";
    }
    
}
