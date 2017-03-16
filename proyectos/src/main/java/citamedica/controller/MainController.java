package citamedica.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import citamedica.model.Persona;
import citamedica.service.PersonaService;

// El URL mapping sera manejado por el DISPACHER SERVLET
@Controller
public class MainController {

	@Autowired
	private PersonaService personaService;

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}

	@GetMapping("/todasPersonas")
	public String allPersonas(HttpServletRequest request) {
		request.setAttribute("personas", personaService.findAll());
		request.setAttribute("mode", "MODE_PERSONAS");
		return "index";
	}

	@GetMapping("/nuevaPersona")
	public String nuevaPersona(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}

	@PostMapping("/guardarPersona")
	public String guardarPersona(@ModelAttribute Persona persona, BindingResult bindingResult, HttpServletRequest request) {
		persona.setRegistrado(new Date());
		personaService.guardar(persona);
		request.setAttribute("personas", personaService.findAll());
		request.setAttribute("mode", "MODE_PERSONAS");
		return "index";
	}


	@GetMapping("/actualizaPersona")
	public String actualizaPersona(@RequestParam int id, HttpServletRequest request) {
		request.setAttribute("persona", personaService.buscar(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}

	@GetMapping("/borrarPersona")
	public String borrarPersona(@RequestParam int id, HttpServletRequest request) {
		personaService.borrar(id);
		request.setAttribute("personas", personaService.findAll());
		request.setAttribute("mode", "MODE_PERSONAS");
		return "index";
	}

}
