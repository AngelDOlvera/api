package med.Angel.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.Angel.api.domain.consulta.AgendaDeConsultaService;
import med.Angel.api.domain.consulta.DatosAgendarConsulta;
import med.Angel.api.domain.consulta.DatosDetalleConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping ("/consultas")
public class ConsultaController {
    @Autowired
    private AgendaDeConsultaService service;
    @PostMapping
    @Transactional
    public ResponseEntity agendar (@RequestBody @Valid DatosAgendarConsulta datos){
        service.agendar(datos);
        return  ResponseEntity.ok(new DatosDetalleConsulta(null, null, null, null));

    }

}
