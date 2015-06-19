package pe.uni.fiis.contavicola.bean;

/**
 * Created by JOSE on 18/06/2015.
 */
public class Operacion {
    private Integer idOperacion;
    private String tipoOperacion;
    private Float montoOperacion;
    private String tipoMovimiento;

    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Float getMontoOperacion() {
        return montoOperacion;
    }

    public void setMontoOperacion(Float montoOperacion) {
        this.montoOperacion = montoOperacion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
}
