package TP_48938.controllers;


import TP_48938.entities.Domicilio;
import TP_48938.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")

public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
