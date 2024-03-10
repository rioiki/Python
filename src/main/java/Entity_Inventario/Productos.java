/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity_Inventario;

import Entity_Inventario.EstadoProducto;
import Entity_Inventario.Carta;
import Entity_Inventario.Categoria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByIDProducto", query = "SELECT p FROM Productos p WHERE p.iDProducto = :iDProducto"),
    @NamedQuery(name = "Productos.findByNombreProducto", query = "SELECT p FROM Productos p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Productos.findByDescripcionProducto", query = "SELECT p FROM Productos p WHERE p.descripcionProducto = :descripcionProducto"),
    @NamedQuery(name = "Productos.findByPrecio", query = "SELECT p FROM Productos p WHERE p.precio = :precio"),
    @NamedQuery(name = "Productos.findByCantidadInventario", query = "SELECT p FROM Productos p WHERE p.cantidadInventario = :cantidadInventario")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Producto")
    private Integer iDProducto;
    @Size(max = 250)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Size(max = 250)
    @Column(name = "descripcion_producto")
    private String descripcionProducto;
    @Column(name = "precio")
    private Long precio;
    @Column(name = "cantidad_inventario")
    private Integer cantidadInventario;
    @JoinTable(name = "ordenes_compras_has_productos", joinColumns = {
        @JoinColumn(name = "productos_Producto_ID", referencedColumnName = "ID_Producto")}, inverseJoinColumns = {
        @JoinColumn(name = "ordenescompra_Orden_Compra_ID", referencedColumnName = "ID_Orden_compra")})
    @ManyToMany
    private List<OrdenesCompra> ordenesCompraList;
    @OneToMany(mappedBy = "iDProductoid")
    private List<Historialinventario> historialinventarioList;
    @OneToMany(mappedBy = "iDProductoid")
    private List<Inventario> inventarioList;
    @JoinColumn(name = "ID_carta_id", referencedColumnName = "ID_Carta")
    @ManyToOne
    private Carta iDcartaid;
    @JoinColumn(name = "ID_Categoriaid", referencedColumnName = "ID_Categoria")
    @ManyToOne
    private Categoria iDCategoriaid;
    @JoinColumn(name = "ID_Estado_producto", referencedColumnName = "ID_Estado_producto")
    @ManyToOne
    private EstadoProducto iDEstadoproducto;

    public Productos() {
    }

    public Productos(Integer iDProducto) {
        this.iDProducto = iDProducto;
    }

    public Integer getIDProducto() {
        return iDProducto;
    }

    public void setIDProducto(Integer iDProducto) {
        this.iDProducto = iDProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public Integer getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(Integer cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    @XmlTransient
    public List<OrdenesCompra> getOrdenesCompraList() {
        return ordenesCompraList;
    }

    public void setOrdenesCompraList(List<OrdenesCompra> ordenesCompraList) {
        this.ordenesCompraList = ordenesCompraList;
    }

    @XmlTransient
    public List<Historialinventario> getHistorialinventarioList() {
        return historialinventarioList;
    }

    public void setHistorialinventarioList(List<Historialinventario> historialinventarioList) {
        this.historialinventarioList = historialinventarioList;
    }

    @XmlTransient
    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    public Carta getIDcartaid() {
        return iDcartaid;
    }

    public void setIDcartaid(Carta iDcartaid) {
        this.iDcartaid = iDcartaid;
    }

    public Categoria getIDCategoriaid() {
        return iDCategoriaid;
    }

    public void setIDCategoriaid(Categoria iDCategoriaid) {
        this.iDCategoriaid = iDCategoriaid;
    }

    public EstadoProducto getIDEstadoproducto() {
        return iDEstadoproducto;
    }

    public void setIDEstadoproducto(EstadoProducto iDEstadoproducto) {
        this.iDEstadoproducto = iDEstadoproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDProducto != null ? iDProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.iDProducto == null && other.iDProducto != null) || (this.iDProducto != null && !this.iDProducto.equals(other.iDProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Productos[ iDProducto=" + iDProducto + " ]";
    }
    
}
