package repositorio;

import java.util.List;

import contratos.DomiciliosDo;
import entidades.BarrioParajeSector;
import entidades.Calle;
import entidades.Capital;
import entidades.DistritoMunicipal;
import entidades.MacroRegion;
import entidades.Municipio;
import entidades.Provincia;
import entidades.Region;
import entidades.Seccion;
import entidades.SubBarrioParajeSector;
import entidades.TipoCalle;

public class DomiciliosDoRepoMoc implements DomiciliosDo {

	public void Adicionar(MacroRegion macroRegion) {
		Calle calle = new Calle();
		
		calle.setTipoCalle(TipoCalle.CARRETERA);
		calle.setNombre("Mella");
		calle.setSubBarrioParajeSector("NoDefinido");
		calle.setBarrioParajeSector("El Almendro");
		
		
 
		// TODO Como decir que la calle es de un SubBarrio		
	}

	public boolean Borrar(int domicilioId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Actualizar(MacroRegion macroRegion) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Region> getRegionesPorMacroRegion(MacroRegion macroRegion) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Provincia> getProvinciasPorRegion(Region region) {
		// TODO Auto-generated method stub
		return null;
	}

	public Capital getCapitalProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Municipio> getMunicipiosProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DistritoMunicipal> getDistritosMunicipalesMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Seccion> getSeccionesDistritoMunicipal(DistritoMunicipal distritoMunicipal) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BarrioParajeSector> getBarrioParajeSectorPorSeccion(Seccion seccion) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SubBarrioParajeSector> getSubBarriosParajesSectoresPorBarrioParajeSector(
			BarrioParajeSector barrioParajeSector) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> void Adicionar() {
		// TODO Auto-generated method stub
		
	}

	public <T> boolean Actualizar() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
