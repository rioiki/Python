/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_PQRS;

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
@Table(name = "estado_pqrs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoPqrs.findAll", query = "SELECT e FROM EstadoPqrs e"),
    @NamedQuery(name = "EstadoPqrs.findByIdEstado", query = "SELECT e FROM EstadoPqrs e WHERE e.idEstado = :idEstado"),
    @NamedQuery(name = "EstadoPqrs.findByEstado", query = "SELECT e FROM EstadoPqrs e WHERE e.estado = :estado")})
public class EstadoPqrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Estado")
    private Integer idEstado;
    @Size(max = 20)
    @Column(name = "Estado")
    private String estado;
    @OneToMany(mappedBy = "idEstado")
    private List<Pqrs> pqrsList;

    public EstadoPqrs() {
    }

    public EstadoPqrs(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Pqrs> getPqrsList() {
        return pqrsList;
    }

    public void setPqrsList(List<Pqrs> pqrsList) {
        this.pqrsList = pqrsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPqrs)) {
            return false;
        }
        EstadoPqrs other = (EstadoPqrs) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.EstadoPqrs[ idEstado=" + idEstado + " ]";
    }
    
}
