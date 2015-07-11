package pe.uni.fiis.contavicola.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;
import pe.uni.fiis.contavicola.bean.Cliente;
import pe.uni.fiis.contavicola.dao.ClienteDAO;

import javax.sql.DataSource;

/**
 * Created by JOSE on 20/06/2015.
 */
public class ClienteDaoImpl implements ClienteDAO{
    DataSource datasource;

    JdbcTemplate jdbcTemplate = new JdbcTemplate();


    public Cliente registrarCliente(Cliente cliente) {
       String sql= "insert into Cliente(idCliente,tipoId,nombreCliente,usuariCreacion,fechaCreacion,usuarioModificacion,fechaModificacion) value(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,new Object[]{cliente.getIdCliente(),cliente.getTipoId(),cliente.getNombreCliente(),cliente.getUsuarioCreacion(),cliente.getFechaCreacion(),cliente.getUsuarioModificacion(),cliente.getFechaModificacion()});
        return cliente;
    }
}
