package citamedica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import citamedica.service.PersonaService;

// El URL mapping sera manejado por el DISPACHER SERVLET
@Controller
public class MainController {

	@Autowired
	private PersonaService personaService;

	@GetMapping("/") // Esta ruta debe ser unica
	public String home() {
		return "index";
	}

}
