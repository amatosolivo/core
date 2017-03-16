package citamedica.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import citamedica.dao.PersonaRepository;
import citamedica.model.Persona;


@Service
@Transactional
public class PersonaService {

	private final PersonaRepository personaRepository;

	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	public List<Persona> findAll(){
		List<Persona> personas = new ArrayList<Persona>();
		for(Persona p : personaRepository.findAll()) {
			personas.add(p);
		}
		return personas;
	}

	public void guardar(Persona persona) {
		personaRepository.save(persona);
	}

	public Persona buscar(int id) {
		return personaRepository.findOne(id);
	}

	public void borrar(int id){
		personaRepository.delete(id);
	}
}
