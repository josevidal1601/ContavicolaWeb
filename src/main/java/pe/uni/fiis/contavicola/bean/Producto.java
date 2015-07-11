package pe.uni.fiis.contavicola.bean;

import java.util.Date;

/**
 * Created by JOSE on 18/06/2015.
 */
public class Producto {
    private String nombreProducto;
    private Integer idProducto;
    private Boolean estadoProducto;
    private Float precioMayor;
    private Float precioMenor;
    private Float cantidadMinimaMayor;
    private String usuarioCreacion;
    private java.util.Date fechaCreacion;
    private String usuarioModificacion;
    private java.util.Date fechaModificacion;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Float getCantidadMinimaMayor() {
        return cantidadMinimaMayor;
    }

    public void setCantidadMinimaMayor(Float cantidadMinimaMayor) {
        this.cantidadMinimaMayor = cantidadMinimaMayor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Float getPrecioMenor() {
        return precioMenor;
    }

    public void setPrecioMenor(Float precioMenor) {
        this.precioMenor = precioMenor;
    }

    public Float getPrecioMayor() {
        return precioMayor;
    }

    public void setPrecioMayor(Float precioMayor) {
        this.precioMayor = precioMayor;
    }

    public Boolean getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Boolean estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
