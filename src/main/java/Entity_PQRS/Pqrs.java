/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_PQRS;

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
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
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
@Table(name = "pqrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pqrs.findAll", query = "SELECT p FROM Pqrs p"),
    @NamedQuery(name = "Pqrs.findByIdPqrs", query = "SELECT p FROM Pqrs p WHERE p.idPqrs = :idPqrs"),
    @NamedQuery(name = "Pqrs.findByFechaCreacion", query = "SELECT p FROM Pqrs p WHERE p.fechaCreacion = :fechaCreacion")})
public class Pqrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PQRS")
    private Integer idPqrs;
    @Column(name = "FechaCreacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Lob
    @Size(max = 65535)
    @Column(name = "Descripcion")
    private String descripcion;
    @JoinColumn(name = "Id_Estado", referencedColumnName = "Id_Estado")
    @ManyToOne
    private EstadoPqrs idEstado;
    @JoinColumn(name = "Id_Tipo", referencedColumnName = "Id_Tipo")
    @ManyToOne
    private TipoPqrs idTipo;
    @JoinColumns({
        @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario"),
        @JoinColumn(name = "Id_Usuario", referencedColumnName = "Id_Usuario")})
    @ManyToOne
    private Usuario usuario;
    @OneToMany(mappedBy = "idPqrs")
    private List<RespuestasPqrs> respuestasPqrsList;

    public Pqrs() {
    }

    public Pqrs(Integer idPqrs) {
        this.idPqrs = idPqrs;
    }

    public Integer getIdPqrs() {
        return idPqrs;
    }

    public void setIdPqrs(Integer idPqrs) {
        this.idPqrs = idPqrs;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoPqrs getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(EstadoPqrs idEstado) {
        this.idEstado = idEstado;
    }

    public TipoPqrs getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(TipoPqrs idTipo) {
        this.idTipo = idTipo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<RespuestasPqrs> getRespuestasPqrsList() {
        return respuestasPqrsList;
    }

    public void setRespuestasPqrsList(List<RespuestasPqrs> respuestasPqrsList) {
        this.respuestasPqrsList = respuestasPqrsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPqrs != null ? idPqrs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pqrs)) {
            return false;
        }
        Pqrs other = (Pqrs) object;
        if ((this.idPqrs == null && other.idPqrs != null) || (this.idPqrs != null && !this.idPqrs.equals(other.idPqrs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Pqrs[ idPqrs=" + idPqrs + " ]";
    }
    
}
