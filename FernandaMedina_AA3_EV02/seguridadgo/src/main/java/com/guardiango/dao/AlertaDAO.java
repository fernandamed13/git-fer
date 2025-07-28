package com.guardiango.dao;

import com.guardiango.model.Alerta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AlertaDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Obtener todas las alertas desde MySQL
    public List<Alerta> obtenerTodas() {
        String sql = "SELECT * FROM alertas";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Alerta(
                        rs.getInt("id"),
                        rs.getString("descripcion"),
                        rs.getString("placa"),
                        rs.getString("fecha")
                ));
    }

    // Guardar nueva alerta en MySQL
    public void guardar(Alerta alerta) {
        String sql = "INSERT INTO alertas (descripcion, placa, fecha) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, alerta.getDescripcion(), alerta.getPlaca(), alerta.getFecha());
    }
}
