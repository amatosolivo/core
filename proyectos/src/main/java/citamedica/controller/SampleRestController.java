package citamedica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import citamedica.service.PersonaService;

@RestController
public class SampleRestController {

	@Autowired
	private PersonaService personaService;

	@GetMapping("/saludo")
	public String saludar() {
		return "Hola mundo!";
	}
//
//	@GetMapping("/getAllPersonas")
//	public String getAllPersonas() {
//		return personaService.findAll().toString();
//	}
//
//	@GetMapping("/guardarPersona")
//	public String guardarPersona(@RequestParam String nombre, @RequestParam String apellido, @RequestParam boolean activo){
//		Persona persona = new Persona(nombre, apellido, null, activo, new Date());
//		personaService.guardar(persona);
//		return "Guardado!!!";
//	}
//
//	@GetMapping("/borrarPersona")
//	public String borrarPersona(@RequestParam int id){
//		personaService.borrar(id);
//		return "Borrado!!!";
//	}
}
