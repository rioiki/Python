/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Inventario;

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
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findByIDProveedor", query = "SELECT p FROM Proveedores p WHERE p.iDProveedor = :iDProveedor"),
    @NamedQuery(name = "Proveedores.findByNombreProveedor", query = "SELECT p FROM Proveedores p WHERE p.nombreProveedor = :nombreProveedor"),
    @NamedQuery(name = "Proveedores.findByContactoproveedor", query = "SELECT p FROM Proveedores p WHERE p.contactoproveedor = :contactoproveedor"),
    @NamedQuery(name = "Proveedores.findByDireccionProveedor", query = "SELECT p FROM Proveedores p WHERE p.direccionProveedor = :direccionProveedor")})
public class Proveedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Proveedor")
    private Integer iDProveedor;
    @Size(max = 20)
    @Column(name = "Nombre_Proveedor")
    private String nombreProveedor;
    @Column(name = "Contacto_proveedor")
    private Integer contactoproveedor;
    @Size(max = 30)
    @Column(name = "Direccion_Proveedor")
    private String direccionProveedor;
    @OneToMany(mappedBy = "iDProveedorid")
    private List<OrdenesCompra> ordenesCompraList;

    public Proveedores() {
    }

    public Proveedores(Integer iDProveedor) {
        this.iDProveedor = iDProveedor;
    }

    public Integer getIDProveedor() {
        return iDProveedor;
    }

    public void setIDProveedor(Integer iDProveedor) {
        this.iDProveedor = iDProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public Integer getContactoproveedor() {
        return contactoproveedor;
    }

    public void setContactoproveedor(Integer contactoproveedor) {
        this.contactoproveedor = contactoproveedor;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    @XmlTransient
    public List<OrdenesCompra> getOrdenesCompraList() {
        return ordenesCompraList;
    }

    public void setOrdenesCompraList(List<OrdenesCompra> ordenesCompraList) {
        this.ordenesCompraList = ordenesCompraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProveedor != null ? iDProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.iDProveedor == null && other.iDProveedor != null) || (this.iDProveedor != null && !this.iDProveedor.equals(other.iDProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Proveedores[ iDProveedor=" + iDProveedor + " ]";
    }
    
}
