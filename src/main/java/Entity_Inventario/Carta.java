/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Inventario;

import Entity_Login.Usuario;
import Entity_Ventas.Detallefactura;
import Entity_Login.Usuario;
import java.io.Serializable;
import java.util.List;
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
@Table(name = "carta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carta.findAll", query = "SELECT c FROM Carta c"),
    @NamedQuery(name = "Carta.findByIDCarta", query = "SELECT c FROM Carta c WHERE c.iDCarta = :iDCarta"),
    @NamedQuery(name = "Carta.findByIDProductos", query = "SELECT c FROM Carta c WHERE c.iDProductos = :iDProductos"),
    @NamedQuery(name = "Carta.findByImagen", query = "SELECT c FROM Carta c WHERE c.imagen = :imagen"),
    @NamedQuery(name = "Carta.findByTiempoPreparacion", query = "SELECT c FROM Carta c WHERE c.tiempoPreparacion = :tiempoPreparacion")})
public class Carta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Carta")
    private Integer iDCarta;
    @Column(name = "ID_Productos")
    private Integer iDProductos;
    @Size(max = 255)
    @Column(name = "Imagen")
    private String imagen;
    @Column(name = "TiempoPreparacion")
    private Integer tiempoPreparacion;
    @Lob
    @Size(max = 65535)
    @Column(name = "Ingredientes")
    private String ingredientes;
    @JoinColumn(name = "ID_Estado_Productos", referencedColumnName = "ID_Estado_producto")
    @ManyToOne
    private EstadoProducto iDEstadoProductos;
    @OneToMany(mappedBy = "iDCartaid")
    private List<Detallefactura> detallefacturaList;
    @OneToMany(mappedBy = "idcartaid")
    private List<Usuario> usuarioList;
    @OneToMany(mappedBy = "iDcartaid")
    private List<Productos> productosList;

    public Carta() {
    }

    public Carta(Integer iDCarta) {
        this.iDCarta = iDCarta;
    }

    public Integer getIDCarta() {
        return iDCarta;
    }

    public void setIDCarta(Integer iDCarta) {
        this.iDCarta = iDCarta;
    }

    public Integer getIDProductos() {
        return iDProductos;
    }

    public void setIDProductos(Integer iDProductos) {
        this.iDProductos = iDProductos;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Integer tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public EstadoProducto getIDEstadoProductos() {
        return iDEstadoProductos;
    }

    public void setIDEstadoProductos(EstadoProducto iDEstadoProductos) {
        this.iDEstadoProductos = iDEstadoProductos;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCarta != null ? iDCarta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carta)) {
            return false;
        }
        Carta other = (Carta) object;
        if ((this.iDCarta == null && other.iDCarta != null) || (this.iDCarta != null && !this.iDCarta.equals(other.iDCarta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Carta[ iDCarta=" + iDCarta + " ]";
    }
    
}
