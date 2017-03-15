package citamedica.dao;

import org.springframework.data.repository.CrudRepository;

import citamedica.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

}
