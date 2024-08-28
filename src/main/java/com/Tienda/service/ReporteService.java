package com.Tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {

    public ResponseEntity<Resource>
            generaReporte(String reporte,//nombre del reporte (usuarios.jasper)
                    Map<String, Object> parametros,//Username, apellido, correo ,telefono
                    String tipo)throws IOException;//Define el tipo de reporte que define el usuario, pdf,exel(xlsx),csv

}
