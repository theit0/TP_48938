package TP_48938.controllers;

import TP_48938.entities.Localidad;
import TP_48938.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadController extends  BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
